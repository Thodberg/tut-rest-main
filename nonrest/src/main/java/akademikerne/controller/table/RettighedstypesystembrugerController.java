package akademikerne.controller.table;


import akademikerne.AkademikerneApplication;
import akademikerne.controller.UtilController;
import akademikerne.domain.table.Rettighedstypesystembruger;
import akademikerne.domain.view.Brugereview;
import akademikerne.domain.view.Rettighedstypesystembrugerview;
import akademikerne.domain.view.Rollebrugersystemrettighedview;
import akademikerne.exception.NotFoundException;
import akademikerne.repository.table.RettighedstypesystembrugerRepository;
import akademikerne.repository.view.BrugereviewRepository;
import akademikerne.repository.view.RettighedstypesystembrugerviewRepository;
import akademikerne.repository.view.RettighedstypesystemviewRepository;
import akademikerne.repository.view.RollebrugersystemrettighedviewRepository;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
class RettighedstypesystembrugerController {

    private final RettighedstypesystembrugerRepository rettighedstypesystembrugerRepository;
    private final RettighedstypesystembrugerviewRepository rettighedstypesystembrugerviewRepository;
    private final RettighedstypesystemviewRepository rettighedstypesystemviewRepository;
    private final BrugereviewRepository brugereviewRepository;
    private final RollebrugersystemrettighedviewRepository rollebrugersystemrettighedviewRepository;


    RettighedstypesystembrugerController(RettighedstypesystembrugerRepository rettighedstypesystembrugerRepository,
                                         RettighedstypesystembrugerviewRepository rettighedstypesystembrugerviewRepository,
                                         RettighedstypesystemviewRepository rettighedstypesystemviewRepository,
                                         BrugereviewRepository brugereviewRepository,
                                         RollebrugersystemrettighedviewRepository rollebrugersystemrettighedviewRepository
                                         ) {
        this.rettighedstypesystembrugerRepository = rettighedstypesystembrugerRepository;
        this.rettighedstypesystembrugerviewRepository = rettighedstypesystembrugerviewRepository;
        this.rettighedstypesystemviewRepository = rettighedstypesystemviewRepository;
        this.brugereviewRepository = brugereviewRepository;
        this.rollebrugersystemrettighedviewRepository = rollebrugersystemrettighedviewRepository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rettighedstypesystembruger")
    List<Rettighedstypesystembruger> all() {
        return rettighedstypesystembrugerRepository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/rettighedstypesystembruger")
    Rettighedstypesystembruger newRettighedstypesystembruger(@RequestBody Rettighedstypesystembruger newRettighedstypesystembruger) {
        return rettighedstypesystembrugerRepository.save(newRettighedstypesystembruger);
    }

    @PostMapping("/rettighedstypesystembruger/afdelinger/opret")
    Rettighedstypesystembruger opretAfdelingerRettighedstypesystembruger(@RequestBody Rettighedstypesystembrugerview newRettighedstypesystembrugerview) {

        boolean newbrugerValidated = validateUserOpretBruger(newRettighedstypesystembrugerview);
        if(!newbrugerValidated) return null;

        Integer logedinUser = AkademikerneApplication.getPrincipalUser().getBrugerid();

        Rettighedstypesystembruger newRettighedstypesystembruger = new Rettighedstypesystembruger();
        newRettighedstypesystembruger.setRettighedstypesystemid(newRettighedstypesystembrugerview.getRettighedstypesystemid());



        return rettighedstypesystembrugerRepository.save(newRettighedstypesystembruger);
    }



    @PostMapping("/rettighedstypesystembruger/revider")
    Rettighedstypesystembruger reviderARettighedstypesystembruger(@RequestBody Rettighedstypesystembrugerview rettighedstypesystembrugerview) {

        if(!validateUserEditBruger(rettighedstypesystembrugerview)) return null;
        Rettighedstypesystembruger rettighedstypesystembruger = getRettighedstypesystembruger(rettighedstypesystembrugerview);
        rettighedstypesystembruger.setRevideretafid(AkademikerneApplication.getPrincipalUser().getBrugerid());
        Date revDate = new Date(System.currentTimeMillis());
        rettighedstypesystembruger.setRevideretdato(revDate);
        if(!rettighedstypesystembruger.getNaesterevideringsdato().equals(null))
            rettighedstypesystembruger.setNaesterevideringsdato( new Date(revDate.getTime() + 3600 * 1000 * 24 * 30 * rettighedstypesystembrugerview.getRevideringsfrekvens()));
        else if (rettighedstypesystembruger.getNaesterevideringsdato().equals(null)) {
            rettighedstypesystembruger.setNaesterevideringsdato(new Date( 3600 * 1000 * 24 * 30 * rettighedstypesystembrugerview.getRevideringsfrekvens() + System.currentTimeMillis()));
        }

        return rettighedstypesystembrugerRepository.save(rettighedstypesystembruger);

    }

    @PostMapping("/rettighedstypesystembruger/afslut")
    Rettighedstypesystembruger afslutRettighedstypesystembruger(@RequestBody Rettighedstypesystembrugerview rettighedstypesystembrugerview) {

        if(!validateUserEditBruger(rettighedstypesystembrugerview)) return null;
        Rettighedstypesystembruger rettighedstypesystembruger = getRettighedstypesystembruger(rettighedstypesystembrugerview);
        rettighedstypesystembruger.setAfsluttetafid(AkademikerneApplication.getPrincipalUser().getBrugerid());
        rettighedstypesystembruger.setAfsluttetdato(new Date(System.currentTimeMillis()));
        return rettighedstypesystembrugerRepository.save(rettighedstypesystembruger);

    }

    /** private boolean validateUserOpretBruger(Rettighedstypesystembrugerview rettighedstypesystembrugerview) {

     Integer logedinUserid = AkademikerneApplication.getPrincipalUser().getBrugerid();

     Integer brugerid = rettighedstypesystembrugerview.getBrugerid();
     Optional<Brugereview> brugerFound = brugereviewRepository.findById(brugerid);
     if(brugerFound.isEmpty()) {
     return false;
     }
     boolean afdelingslederForBruger = false;
     if(brugerFound.get().getAfdelingslederid() == logedinUserid)
     afdelingslederForBruger = true;


     boolean ErSystemEjer = false;
     Optional<Rettighedstypesystemview> rettighedstypesystemFound =
     rettighedstypesystemviewRepository.findById(rettighedstypesystembrugerview.getRettighedstypesystemid());
     if(rettighedstypesystemFound.get().get)


     /**if(!(rettighedstypesystembrugerviewFound.get().getAfdelingslederid() == logedinUser ||
     (rettighedstypesystembrugerviewFound.get().getRolleindehaverid() == logedinUser &&
     rettighedstypesystembrugerviewFound.get().getRollenavn() == "Systemejer")))
     return false;**/



    //}**//



    private Rettighedstypesystembruger getRettighedstypesystembruger(Rettighedstypesystembrugerview rettighedstypesystembrugerview) {
        Integer id = rettighedstypesystembrugerview.getRettighedstypesystembrugerId();
        Optional<Rettighedstypesystembruger> rettighedstypesystembrugerFound = this.rettighedstypesystembrugerRepository.findById(id);
        return rettighedstypesystembrugerFound.get();
    }

    private boolean validateUserOpretBruger(Rettighedstypesystembrugerview rettighedstypesystembrugerview) {

        Integer brugerid = rettighedstypesystembrugerview.getBrugerid();
        Optional<Brugereview> brugereviewFound = this.brugereviewRepository.findById(brugerid);
        if(!brugereviewFound.isPresent()) {
            return false;
        }
        Integer logedinUser = AkademikerneApplication.getPrincipalUser().getBrugerid();
        boolean afdelingslederIdentical = brugereviewFound.get().getAfdelingslederid() == logedinUser;

        List<Rollebrugersystemrettighedview> rollebrugersystemrettighedview = this.rollebrugersystemrettighedviewRepository.
        findAllByRollenavnAndRettighedstypesystemidEqualsAndRolleindehaveridEquals
                (UtilController.SYSTEM_EJER, rettighedstypesystembrugerview.getRettighedstypesystemid(), logedinUser  );
        boolean isSystemEjer = false;
        if(rollebrugersystemrettighedview.isEmpty()) {
            isSystemEjer = false;
        } else {
            isSystemEjer = true;
        }

        if(isSystemEjer || afdelingslederIdentical)
            return true;
        else {
            return false;
        }

    }

    
    private boolean validateUserEditBruger(Rettighedstypesystembrugerview rettighedstypesystembrugerview) {

        Integer id = rettighedstypesystembrugerview.getRettighedstypesystembrugerId();
        Optional<Rettighedstypesystembrugerview> rettighedstypesystembrugerviewFound = this.rettighedstypesystembrugerviewRepository.findById(id);
        if(!rettighedstypesystembrugerviewFound.isPresent()) {
            return false;
        }

        Integer logedinUser = AkademikerneApplication.getPrincipalUser().getBrugerid();

        if(!(rettighedstypesystembrugerviewFound.get().getAfdelingslederid() == logedinUser ||
                (rettighedstypesystembrugerviewFound.get().getRolleindehaverid() == logedinUser &&
                        rettighedstypesystembrugerviewFound.get().getRollenavn() == "Systemejer")))
            return false;

        return true;

    }




    // Single item
    @PostMapping("/rettighedstypesystembruger/afdelinger/afslut")
    Rettighedstypesystembruger afslutAfdelingerRettighedstypesystembruger(@RequestBody Rettighedstypesystembruger newRettighedstypesystembruger) {
        return rettighedstypesystembrugerRepository.save(newRettighedstypesystembruger);
    }

    @GetMapping("/rettighedstypesystembruger/{id}")
    Rettighedstypesystembruger one(@PathVariable Integer id) {

        return rettighedstypesystembrugerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(id, "Rettighedstypesystembruger"));
    }



    @DeleteMapping("/rettighedstypesystembruger/{id}")
    void deleteRettighedstypesystembruger(@PathVariable Integer id) {
        rettighedstypesystembrugerRepository.deleteById(id);
    }


    /**
     is searching in all the string fields of the entity and in case a string variable
     * has the value "", the field will be ignored during the search
     * This makes this aearch function very flexible
     * @param rettetaf
     * @param revideretaf
     * @param oprettetaf
     * @param Afsluttetaf
     * @return
     */
    /*@GetMapping("/rettighedstypesystembruger/stringsearch")
    public List<Rettighedstypesystembruger> getRettighedstypesystembrugerbyStrings(@RequestParam String rettetaf, @RequestParam String revideretaf,
                                             @RequestParam String oprettetaf, @RequestParam String  Afsluttetaf) {
        return rettighedstypesystembrugerRepository.findAllByRettetafIsContainingIgnoreCaseAndOprettetafIsContainingIgnoreCaseAndRevideretafContainingIgnoreCaseAndAfsluttetafIsContainingIgnoreCase
                (rettetaf, oprettetaf,revideretaf,Afsluttetaf);

    }*/



}



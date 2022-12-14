package akademikerne.controller.view;

import akademikerne.AkademikerneApplication;
import akademikerne.controller.UtilController;
import akademikerne.domain.view.Rettighedstypesystembrugerview;
import akademikerne.repository.view.RettighedstypesystembrugerviewRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;
@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
public class RettighedstypesystembrugerviewController {

    private final RettighedstypesystembrugerviewRepository rettighedstypesystembrugerviewRepository;

    RettighedstypesystembrugerviewController(RettighedstypesystembrugerviewRepository repository) {
        this.rettighedstypesystembrugerviewRepository = repository;

    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rettighedstypesystembrugerview/active")
    List<Rettighedstypesystembrugerview> allActive() {
        Date rightNow = new Date(System.currentTimeMillis());

        return rettighedstypesystembrugerviewRepository.findAllByAfsluttetdatoIsNullOrAfsluttetdatoAfter(rightNow);
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rettighedstypesystembrugerview")
    List<Rettighedstypesystembrugerview> all() {
        Date rightNow = new Date(System.currentTimeMillis());

        return rettighedstypesystembrugerviewRepository.findAll();
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rettighedstypesystembrugerview/history")
    List<Rettighedstypesystembrugerview> allHistory() {
        Date rightNow = new Date(System.currentTimeMillis());
        return rettighedstypesystembrugerviewRepository.findAllByAfsluttetdatoBefore(rightNow);
    }



    @GetMapping("/rettighedstypesystembrugerview/afdelingsleder/active")
    List<Rettighedstypesystembrugerview> afdelingslederAllActive() {

        Integer  afdelingslederid = AkademikerneApplication.getPrincipalUser().getBrugerid();

        String rollenavn = UtilController.SYSTEM_EJER;
        System.out.println("hallo fra AfdelingslederAllActive()");
        System.out.println("afdelingsleder:" + afdelingslederid +" rollenavn: " + rollenavn);

        Date rightNow = new Date(System.currentTimeMillis());

        return rettighedstypesystembrugerviewRepository.
                findAllByAfdelingslederidEqualsAndRollenavnEqualsAndAfsluttetdatoIsNullOrAfsluttetdatoAfter
                        ( afdelingslederid, rollenavn, rightNow);

    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rettighedstypesystembrugerview/afdelingsleder")
    List<Rettighedstypesystembrugerview> AfdelingslederAll() {

        Integer  afdelingslederid = AkademikerneApplication.getPrincipalUser().getBrugerid();
        String rollenavn = UtilController.SYSTEM_EJER;
        System.out.println("hallo fra AfdelingslederAll()");
        System.out.println("afdelingsleder:" + afdelingslederid +" rollenavn: " + rollenavn);

        return rettighedstypesystembrugerviewRepository.
                findAllByAfdelingslederidEqualsAndRollenavnEquals
                        (afdelingslederid, rollenavn);
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rettighedstypesystembrugerview/afdelingsleder/history")
    List<Rettighedstypesystembrugerview> AfdelingslederAllHistory() {

        Integer  afdelingslederid = AkademikerneApplication.getPrincipalUser().getBrugerid();
        String rollenavn = UtilController.SYSTEM_EJER;
        System.out.println("hallo fra AfdelingslederAllHistory()");
        System.out.println("afdelingsleder:" + afdelingslederid +" rollenavn: " + rollenavn);

        Date rightNow = new Date(System.currentTimeMillis());
        return rettighedstypesystembrugerviewRepository.
                findAllByAfsluttetdatoBeforeAndAfdelingslederidEqualsAndRollenavnEquals
                        (rightNow, afdelingslederid, rollenavn);

    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rettighedstypesystembrugerview/systemejer/active")
    List<Rettighedstypesystembrugerview> systemejerAllActive() {

        Integer  rolleindehaverid = AkademikerneApplication.getPrincipalUser().getBrugerid();
        String rollenavn = UtilController.SYSTEM_EJER;

        Date rightNow = new Date(System.currentTimeMillis());

        return rettighedstypesystembrugerviewRepository.
                findAllByRolleindehaveridEqualsAndRollenavnEqualsAndAfsluttetdatoIsNullOrAfsluttetdatoAfter
                        (rolleindehaverid, rollenavn, rightNow);

    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rettighedstypesystembrugerview/systemejer")
    List<Rettighedstypesystembrugerview> systemejerAll() {
        Integer  rolleindehaverid = AkademikerneApplication.getPrincipalUser().getBrugerid();
        String rollenavn = UtilController.SYSTEM_EJER;

        return rettighedstypesystembrugerviewRepository.
                findAllByRolleindehaveridEqualsAndRollenavnEquals
                        (rolleindehaverid, rollenavn);
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rettighedstypesystembrugerview/systemejer/history")
    List<Rettighedstypesystembrugerview> systemejerAllHistory() {

        Integer  rolleindehaverid = AkademikerneApplication.getPrincipalUser().getBrugerid();
        String rollenavn = UtilController.SYSTEM_EJER;

        Date rightNow = new Date(System.currentTimeMillis());
        return rettighedstypesystembrugerviewRepository.
                findAllByAfsluttetdatoBeforeAndRolleindehaveridEqualsAndRollenavnEquals
                        (rightNow, rolleindehaverid, rollenavn);
    }

    @GetMapping("/rettighedstypesystembrugerview/afdelingsleder/active/stringsearch")
    List<Rettighedstypesystembrugerview> afdelingslederAllActiveSearch(@RequestParam String brugernavn, @RequestParam String systemnavn,
                                                                       @RequestParam String rettighedsnavn) {

        Integer  afdelingslederid = AkademikerneApplication.getPrincipalUser().getBrugerid();
        String rollenavn = UtilController.SYSTEM_EJER;
        Date rightNow = new Date(System.currentTimeMillis());

        return rettighedstypesystembrugerviewRepository.
                findAllByBrugernavnContainingIgnoreCaseAndSystemnavnContainingIgnoreCaseAndRettighedsnavnContainingIgnoreCaseAndAfdelingslederidEqualsAndRollenavnEqualsAndAfsluttetdatoIsNullOrAfsluttetdatoAfter
                        (brugernavn, systemnavn, rettighedsnavn, afdelingslederid, rollenavn, rightNow );

    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rettighedstypesystembrugerview/afdelingsleder/stringsearch")
    List<Rettighedstypesystembrugerview> AfdelingslederAllSearch(@RequestParam String brugernavn, @RequestParam String systemnavn,
                                                                 @RequestParam String rettighedsnavn) {

        Integer  afdelingslederid = AkademikerneApplication.getPrincipalUser().getBrugerid();
        String rollenavn = UtilController.SYSTEM_EJER;
        return rettighedstypesystembrugerviewRepository.
                findAllByBrugernavnContainingIgnoreCaseAndSystemnavnContainingIgnoreCaseAndRettighedsnavnContainingIgnoreCaseAndAfdelingslederidEqualsAndRollenavnEquals
                        (brugernavn, systemnavn, rettighedsnavn, afdelingslederid, rollenavn);
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rettighedstypesystembrugerview/afdelingsleder/history/stringsearch")
    List<Rettighedstypesystembrugerview> AfdelingslederAllHistorySearch(@RequestParam String brugernavn, @RequestParam String systemnavn,
                                                                        @RequestParam String rettighedsnavn) {

        Integer  afdelingslederid = AkademikerneApplication.getPrincipalUser().getBrugerid();
        String rollenavn = UtilController.SYSTEM_EJER;
        Date rightNow = new Date(System.currentTimeMillis());

        return rettighedstypesystembrugerviewRepository.
                findAllByAfsluttetdatoBeforeAndBrugernavnContainingIgnoreCaseAndSystemnavnContainingIgnoreCaseAndRettighedsnavnContainingIgnoreCaseAndAfdelingslederidEqualsAndRollenavnEquals
                        (rightNow, brugernavn, systemnavn, rettighedsnavn, afdelingslederid, rollenavn);

    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rettighedstypesystembrugerview/systemejer/active/stringsearch")
    List<Rettighedstypesystembrugerview> systemejerAllActiveSearch(@RequestParam String brugernavn, @RequestParam String systemnavn,
                                                                   @RequestParam String rettighedsnavn) {

        Integer  rolleindehaverid = AkademikerneApplication.getPrincipalUser().getBrugerid();
        String rollenavn = UtilController.SYSTEM_EJER;
        Date rightNow = new Date(System.currentTimeMillis());

        return rettighedstypesystembrugerviewRepository.
                findAllByBrugernavnContainingIgnoreCaseAndSystemnavnContainingIgnoreCaseAndRettighedsnavnContainingIgnoreCaseAndRolleindehaveridEqualsAndRollenavnEqualsAndAfsluttetdatoIsNullOrAfsluttetdatoAfter
                        (brugernavn, systemnavn, rettighedsnavn, rolleindehaverid, rollenavn,rightNow);
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rettighedstypesystembrugerview/systemejer/stringsearch")
    List<Rettighedstypesystembrugerview> systemejerAllSearch(@RequestParam String brugernavn, @RequestParam String systemnavn,
                                                             @RequestParam String rettighedsnavn) {
        Integer  rolleindehaverid = AkademikerneApplication.getPrincipalUser().getBrugerid();
        String rollenavn = UtilController.SYSTEM_EJER;

        return rettighedstypesystembrugerviewRepository.
                findAllByBrugernavnContainingIgnoreCaseAndSystemnavnContainingIgnoreCaseAndRettighedsnavnContainingIgnoreCaseAndRolleindehaveridEqualsAndRollenavnEquals
                        (brugernavn, systemnavn, rettighedsnavn, rolleindehaverid, rollenavn);
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rettighedstypesystembrugerview/systemejer/history/stringsearch")
    List<Rettighedstypesystembrugerview> systemejerAllHistorySearch(@RequestParam String brugernavn, @RequestParam String systemnavn,
                                                                    @RequestParam String rettighedsnavn) {

        Integer  rolleindehaverid = AkademikerneApplication.getPrincipalUser().getBrugerid();
        String rollenavn = UtilController.SYSTEM_EJER;
        Date rightNow = new Date(System.currentTimeMillis());

        return rettighedstypesystembrugerviewRepository.
                findAllByAfsluttetdatoBeforeAndBrugernavnContainingIgnoreCaseAndSystemnavnContainingIgnoreCaseAndRettighedsnavnContainingIgnoreCaseAndRolleindehaveridEqualsAndRollenavnEquals
                        (rightNow,brugernavn, systemnavn, rettighedsnavn, rolleindehaverid, rollenavn);
    }



}

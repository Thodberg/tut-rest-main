package akademikerne.controller.table;


import akademikerne.controller.UtilController;
import akademikerne.domain.table.Rettighedstypesystem;
import akademikerne.exception.NotFoundException;
import akademikerne.repository.table.RettighedstypesystemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
class RettighedstypesystemController {

    private final RettighedstypesystemRepository rettighedstypesystemRepository;

    RettighedstypesystemController(RettighedstypesystemRepository rettighedstypesystemRepository) {
        this.rettighedstypesystemRepository = rettighedstypesystemRepository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rettighedstypesystem")
    List<Rettighedstypesystem> all() {
        return rettighedstypesystemRepository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/rettighedstypesystem")
    Rettighedstypesystem newRettighedstypesystem(@RequestBody Rettighedstypesystem newRettighedstypesystem) {
        return rettighedstypesystemRepository.save(newRettighedstypesystem);
    }

    // Single item

    @GetMapping("/rettighedstypesystem/{id}")
    Rettighedstypesystem one(@PathVariable Integer id) {

        return rettighedstypesystemRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(id, "Rettighedstypesystem"));
    }



    @DeleteMapping("/rettighedstypesystem/{id}")
    void deleteRettighedstypesystem(@PathVariable Integer id) {
        rettighedstypesystemRepository.deleteById(id);
    }

    /**
     * is searching in all the string fields of the entity and in case a string variable
     * has the value "", the field will be ignored during the search
     * This makes this aearch function very flexible
     * @param rettetaf
     * @param oprettetaf
     * @param Afsluttetaf
     * @return
     */
    /*@GetMapping("/rettighedstypesystem/stringsearch")
    public List<Rettighedstypesystem> getBrugerebyStrings(@RequestParam String rettetaf,
                                             @RequestParam String oprettetaf, @RequestParam String  Afsluttetaf) {
        return  rettighedstypesystemRepository.findAllByRettetafIsContainingIgnoreCaseAndOprettetafIsContainingIgnoreCaseAndAfsluttetafIsContainingIgnoreCase
                (rettetaf, oprettetaf,Afsluttetaf);

    }*/

}



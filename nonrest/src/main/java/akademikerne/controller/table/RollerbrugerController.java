package akademikerne.controller.table;


import akademikerne.controller.UtilController;
import akademikerne.domain.table.Rollerbruger;
import akademikerne.exception.NotFoundException;
import akademikerne.repository.table.RollerbrugerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
class RollerbrugerController {

    private final RollerbrugerRepository rollerbrugerRepository;

    RollerbrugerController(RollerbrugerRepository rollerbrugerRepository) {
        this.rollerbrugerRepository = rollerbrugerRepository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rollerbruger")
    List<Rollerbruger> all() {
        return rollerbrugerRepository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/rollerbruger")
    Rollerbruger newRollerbruger(@RequestBody Rollerbruger newRollerbruger) {
        return rollerbrugerRepository.save(newRollerbruger);
    }

    // Single item

    @GetMapping("/rollerbruger/{id}")
    Rollerbruger one(@PathVariable Integer id) {

        return rollerbrugerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(id, "Rollerbruger"));
    }



    @DeleteMapping("/rollerbruger/{id}")
    void deleteRollerbruger(@PathVariable Integer id) {
        rollerbrugerRepository.deleteById(id);
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
    /*@GetMapping("/rollerbruger/stringsearch")
    public List<Rollerbruger> getBrugerebyStrings(@RequestParam String rettetaf,
                                             @RequestParam String oprettetaf, @RequestParam String  Afsluttetaf) {
        return   rollerbrugerRepository.findAllByRettetafIsContainingIgnoreCaseAndOprettetafIsContainingIgnoreCaseAndAfsluttetafIsContainingIgnoreCase
                ( rettetaf, oprettetaf,Afsluttetaf);

    }*/

}



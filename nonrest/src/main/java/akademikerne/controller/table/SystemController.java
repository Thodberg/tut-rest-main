package akademikerne.controller.table;


import akademikerne.controller.UtilController;
import akademikerne.domain.table.System2;
import akademikerne.exception.NotFoundException;
import akademikerne.repository.table.SystemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
class SystemController {

    private final SystemRepository systemRepository;

    SystemController(SystemRepository systemRepository) {
        this.systemRepository = systemRepository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/system")
    List<System2> all() {
        return systemRepository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/system")
    System2 newSystem(@RequestBody System2 newSystem) {
        return systemRepository.save(newSystem);
    }

    // Single item

    @GetMapping("/system/{id}")
    System2 one(@PathVariable Integer id) {

        return systemRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(id, "System"));
    }

    @DeleteMapping("/system/{id}")
    void deleteSystem(@PathVariable Integer id) {
        systemRepository.deleteById(id);
    }

    /**
     * is searching in all the string fields of the entity and in case a string variable
     * has the value "", the field will be ignored during the search
     * This makes this aearch function very flexible
     * @param systemnavn
     * @param rettetaf
     * @param oprettetaf
     * @param Afsluttetaf
     * @return
     */
    /*@GetMapping("/system/stringsearch")
    public List<System2> getBrugerebyStrings(@RequestParam String systemnavn, @RequestParam String rettetaf,
                                             @RequestParam String oprettetaf, @RequestParam String  Afsluttetaf) {
        return  systemRepository.findAllBySystemnavnIsContainingIgnoreCaseAndRettetafIsContainingIgnoreCaseAndOprettetafIsContainingIgnoreCaseAndAfsluttetafIsContainingIgnoreCase
                (systemnavn, rettetaf, oprettetaf,Afsluttetaf);

    }*/

}



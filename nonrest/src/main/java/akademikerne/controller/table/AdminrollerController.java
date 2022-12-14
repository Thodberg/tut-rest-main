package akademikerne.controller.table;


import akademikerne.controller.UtilController;
import akademikerne.domain.table.Adminroller;
import akademikerne.exception.NotFoundException;
import akademikerne.repository.table.AdminrollerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
class AdminrollerController {

    private final AdminrollerRepository adminrollerrepository;

    AdminrollerController(AdminrollerRepository adminrollerrepository) {
        this.adminrollerrepository = adminrollerrepository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/adminroller")
    List<Adminroller> all() {
        return adminrollerrepository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/adminroller")
    Adminroller newAdminRoller(@RequestBody Adminroller newAdminroller) {
        return adminrollerrepository.save(newAdminroller);
    }

    // Single item

    @GetMapping("/adminroller/{id}")
    Adminroller one(@PathVariable Integer id) {
        return adminrollerrepository.findById(id)
                .orElseThrow(() -> new NotFoundException(id, "AdminRoller"));
    }

    @DeleteMapping("/adminrollers/{id}")
    void deleteAdminRoller(@PathVariable Integer id) {
        adminrollerrepository.deleteById(id);
    }

    /** is searching in all the string fields of the entity and in case a string variable
     * has the value "", the field will be ignored during the search
     * This makes this aearch function very flexible
     * @param rollenavn
     * @param rettetAf
     * @param oprettetAf
     * @param Afsluttetaf
     * @return
     */
    /*@GetMapping("/adminroller/stringsearch")
    public List<Adminroller> getAfdelingbyStrings(@RequestParam String rollenavn, @RequestParam String rettetAf,
                                                 @RequestParam String oprettetAf, @RequestParam String  Afsluttetaf) {
        return adminrollerrepository.findAllByRollenavnIsContainingIgnoreCaseAndRettetafIsContainingIgnoreCaseAndOprettetafIsContainingIgnoreCaseAndAfsluttetafIsContainingIgnoreCase
                        (rollenavn, rettetAf, oprettetAf,Afsluttetaf);

    }*/



}


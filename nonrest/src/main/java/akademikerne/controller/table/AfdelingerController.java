package akademikerne.controller.table;


import akademikerne.controller.UtilController;
import akademikerne.domain.table.Afdelinger;
import akademikerne.exception.NotFoundException;
import akademikerne.repository.table.AfdelingerRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
class AfdelingerController {

    private final AfdelingerRepository afdelingerRepository;

    AfdelingerController(AfdelingerRepository afdelingerRepository) {
        this.afdelingerRepository = afdelingerRepository;

    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/afdelinger")
    List<Afdelinger> all() {
        //return afdelingerRepository.findAll("");
        return afdelingerRepository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/afdelinger")
    Afdelinger newAfdelinger(@RequestBody Afdelinger newAfdelinger) {
        return afdelingerRepository.save(newAfdelinger);
    }

    // Single item

    @GetMapping("/afdelinger/{id}")
    Afdelinger one(@PathVariable Integer id) {

        return afdelingerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(id, "Afdelinger"));
    }

    @DeleteMapping("/afdelinger/{id}")
    void deleteAfdelinger(@PathVariable Integer id) {
        afdelingerRepository.deleteById(id);
    }

    /**
     * is searching in all the string fields of the entity and in case a string variable
     * has the value "", the field will be ignored during the search
     * This makes this aearch function very flexible
     * @param afdelingsNavn
     * @param rettetAf
     * @param oprettetAf
     * @param Afsluttetaf
     * @return
     */
    /*@GetMapping("/afdelinger/stringsearch")
    public List<Afdelinger> getAfdelingbyStrings(@RequestParam String afdelingsNavn, @RequestParam String rettetAf,
                                                  @RequestParam String oprettetAf, @RequestParam String  Afsluttetaf) {
        return afdelingerRepository.
                findAllByAfdelingsnavnIsContainingIgnoreCaseAndRettetafIsContainingIgnoreCaseAndOprettetafIsContainingIgnoreCaseAndAfsluttetafIsContainingIgnoreCase
                (afdelingsNavn, rettetAf, oprettetAf,Afsluttetaf);

    }*/



}



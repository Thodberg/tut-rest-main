package akademikerne.controller.table;


import akademikerne.controller.UtilController;
import akademikerne.domain.table.Titler;
import akademikerne.exception.NotFoundException;
import akademikerne.repository.table.TitlerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
class TitlerController {

    private final TitlerRepository titlerRepository;

    TitlerController(TitlerRepository repository) {
        this.titlerRepository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/titel")
    ResponseEntity all() {
        //System.out.println("hallo hallo ");
        List<Titler> titler = titlerRepository.findAll();
        return new ResponseEntity<>(titler, HttpStatus.ACCEPTED);
    }
    // end::get-aggregate-root[]

    @PostMapping("/titel")
    Titler newTitler(@RequestBody Titler newTitler) {
        return titlerRepository.save(newTitler);
    }

    // Single item

    @GetMapping("/titel/{id}")
    Titler one(@PathVariable Integer id) {

        return titlerRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(id, "Titler"));
    }

    @DeleteMapping("/titel/{id}")
    void deleteTitler(@PathVariable Integer id) {
        System.out.println("deleteTitler blev kaldt med id = " +id);
        titlerRepository.deleteById(id);
    }

    /**
     * is searching in all the string fields of the entity and in case a string variable
     * has the value "", the field will be ignored during the search
     * This makes this aearch function very flexible
     * @param titelnavn
     * @return
     */
    /*@GetMapping("/titel/stringsearch")
    public List<Titler> getBrugerebyStrings(@RequestParam String titelnavn) {
        System.out.println("getBrugerebyStrings blev kaldt med titelnavn = " + titelnavn);
        return titlerRepository.findAllByTitelnavnIsContainingIgnoreCase(titelnavn);

    }*/
}




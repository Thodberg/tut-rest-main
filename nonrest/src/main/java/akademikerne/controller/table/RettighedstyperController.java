package akademikerne.controller.table;

import akademikerne.controller.UtilController;
import akademikerne.domain.table.Rettighedstyper;
import akademikerne.exception.NotFoundException;
import akademikerne.repository.table.RettighedstyperRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
class RettighedstyperController {

    private final RettighedstyperRepository rettighedstyperRepository;

    RettighedstyperController(RettighedstyperRepository rettighedstyperRepository) {
        this.rettighedstyperRepository = rettighedstyperRepository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rettighedstyper")
    List<Rettighedstyper> all() {
        return rettighedstyperRepository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/rettighedstyper")
    Rettighedstyper newRettighedstyper(@RequestBody Rettighedstyper newRettighedstyper) {
        return rettighedstyperRepository.save(newRettighedstyper);
    }

    // Single item

    @GetMapping("/rettighedstyper/{id}")
    Rettighedstyper one(@PathVariable Integer id) {

        return rettighedstyperRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(id, "Rettighedstyper"));
    }



    @DeleteMapping("/rettighedstyper/{id}")
    void deleteRettighedstyper(@PathVariable Integer id) {
        rettighedstyperRepository.deleteById(id);
    }


    /**
     is searching in all the string fields of the entity and in case a string variable
     * has the value "", the field will be ignored during the search
     * This makes this aearch function very flexible
     * @param rettighedsnavn
     * @return
     */
    /*@GetMapping("rettighedstyper/stringsearch")
    public List<Rettighedstyper> getBrugerebyStrings(@RequestParam String rettighedsnavn) {
        return rettighedstyperRepository.findAllByRettighedsnavnIsContainingIgnoreCase(rettighedsnavn);

    }*/



}


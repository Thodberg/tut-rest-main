package akademikerne.controller.table;


import akademikerne.controller.UtilController;
import akademikerne.domain.table.Brugere;
import akademikerne.exception.NotFoundException;
import akademikerne.repository.table.BrugereRepository;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
class BrugereController {

    private final BrugereRepository brugereRepository;

    BrugereController(BrugereRepository brugereRepository) {
        this.brugereRepository = brugereRepository;
    }

    @RequestMapping("/resource")
    public Map<String,Object> home() {
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("id", UUID.randomUUID().toString());
        model.put("content", "Hello World");
        return model;
    }

    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }



    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/brugere")
    List<Brugere> all() {
        //System.out.println("hallo hallo ");
        return brugereRepository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/brugere")
    Brugere newBrugere(@RequestBody Brugere newBrugere) {
        return brugereRepository.save(newBrugere);
    }

    // Single item

    @GetMapping("/brugere/{id}")
    Brugere one(@PathVariable Integer id) {

        return brugereRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(id, "Brugere"));
    }



    @DeleteMapping("/brugere/{id}")
    void deleteBrugere(@PathVariable Integer id) {
        brugereRepository.deleteById(id);
    }


}



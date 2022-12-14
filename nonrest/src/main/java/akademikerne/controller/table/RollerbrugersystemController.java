package akademikerne.controller.table;


import akademikerne.controller.UtilController;
import akademikerne.domain.table.Rollerbrugersystem;
import akademikerne.exception.NotFoundException;
import akademikerne.repository.table.RollerbrugersystemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
class RollerbrugersystemController {

    private final RollerbrugersystemRepository rollerbrugersystemRepository;

    RollerbrugersystemController(RollerbrugersystemRepository rollerbrugersystemRepository) {
        this.rollerbrugersystemRepository = rollerbrugersystemRepository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/rollerbrugersystem")
    List<Rollerbrugersystem> all() {
        return rollerbrugersystemRepository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/rollerbrugersystem")
    Rollerbrugersystem newRollerbrugersystem(@RequestBody Rollerbrugersystem newRollerbrugersystem) {
        return rollerbrugersystemRepository.save(newRollerbrugersystem);
    }

    // Single item

    @GetMapping("/rollerbrugersystem/{id}")
    Rollerbrugersystem one(@PathVariable Integer id) {

        return rollerbrugersystemRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(id, "Rollerbrugersystem"));
    }



    @DeleteMapping("/rollerbrugersystem/{id}")
    void deleteRollerbrugersystem(@PathVariable Integer id) {
        rollerbrugersystemRepository.deleteById(id);
    }

}



package akademikerne.controller.view;


import akademikerne.controller.UtilController;
import akademikerne.domain.view.Brugereview;
import akademikerne.repository.view.BrugereviewRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
class BrugereviewController {

    private final BrugereviewRepository brugereviewRepository;

    BrugereviewController(BrugereviewRepository repository) {
        this.brugereviewRepository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/brugereview")
    List<Brugereview> all() {
        return brugereviewRepository.findAll();
    }
}





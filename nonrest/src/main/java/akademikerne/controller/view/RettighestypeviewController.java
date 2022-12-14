package akademikerne.controller.view;

import akademikerne.controller.UtilController;
import akademikerne.domain.view.Rettighestypeview;
import akademikerne.repository.view.RettighestypeviewRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
public class RettighestypeviewController {

    private final RettighestypeviewRepository rettighestypeviewRepository;

    RettighestypeviewController(RettighestypeviewRepository repository) {
        this.rettighestypeviewRepository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/Rettighestypeview")
    List<Rettighestypeview> all() {
        return rettighestypeviewRepository.findAll();
    }

}







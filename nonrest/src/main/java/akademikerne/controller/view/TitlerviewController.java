package akademikerne.controller.view;

import akademikerne.controller.UtilController;
import akademikerne.domain.view.Titlerview;
import akademikerne.repository.view.TitlerviewRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
public class TitlerviewController {

    private final TitlerviewRepository titlerviewRepository;

    TitlerviewController(TitlerviewRepository repository) {
        this.titlerviewRepository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/Titlerview")
    List<Titlerview> all() {
        return titlerviewRepository.findAll();
    }

}

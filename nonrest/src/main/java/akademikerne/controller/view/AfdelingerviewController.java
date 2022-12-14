package akademikerne.controller.view;

import akademikerne.controller.UtilController;
import akademikerne.domain.view.Afdelingerview;
import akademikerne.repository.view.AfdelingerviewRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
public class AfdelingerviewController {

    private final AfdelingerviewRepository afdelingerviewRepository;

    AfdelingerviewController(AfdelingerviewRepository repository) {
        this.afdelingerviewRepository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/Afdelingerview")
    List<Afdelingerview> all() {
        return afdelingerviewRepository.findAll();
    }

}







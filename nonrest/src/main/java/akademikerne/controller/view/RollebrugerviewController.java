package akademikerne.controller.view;

import akademikerne.controller.UtilController;
import akademikerne.domain.view.Rollebrugerview;
import akademikerne.repository.view.RollebrugerviewRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
public class RollebrugerviewController {

        private final RollebrugerviewRepository rollebrugerviewRepository;

        RollebrugerviewController(RollebrugerviewRepository repository) {
            this.rollebrugerviewRepository = repository;
        }


        // Aggregate root
        // tag::get-aggregate-root[]
        @GetMapping("/rollebrugerview")
        List<Rollebrugerview> all() {
            return rollebrugerviewRepository.findAll();
        }

}

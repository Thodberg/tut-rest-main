package akademikerne.controller.view;

import akademikerne.controller.UtilController;
import akademikerne.domain.view.Rollebrugersystemview;
import akademikerne.repository.view.RollebrugersystemviewRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
public class RollebrugersystemviewController {


        private final RollebrugersystemviewRepository rollebrugersystemviewRepository;

        RollebrugersystemviewController(RollebrugersystemviewRepository repository) {
            this.rollebrugersystemviewRepository = repository;
        }


        // Aggregate root
        // tag::get-aggregate-root[]
        @GetMapping("/rollebrugersystemview")
        List<Rollebrugersystemview> all() {
            return rollebrugersystemviewRepository.findAll();
        }

}

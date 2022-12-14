package akademikerne.controller.view;

import akademikerne.controller.UtilController;
import akademikerne.repository.view.RollebrugersystemrettighedviewRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
public class RollebrugersystemrettighedviewController {

    private final RollebrugersystemrettighedviewRepository brugereviewRepository;

    RollebrugersystemrettighedviewController(RollebrugersystemrettighedviewRepository repository) {
        this.brugereviewRepository = repository;
    }


}

package akademikerne.controller.view;

import akademikerne.controller.UtilController;
import akademikerne.domain.view.Rettighedstypesystemview;
import akademikerne.repository.view.RettighedstypesystemviewRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
public class RettighedstypesystemviewController {


        private final RettighedstypesystemviewRepository rettighedstypesystemviewrepository;

        RettighedstypesystemviewController(RettighedstypesystemviewRepository repository) {
            this.rettighedstypesystemviewrepository = repository;
        }


        // Aggregate root
        // tag::get-aggregate-root[]
        @GetMapping("/rettighedstypesystemview")
        List<Rettighedstypesystemview> all() {
            return rettighedstypesystemviewrepository.findAll();
        }


}

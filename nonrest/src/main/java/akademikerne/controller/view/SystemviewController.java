package akademikerne.controller.view;

import akademikerne.controller.UtilController;
import akademikerne.domain.view.Systemview;
import akademikerne.repository.view.SystemviewRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
public class SystemviewController {

    private final SystemviewRepository systemviewRepository;

    SystemviewController(SystemviewRepository repository) {
        this.systemviewRepository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/Systemview")
    List<Systemview> all() {
        return systemviewRepository.findAll();
    }

}








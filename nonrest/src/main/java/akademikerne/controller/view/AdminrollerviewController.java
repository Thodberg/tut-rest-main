package akademikerne.controller.view;

import akademikerne.controller.UtilController;
import akademikerne.domain.view.Adminrollerview;
import akademikerne.repository.view.AdminrollerviewRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@CrossOrigin(origins = UtilController.KLIENT_URL)
@RestController
public class AdminrollerviewController {

    private final AdminrollerviewRepository adminrollerviewRepository;

    AdminrollerviewController(AdminrollerviewRepository repository) {
        this.adminrollerviewRepository = repository;
    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/adminrollerview")
    List<Adminrollerview> all() {
        return adminrollerviewRepository.findAll();
    }

}







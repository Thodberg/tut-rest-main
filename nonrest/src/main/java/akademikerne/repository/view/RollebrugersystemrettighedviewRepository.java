package akademikerne.repository.view;

import akademikerne.domain.view.Rollebrugersystemrettighedview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RollebrugersystemrettighedviewRepository extends JpaRepository<Rollebrugersystemrettighedview, Integer> {

    public List<Rollebrugersystemrettighedview>
        findAllByRollenavnAndRettighedstypesystemidEqualsAndRolleindehaveridEquals
            (String rollenavn, Integer rettighedtypesystemid, Integer rolleindehaveid  );


}

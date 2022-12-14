package akademikerne.repository.table;

import akademikerne.domain.table.Rollerbruger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RollerbrugerRepository extends JpaRepository<Rollerbruger, Integer> {

    /*public List<Rollerbruger>
    findAllByRettetafIsContainingIgnoreCaseAndOprettetafIsContainingIgnoreCaseAndAfsluttetafIsContainingIgnoreCase(
            String oprettetaf, String rettetaf, String afsluttetaf);*/

}



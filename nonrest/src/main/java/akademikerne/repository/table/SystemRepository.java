package akademikerne.repository.table;

import akademikerne.domain.table.System2;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemRepository extends JpaRepository<System2, Integer> {

    /*public List<System2>
    findAllBySystemnavnIsContainingIgnoreCaseAndRettetafIsContainingIgnoreCaseAndOprettetafIsContainingIgnoreCaseAndAfsluttetafIsContainingIgnoreCase(
            String systemnavn, String oprettetaf, String rettetaf, String afsluttetaf);*/


}





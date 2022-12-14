package akademikerne.repository.table;

import akademikerne.domain.table.Rettighedstypesystembruger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RettighedstypesystembrugerRepository extends JpaRepository<Rettighedstypesystembruger, Integer> {
    /*public List<Rettighedstypesystembruger>
    findAllByRettetafIsContainingIgnoreCaseAndOprettetafIsContainingIgnoreCaseAndRevideretafContainingIgnoreCaseAndAfsluttetafIsContainingIgnoreCase(
            String oprettetaf, String rettetaf, String revideretaf, String afsluttetaf);*/

}


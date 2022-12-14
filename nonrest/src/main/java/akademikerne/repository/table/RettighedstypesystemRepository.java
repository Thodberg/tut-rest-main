package akademikerne.repository.table;

import akademikerne.domain.table.Rettighedstypesystem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RettighedstypesystemRepository extends JpaRepository<Rettighedstypesystem, Integer> {
    /*public List<Rettighedstypesystem>
    findAllByRettetafIsContainingIgnoreCaseAndOprettetafIsContainingIgnoreCaseAndAfsluttetafIsContainingIgnoreCase(
            String oprettetaf, String rettetaf, String afsluttetaf);*/

}


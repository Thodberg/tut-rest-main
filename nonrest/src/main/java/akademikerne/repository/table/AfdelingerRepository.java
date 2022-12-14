package akademikerne.repository.table;

import akademikerne.domain.table.Afdelinger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AfdelingerRepository extends JpaRepository<Afdelinger, Integer> {

   /* public List<Afdelinger>
        findAllByAfdelingsnavnIsContainingIgnoreCaseAndRettetafIsContainingIgnoreCaseAndOprettetafIsContainingIgnoreCaseAndAfsluttetafIsContainingIgnoreCase(
                String afdelingsnavn, String oprettetaf, String rettetaf, String afsluttetaf);*/



}

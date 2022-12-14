package akademikerne.repository.table;

import akademikerne.domain.table.Rettighedstyper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RettighedstyperRepository extends JpaRepository<Rettighedstyper, Integer> {
    /*public List<Rettighedstyper>
    findAllByRettighedsnavnIsContainingIgnoreCase(
            String rettighedsnavn);*/

}

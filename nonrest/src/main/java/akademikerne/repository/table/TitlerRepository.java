package akademikerne.repository.table;

import akademikerne.domain.table.Titler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitlerRepository extends JpaRepository<Titler, Integer> {
      /*public List<Titler> findAllByTitelnavnIsContainingIgnoreCase(String titel);*/

}






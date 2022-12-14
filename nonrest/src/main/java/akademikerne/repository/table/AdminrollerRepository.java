package akademikerne.repository.table;

import akademikerne.domain.table.Adminroller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminrollerRepository extends JpaRepository<Adminroller, Integer> {
    /*public List<Adminroller>
   findAllByRollenavnIsContainingIgnoreCaseAndRettetafIsContainingIgnoreCaseAndOprettetafIsContainingIgnoreCaseAndAfsluttetafIsContainingIgnoreCase(
           String rollenavn, String oprettetaf, String rettetaf, String afsluttetaf);*/



}
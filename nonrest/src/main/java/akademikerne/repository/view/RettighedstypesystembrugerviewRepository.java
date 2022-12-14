package akademikerne.repository.view;

import akademikerne.domain.view.Rettighedstypesystembrugerview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface RettighedstypesystembrugerviewRepository extends JpaRepository<Rettighedstypesystembrugerview, Integer> {

    public List<Rettighedstypesystembrugerview> findAllByAfsluttetdatoBefore(Date date);

    public List<Rettighedstypesystembrugerview> findAllByAfsluttetdatoIsNullOrAfsluttetdatoAfter(Date date);

    public List<Rettighedstypesystembrugerview>
    findAllByBrugernavnContainingIgnoreCaseAndSystemnavnContainingIgnoreCaseAndRettighedsnavnContainingIgnoreCase
            (String brugernavn, String systemnavn, String rettighedsnavn);

    public List<Rettighedstypesystembrugerview>
    findAllByAfsluttetdatoBeforeAndBrugernavnContainingIgnoreCaseAndSystemnavnContainingIgnoreCaseAndRettighedsnavnContainingIgnoreCase
            (Date date, String brugernavn, String systemnavn, String rettighedsnavn);

    public List<Rettighedstypesystembrugerview>
    findAllByBrugernavnContainingIgnoreCaseAndSystemnavnContainingIgnoreCaseAndRettighedsnavnContainingIgnoreCaseAndAfsluttetdatoIsNullOrAfsluttetdatoAfter
            (String brugernavn, String systemnavn, String rettighedsnavn,Date date );

    public List<Rettighedstypesystembrugerview>
    findAllByBrugernavnContainingIgnoreCaseAndSystemnavnContainingIgnoreCaseAndRettighedsnavnContainingIgnoreCaseAndAfdelingslederidEqualsAndRollenavnEquals
            (String brugernavn, String systemnavn, String rettighedsnavn, Integer afdelingslederid, String rollenavn);

    public List<Rettighedstypesystembrugerview>
    findAllByAfsluttetdatoBeforeAndBrugernavnContainingIgnoreCaseAndSystemnavnContainingIgnoreCaseAndRettighedsnavnContainingIgnoreCaseAndAfdelingslederidEqualsAndRollenavnEquals
            (Date date, String brugernavn, String systemnavn, String rettighedsnavn, Integer afdelingslederid, String rollenavn);

    public List<Rettighedstypesystembrugerview>
    findAllByBrugernavnContainingIgnoreCaseAndSystemnavnContainingIgnoreCaseAndRettighedsnavnContainingIgnoreCaseAndAfdelingslederidEqualsAndRollenavnEqualsAndAfsluttetdatoIsNullOrAfsluttetdatoAfter
            (String brugernavn, String systemnavn, String rettighedsnavn, Integer afdelingslederid, String rollenavn,Date date );

    public List<Rettighedstypesystembrugerview>
    findAllByBrugernavnContainingIgnoreCaseAndSystemnavnContainingIgnoreCaseAndRettighedsnavnContainingIgnoreCaseAndRolleindehaveridEqualsAndRollenavnEquals
            (String brugernavn, String systemnavn, String rettighedsnavn, Integer rolleindehaverid, String rollenavn);

    public List<Rettighedstypesystembrugerview>
    findAllByAfsluttetdatoBeforeAndBrugernavnContainingIgnoreCaseAndSystemnavnContainingIgnoreCaseAndRettighedsnavnContainingIgnoreCaseAndRolleindehaveridEqualsAndRollenavnEquals
            (Date date, String brugernavn, String systemnavn, String rettighedsnavn, Integer rolleindehaverid, String rollenavn);

    public List<Rettighedstypesystembrugerview>
    findAllByBrugernavnContainingIgnoreCaseAndSystemnavnContainingIgnoreCaseAndRettighedsnavnContainingIgnoreCaseAndRolleindehaveridEqualsAndRollenavnEqualsAndAfsluttetdatoIsNullOrAfsluttetdatoAfter
            (String brugernavn, String systemnavn, String rettighedsnavn, Integer rolleindehaverid, String rollenavn,Date date );

    public List<Rettighedstypesystembrugerview>
    findAllByAfdelingslederidEqualsAndRollenavnEquals
            (Integer afdelingslederid, String rollenavn);

    public List<Rettighedstypesystembrugerview>
    findAllByAfsluttetdatoBeforeAndAfdelingslederidEqualsAndRollenavnEquals
            (Date date, Integer afdelingslederid, String rollenavn);

    public List<Rettighedstypesystembrugerview>
    findAllByAfdelingslederidEqualsAndRollenavnEqualsAndAfsluttetdatoIsNullOrAfsluttetdatoAfter
            (Integer afdelingslederid, String rollenavn,Date date);

    public List<Rettighedstypesystembrugerview>
    findAllByRolleindehaveridEqualsAndRollenavnEquals
            (Integer rolleindehaverid, String rollenavn);

    public List<Rettighedstypesystembrugerview>
    findAllByAfsluttetdatoBeforeAndRolleindehaveridEqualsAndRollenavnEquals
            (Date date, Integer rolleindehaverid, String rollenavn);

    public List<Rettighedstypesystembrugerview>
    findAllByRolleindehaveridEqualsAndRollenavnEqualsAndAfsluttetdatoIsNullOrAfsluttetdatoAfter
            (Integer rolleindehaverid, String rollenavn, Date date);

}

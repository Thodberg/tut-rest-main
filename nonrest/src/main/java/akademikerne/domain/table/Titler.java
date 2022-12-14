package akademikerne.domain.table;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Titler {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "titelid", nullable = false)
    private Integer titelid;
    @Basic
    @Column(name = "titelnavn", nullable = false, length = 50)
    private String titelnavn;
    @Basic
    @Column(name = "oprettetafid", nullable = true)
    private Integer oprettetafid;
    @Basic
    @Column(name = "oprettetdato", nullable = true)
    private Date oprettetdato;
    @Basic
    @Column(name = "rettetafid", nullable = true)
    private Integer rettetafid;
    @Basic
    @Column(name = "rettetdato", nullable = true)
    private Date rettetdato;
    @Basic
    @Column(name = "afsluttetafid", nullable = true)
    private Integer afsluttetafid;
    @Basic
    @Column(name = "afsluttetdato", nullable = true)
    private Date afsluttetdato;

    public Integer getTitelid() {
        return titelid;
    }

    public void setTitelid(Integer titelid) {
        this.titelid = titelid;
    }

    public String getTitelnavn() {
        return titelnavn;
    }

    public void setTitelnavn(String titelnavn) {
        this.titelnavn = titelnavn;
    }

    public Integer getOprettetafid() {
        return oprettetafid;
    }

    public void setOprettetafid(Integer oprettetafid) {
        this.oprettetafid = oprettetafid;
    }

    public Date getOprettetdato() {
        return oprettetdato;
    }

    public void setOprettetdato(Date oprettetdato) {
        this.oprettetdato = oprettetdato;
    }

    public Integer getRettetafid() {
        return rettetafid;
    }

    public void setRettetafid(Integer rettetafid) {
        this.rettetafid = rettetafid;
    }

    public Date getRettetdato() {
        return rettetdato;
    }

    public void setRettetdato(Date rettetdato) {
        this.rettetdato = rettetdato;
    }

    public Integer getAfsluttetafid() {
        return afsluttetafid;
    }

    public void setAfsluttetafid(Integer afsluttetafid) {
        this.afsluttetafid = afsluttetafid;
    }

    public Date getAfsluttetdato() {
        return afsluttetdato;
    }

    public void setAfsluttetdato(Date afsluttetdato) {
        this.afsluttetdato = afsluttetdato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Titler titler = (Titler) o;

        if (titelid != null ? !titelid.equals(titler.titelid) : titler.titelid != null) return false;
        if (titelnavn != null ? !titelnavn.equals(titler.titelnavn) : titler.titelnavn != null) return false;
        if (oprettetafid != null ? !oprettetafid.equals(titler.oprettetafid) : titler.oprettetafid != null)
            return false;
        if (oprettetdato != null ? !oprettetdato.equals(titler.oprettetdato) : titler.oprettetdato != null)
            return false;
        if (rettetafid != null ? !rettetafid.equals(titler.rettetafid) : titler.rettetafid != null) return false;
        if (rettetdato != null ? !rettetdato.equals(titler.rettetdato) : titler.rettetdato != null) return false;
        if (afsluttetafid != null ? !afsluttetafid.equals(titler.afsluttetafid) : titler.afsluttetafid != null)
            return false;
        if (afsluttetdato != null ? !afsluttetdato.equals(titler.afsluttetdato) : titler.afsluttetdato != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = titelid != null ? titelid.hashCode() : 0;
        result = 31 * result + (titelnavn != null ? titelnavn.hashCode() : 0);
        result = 31 * result + (oprettetafid != null ? oprettetafid.hashCode() : 0);
        result = 31 * result + (oprettetdato != null ? oprettetdato.hashCode() : 0);
        result = 31 * result + (rettetafid != null ? rettetafid.hashCode() : 0);
        result = 31 * result + (rettetdato != null ? rettetdato.hashCode() : 0);
        result = 31 * result + (afsluttetafid != null ? afsluttetafid.hashCode() : 0);
        result = 31 * result + (afsluttetdato != null ? afsluttetdato.hashCode() : 0);
        return result;
    }
}

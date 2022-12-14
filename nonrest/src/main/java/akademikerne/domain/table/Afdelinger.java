package akademikerne.domain.table;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Afdelinger {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "afdelingid", nullable = false)
    private Integer afdelingid;
    @Basic
    @Column(name = "afdelingsnavn", nullable = false, length = 50)
    private String afdelingsnavn;
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
    @Basic
    @Column(name = "afdelingslederid", nullable = true)
    private Integer afdelingslederid;

    public Integer getAfdelingid() {
        return afdelingid;
    }

    public void setAfdelingid(Integer afdelingid) {
        this.afdelingid = afdelingid;
    }

    public String getAfdelingsnavn() {
        return afdelingsnavn;
    }

    public void setAfdelingsnavn(String afdelingsnavn) {
        this.afdelingsnavn = afdelingsnavn;
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

    public Integer getAfdelingslederid() {
        return afdelingslederid;
    }

    public void setAfdelingslederid(Integer afdelingslederid) {
        this.afdelingslederid = afdelingslederid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Afdelinger that = (Afdelinger) o;

        if (afdelingid != null ? !afdelingid.equals(that.afdelingid) : that.afdelingid != null) return false;
        if (afdelingsnavn != null ? !afdelingsnavn.equals(that.afdelingsnavn) : that.afdelingsnavn != null)
            return false;
        if (oprettetafid != null ? !oprettetafid.equals(that.oprettetafid) : that.oprettetafid != null) return false;
        if (oprettetdato != null ? !oprettetdato.equals(that.oprettetdato) : that.oprettetdato != null) return false;
        if (rettetafid != null ? !rettetafid.equals(that.rettetafid) : that.rettetafid != null) return false;
        if (rettetdato != null ? !rettetdato.equals(that.rettetdato) : that.rettetdato != null) return false;
        if (afsluttetafid != null ? !afsluttetafid.equals(that.afsluttetafid) : that.afsluttetafid != null)
            return false;
        if (afsluttetdato != null ? !afsluttetdato.equals(that.afsluttetdato) : that.afsluttetdato != null)
            return false;
        if (afdelingslederid != null ? !afdelingslederid.equals(that.afdelingslederid) : that.afdelingslederid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = afdelingid != null ? afdelingid.hashCode() : 0;
        result = 31 * result + (afdelingsnavn != null ? afdelingsnavn.hashCode() : 0);
        result = 31 * result + (oprettetafid != null ? oprettetafid.hashCode() : 0);
        result = 31 * result + (oprettetdato != null ? oprettetdato.hashCode() : 0);
        result = 31 * result + (rettetafid != null ? rettetafid.hashCode() : 0);
        result = 31 * result + (rettetdato != null ? rettetdato.hashCode() : 0);
        result = 31 * result + (afsluttetafid != null ? afsluttetafid.hashCode() : 0);
        result = 31 * result + (afsluttetdato != null ? afsluttetdato.hashCode() : 0);
        result = 31 * result + (afdelingslederid != null ? afdelingslederid.hashCode() : 0);
        return result;
    }
}

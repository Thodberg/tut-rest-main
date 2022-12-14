package akademikerne.domain.table;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Rettighedstyper {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "rettighedstypeid", nullable = false)
    private Integer rettighedstypeid;
    @Basic
    @Column(name = "rettighedsnavn", nullable = false, length = 50)
    private String rettighedsnavn;
    @Basic
    @Column(name = "oprettetafid", nullable = false)
    private Integer oprettetafid;
    @Basic
    @Column(name = "oprettetdato", nullable = false)
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

    public Integer getRettighedstypeid() {
        return rettighedstypeid;
    }

    public void setRettighedstypeid(Integer rettighedstypeid) {
        this.rettighedstypeid = rettighedstypeid;
    }

    public String getRettighedsnavn() {
        return rettighedsnavn;
    }

    public void setRettighedsnavn(String rettighedsnavn) {
        this.rettighedsnavn = rettighedsnavn;
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

        Rettighedstyper that = (Rettighedstyper) o;

        if (rettighedstypeid != null ? !rettighedstypeid.equals(that.rettighedstypeid) : that.rettighedstypeid != null)
            return false;
        if (rettighedsnavn != null ? !rettighedsnavn.equals(that.rettighedsnavn) : that.rettighedsnavn != null)
            return false;
        if (oprettetafid != null ? !oprettetafid.equals(that.oprettetafid) : that.oprettetafid != null) return false;
        if (oprettetdato != null ? !oprettetdato.equals(that.oprettetdato) : that.oprettetdato != null) return false;
        if (rettetafid != null ? !rettetafid.equals(that.rettetafid) : that.rettetafid != null) return false;
        if (rettetdato != null ? !rettetdato.equals(that.rettetdato) : that.rettetdato != null) return false;
        if (afsluttetafid != null ? !afsluttetafid.equals(that.afsluttetafid) : that.afsluttetafid != null)
            return false;
        if (afsluttetdato != null ? !afsluttetdato.equals(that.afsluttetdato) : that.afsluttetdato != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rettighedstypeid != null ? rettighedstypeid.hashCode() : 0;
        result = 31 * result + (rettighedsnavn != null ? rettighedsnavn.hashCode() : 0);
        result = 31 * result + (oprettetafid != null ? oprettetafid.hashCode() : 0);
        result = 31 * result + (oprettetdato != null ? oprettetdato.hashCode() : 0);
        result = 31 * result + (rettetafid != null ? rettetafid.hashCode() : 0);
        result = 31 * result + (rettetdato != null ? rettetdato.hashCode() : 0);
        result = 31 * result + (afsluttetafid != null ? afsluttetafid.hashCode() : 0);
        result = 31 * result + (afsluttetdato != null ? afsluttetdato.hashCode() : 0);
        return result;
    }
}

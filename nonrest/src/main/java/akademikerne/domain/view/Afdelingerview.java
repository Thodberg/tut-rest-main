package akademikerne.domain.view;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Afdelingerview {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Basic
    @Column(name = "afdelingid", nullable = false)
    private Integer afdelingid;
    @Basic
    @Column(name = "afdelingsnavn", nullable = false, length = 50)
    private String afdelingsnavn;
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
    @Basic
    @Column(name = "oprettetafid", nullable = true)
    private Integer oprettetafid;
    @Basic
    @Column(name = "oprettetaf", nullable = false, length = 50)
    private String oprettetaf;
    @Basic
    @Column(name = "rettetaf", nullable = true, length = 50)
    private String rettetaf;
    @Basic
    @Column(name = "afsluttetaf", nullable = true, length = 50)
    private String afsluttetaf;
    @Basic
    @Column(name = "afdelingsleder", nullable = false, length = 50)
    private String afdelingsleder;

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

    public Integer getOprettetafid() {
        return oprettetafid;
    }

    public void setOprettetafid(Integer oprettetafid) {
        this.oprettetafid = oprettetafid;
    }

    public String getOprettetaf() {
        return oprettetaf;
    }

    public void setOprettetaf(String oprettetaf) {
        this.oprettetaf = oprettetaf;
    }

    public String getRettetaf() {
        return rettetaf;
    }

    public void setRettetaf(String rettetaf) {
        this.rettetaf = rettetaf;
    }

    public String getAfsluttetaf() {
        return afsluttetaf;
    }

    public void setAfsluttetaf(String afsluttetaf) {
        this.afsluttetaf = afsluttetaf;
    }

    public String getAfdelingsleder() {
        return afdelingsleder;
    }

    public void setAfdelingsleder(String afdelingsleder) {
        this.afdelingsleder = afdelingsleder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Afdelingerview that = (Afdelingerview) o;

        if (afdelingid != null ? !afdelingid.equals(that.afdelingid) : that.afdelingid != null) return false;
        if (afdelingsnavn != null ? !afdelingsnavn.equals(that.afdelingsnavn) : that.afdelingsnavn != null)
            return false;
        if (oprettetdato != null ? !oprettetdato.equals(that.oprettetdato) : that.oprettetdato != null) return false;
        if (rettetafid != null ? !rettetafid.equals(that.rettetafid) : that.rettetafid != null) return false;
        if (rettetdato != null ? !rettetdato.equals(that.rettetdato) : that.rettetdato != null) return false;
        if (afsluttetafid != null ? !afsluttetafid.equals(that.afsluttetafid) : that.afsluttetafid != null)
            return false;
        if (afsluttetdato != null ? !afsluttetdato.equals(that.afsluttetdato) : that.afsluttetdato != null)
            return false;
        if (afdelingslederid != null ? !afdelingslederid.equals(that.afdelingslederid) : that.afdelingslederid != null)
            return false;
        if (oprettetafid != null ? !oprettetafid.equals(that.oprettetafid) : that.oprettetafid != null) return false;
        if (oprettetaf != null ? !oprettetaf.equals(that.oprettetaf) : that.oprettetaf != null) return false;
        if (rettetaf != null ? !rettetaf.equals(that.rettetaf) : that.rettetaf != null) return false;
        if (afsluttetaf != null ? !afsluttetaf.equals(that.afsluttetaf) : that.afsluttetaf != null) return false;
        if (afdelingsleder != null ? !afdelingsleder.equals(that.afdelingsleder) : that.afdelingsleder != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = afdelingid != null ? afdelingid.hashCode() : 0;
        result = 31 * result + (afdelingsnavn != null ? afdelingsnavn.hashCode() : 0);
        result = 31 * result + (oprettetdato != null ? oprettetdato.hashCode() : 0);
        result = 31 * result + (rettetafid != null ? rettetafid.hashCode() : 0);
        result = 31 * result + (rettetdato != null ? rettetdato.hashCode() : 0);
        result = 31 * result + (afsluttetafid != null ? afsluttetafid.hashCode() : 0);
        result = 31 * result + (afsluttetdato != null ? afsluttetdato.hashCode() : 0);
        result = 31 * result + (afdelingslederid != null ? afdelingslederid.hashCode() : 0);
        result = 31 * result + (oprettetafid != null ? oprettetafid.hashCode() : 0);
        result = 31 * result + (oprettetaf != null ? oprettetaf.hashCode() : 0);
        result = 31 * result + (rettetaf != null ? rettetaf.hashCode() : 0);
        result = 31 * result + (afsluttetaf != null ? afsluttetaf.hashCode() : 0);
        result = 31 * result + (afdelingsleder != null ? afdelingsleder.hashCode() : 0);
        return result;
    }
}

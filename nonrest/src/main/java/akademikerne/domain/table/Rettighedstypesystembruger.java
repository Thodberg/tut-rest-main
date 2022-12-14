package akademikerne.domain.table;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Rettighedstypesystembruger {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "rettighedstypesystembrugerID", nullable = false)
    private Integer rettighedstypesystembrugerId;
    @Basic
    @Column(name = "brugerid", nullable = false)
    private Integer brugerid;
    @Basic
    @Column(name = "rettighedstypesystemid", nullable = false)
    private Integer rettighedstypesystemid;
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
    @Column(name = "revideretafid", nullable = true)
    private Integer revideretafid;
    @Basic
    @Column(name = "revideretdato", nullable = true)
    private Date revideretdato;
    @Basic
    @Column(name = "afsluttetafid", nullable = true)
    private Integer afsluttetafid;
    @Basic
    @Column(name = "afsluttetdato", nullable = true)
    private Date afsluttetdato;
    @Basic
    @Column(name = "naesterevideringsdato", nullable = true)
    private Date naesterevideringsdato;

    public Integer getRettighedstypesystembrugerId() {
        return rettighedstypesystembrugerId;
    }

    public void setRettighedstypesystembrugerId(Integer rettighedstypesystembrugerId) {
        this.rettighedstypesystembrugerId = rettighedstypesystembrugerId;
    }

    public Integer getBrugerid() {
        return brugerid;
    }

    public void setBrugerid(Integer brugerid) {
        this.brugerid = brugerid;
    }

    public Integer getRettighedstypesystemid() {
        return rettighedstypesystemid;
    }

    public void setRettighedstypesystemid(Integer rettighedstypesystemid) {
        this.rettighedstypesystemid = rettighedstypesystemid;
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

    public Integer getRevideretafid() {
        return revideretafid;
    }

    public void setRevideretafid(Integer revideretafid) {
        this.revideretafid = revideretafid;
    }

    public Date getRevideretdato() {
        return revideretdato;
    }

    public void setRevideretdato(Date revideretdato) {
        this.revideretdato = revideretdato;
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

    public Date getNaesterevideringsdato() {
        return naesterevideringsdato;
    }

    public void setNaesterevideringsdato(Date naesterevideringsdato) {
        this.naesterevideringsdato = naesterevideringsdato;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rettighedstypesystembruger that = (Rettighedstypesystembruger) o;

        if (rettighedstypesystembrugerId != null ? !rettighedstypesystembrugerId.equals(that.rettighedstypesystembrugerId) : that.rettighedstypesystembrugerId != null)
            return false;
        if (brugerid != null ? !brugerid.equals(that.brugerid) : that.brugerid != null) return false;
        if (rettighedstypesystemid != null ? !rettighedstypesystemid.equals(that.rettighedstypesystemid) : that.rettighedstypesystemid != null)
            return false;
        if (oprettetafid != null ? !oprettetafid.equals(that.oprettetafid) : that.oprettetafid != null) return false;
        if (oprettetdato != null ? !oprettetdato.equals(that.oprettetdato) : that.oprettetdato != null) return false;
        if (rettetafid != null ? !rettetafid.equals(that.rettetafid) : that.rettetafid != null) return false;
        if (rettetdato != null ? !rettetdato.equals(that.rettetdato) : that.rettetdato != null) return false;
        if (revideretafid != null ? !revideretafid.equals(that.revideretafid) : that.revideretafid != null)
            return false;
        if (revideretdato != null ? !revideretdato.equals(that.revideretdato) : that.revideretdato != null)
            return false;
        if (afsluttetafid != null ? !afsluttetafid.equals(that.afsluttetafid) : that.afsluttetafid != null)
            return false;
        if (afsluttetdato != null ? !afsluttetdato.equals(that.afsluttetdato) : that.afsluttetdato != null)
            return false;
        if (naesterevideringsdato != null ? !naesterevideringsdato.equals(that.naesterevideringsdato) : that.naesterevideringsdato != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rettighedstypesystembrugerId != null ? rettighedstypesystembrugerId.hashCode() : 0;
        result = 31 * result + (brugerid != null ? brugerid.hashCode() : 0);
        result = 31 * result + (rettighedstypesystemid != null ? rettighedstypesystemid.hashCode() : 0);
        result = 31 * result + (oprettetafid != null ? oprettetafid.hashCode() : 0);
        result = 31 * result + (oprettetdato != null ? oprettetdato.hashCode() : 0);
        result = 31 * result + (rettetafid != null ? rettetafid.hashCode() : 0);
        result = 31 * result + (rettetdato != null ? rettetdato.hashCode() : 0);
        result = 31 * result + (revideretafid != null ? revideretafid.hashCode() : 0);
        result = 31 * result + (revideretdato != null ? revideretdato.hashCode() : 0);
        result = 31 * result + (afsluttetafid != null ? afsluttetafid.hashCode() : 0);
        result = 31 * result + (afsluttetdato != null ? afsluttetdato.hashCode() : 0);
        result = 31 * result + (naesterevideringsdato != null ? naesterevideringsdato.hashCode() : 0);
        return result;
    }
}

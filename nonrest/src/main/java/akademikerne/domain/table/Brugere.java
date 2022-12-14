package akademikerne.domain.table;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Brugere {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "brugerid", nullable = false)
    private Integer brugerid;
    @Basic
    @Column(name = "brugernavn", nullable = false, length = 50)
    private String brugernavn;
    @Basic
    @Column(name = "afdelingid", nullable = false)
    private Integer afdelingid;
    @Basic
    @Column(name = "titelid", nullable = false)
    private Integer titelid;
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
    @Column(name = "Password", nullable = true, length = 50)
    private String password;
    @Basic
    @Column(name = "loginbrugernavn", nullable = true, length = 50)
    private String loginbrugernavn;

    public Integer getBrugerid() {
        return brugerid;
    }

    public void setBrugerid(Integer brugerid) {
        this.brugerid = brugerid;
    }

    public String getBrugernavn() {
        return brugernavn;
    }

    public void setBrugernavn(String brugernavn) {
        this.brugernavn = brugernavn;
    }

    public Integer getAfdelingid() {
        return afdelingid;
    }

    public void setAfdelingid(Integer afdelingid) {
        this.afdelingid = afdelingid;
    }

    public Integer getTitelid() {
        return titelid;
    }

    public void setTitelid(Integer titelid) {
        this.titelid = titelid;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginbrugernavn() {
        return loginbrugernavn;
    }

    public void setLoginbrugernavn(String loginbrugernavn) {
        this.loginbrugernavn = loginbrugernavn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Brugere brugere = (Brugere) o;

        if (brugerid != null ? !brugerid.equals(brugere.brugerid) : brugere.brugerid != null) return false;
        if (brugernavn != null ? !brugernavn.equals(brugere.brugernavn) : brugere.brugernavn != null) return false;
        if (afdelingid != null ? !afdelingid.equals(brugere.afdelingid) : brugere.afdelingid != null) return false;
        if (titelid != null ? !titelid.equals(brugere.titelid) : brugere.titelid != null) return false;
        if (oprettetafid != null ? !oprettetafid.equals(brugere.oprettetafid) : brugere.oprettetafid != null)
            return false;
        if (oprettetdato != null ? !oprettetdato.equals(brugere.oprettetdato) : brugere.oprettetdato != null)
            return false;
        if (rettetafid != null ? !rettetafid.equals(brugere.rettetafid) : brugere.rettetafid != null) return false;
        if (rettetdato != null ? !rettetdato.equals(brugere.rettetdato) : brugere.rettetdato != null) return false;
        if (afsluttetafid != null ? !afsluttetafid.equals(brugere.afsluttetafid) : brugere.afsluttetafid != null)
            return false;
        if (afsluttetdato != null ? !afsluttetdato.equals(brugere.afsluttetdato) : brugere.afsluttetdato != null)
            return false;
        if (password != null ? !password.equals(brugere.password) : brugere.password != null) return false;
        if (loginbrugernavn != null ? !loginbrugernavn.equals(brugere.loginbrugernavn) : brugere.loginbrugernavn != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = brugerid != null ? brugerid.hashCode() : 0;
        result = 31 * result + (brugernavn != null ? brugernavn.hashCode() : 0);
        result = 31 * result + (afdelingid != null ? afdelingid.hashCode() : 0);
        result = 31 * result + (titelid != null ? titelid.hashCode() : 0);
        result = 31 * result + (oprettetafid != null ? oprettetafid.hashCode() : 0);
        result = 31 * result + (oprettetdato != null ? oprettetdato.hashCode() : 0);
        result = 31 * result + (rettetafid != null ? rettetafid.hashCode() : 0);
        result = 31 * result + (rettetdato != null ? rettetdato.hashCode() : 0);
        result = 31 * result + (afsluttetafid != null ? afsluttetafid.hashCode() : 0);
        result = 31 * result + (afsluttetdato != null ? afsluttetdato.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (loginbrugernavn != null ? loginbrugernavn.hashCode() : 0);
        return result;
    }
}

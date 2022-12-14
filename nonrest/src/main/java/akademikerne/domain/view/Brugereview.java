package akademikerne.domain.view;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Brugereview {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Basic
    @Column(name = "brugerid", nullable = false)
    private Integer brugerid;
    @Basic
    @Column(name = "titelid", nullable = false)
    private Integer titelid;
    @Basic
    @Column(name = "titelnavn", nullable = false, length = 50)
    private String titelnavn;
    @Basic
    @Column(name = "oprettetdato", nullable = true)
    private Date oprettetdato;
    @Basic
    @Column(name = "oprettetafid", nullable = true)
    private Integer oprettetafid;
    @Basic
    @Column(name = "loginbrugernavn", nullable = true, length = 50)
    private String loginbrugernavn;
    @Basic
    @Column(name = "rettetafid", nullable = true)
    private Integer rettetafid;
    @Basic
    @Column(name = "rettetaf", nullable = true, length = 50)
    private String rettetaf;
    @Basic
    @Column(name = "afsluttetafid", nullable = true)
    private Integer afsluttetafid;
    @Basic
    @Column(name = "afsluttetaf", nullable = true, length = 50)
    private String afsluttetaf;
    @Basic
    @Column(name = "oprettetaf", nullable = false, length = 50)
    private String oprettetaf;
    @Basic
    @Column(name = "brugernavn", nullable = false, length = 50)
    private String brugernavn;
    @Basic
    @Column(name = "rettetdato", nullable = true)
    private Date rettetdato;
    @Basic
    @Column(name = "afsluttetdato", nullable = true)
    private Date afsluttetdato;
    @Basic
    @Column(name = "Password", nullable = true, length = 50)
    private String password;
    @Basic
    @Column(name = "afdelingid", nullable = false)
    private Integer afdelingid;
    @Basic
    @Column(name = "afdelingsnavn", nullable = false, length = 50)
    private String afdelingsnavn;
    @Basic
    @Column(name = "afdelingsleder", nullable = false, length = 50)
    private String afdelingsleder;
    @Basic
    @Column(name = "afdelingslederid", nullable = true)
    private Integer afdelingslederid;

    public Integer getBrugerid() {
        return brugerid;
    }

    public void setBrugerid(Integer brugerid) {
        this.brugerid = brugerid;
    }

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

    public Date getOprettetdato() {
        return oprettetdato;
    }

    public void setOprettetdato(Date oprettetdato) {
        this.oprettetdato = oprettetdato;
    }

    public Integer getOprettetafid() {
        return oprettetafid;
    }

    public void setOprettetafid(Integer oprettetafid) {
        this.oprettetafid = oprettetafid;
    }

    public String getLoginbrugernavn() {
        return loginbrugernavn;
    }

    public void setLoginbrugernavn(String loginbrugernavn) {
        this.loginbrugernavn = loginbrugernavn;
    }

    public Integer getRettetafid() {
        return rettetafid;
    }

    public void setRettetafid(Integer rettetafid) {
        this.rettetafid = rettetafid;
    }

    public String getRettetaf() {
        return rettetaf;
    }

    public void setRettetaf(String rettetaf) {
        this.rettetaf = rettetaf;
    }

    public Integer getAfsluttetafid() {
        return afsluttetafid;
    }

    public void setAfsluttetafid(Integer afsluttetafid) {
        this.afsluttetafid = afsluttetafid;
    }

    public String getAfsluttetaf() {
        return afsluttetaf;
    }

    public void setAfsluttetaf(String afsluttetaf) {
        this.afsluttetaf = afsluttetaf;
    }

    public String getOprettetaf() {
        return oprettetaf;
    }

    public void setOprettetaf(String oprettetaf) {
        this.oprettetaf = oprettetaf;
    }

    public String getBrugernavn() {
        return brugernavn;
    }

    public void setBrugernavn(String brugernavn) {
        this.brugernavn = brugernavn;
    }

    public Date getRettetdato() {
        return rettetdato;
    }

    public void setRettetdato(Date rettetdato) {
        this.rettetdato = rettetdato;
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

    public String getAfdelingsleder() {
        return afdelingsleder;
    }

    public void setAfdelingsleder(String afdelingsleder) {
        this.afdelingsleder = afdelingsleder;
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

        Brugereview that = (Brugereview) o;

        if (brugerid != null ? !brugerid.equals(that.brugerid) : that.brugerid != null) return false;
        if (titelid != null ? !titelid.equals(that.titelid) : that.titelid != null) return false;
        if (titelnavn != null ? !titelnavn.equals(that.titelnavn) : that.titelnavn != null) return false;
        if (oprettetdato != null ? !oprettetdato.equals(that.oprettetdato) : that.oprettetdato != null) return false;
        if (oprettetafid != null ? !oprettetafid.equals(that.oprettetafid) : that.oprettetafid != null) return false;
        if (loginbrugernavn != null ? !loginbrugernavn.equals(that.loginbrugernavn) : that.loginbrugernavn != null)
            return false;
        if (rettetafid != null ? !rettetafid.equals(that.rettetafid) : that.rettetafid != null) return false;
        if (rettetaf != null ? !rettetaf.equals(that.rettetaf) : that.rettetaf != null) return false;
        if (afsluttetafid != null ? !afsluttetafid.equals(that.afsluttetafid) : that.afsluttetafid != null)
            return false;
        if (afsluttetaf != null ? !afsluttetaf.equals(that.afsluttetaf) : that.afsluttetaf != null) return false;
        if (oprettetaf != null ? !oprettetaf.equals(that.oprettetaf) : that.oprettetaf != null) return false;
        if (brugernavn != null ? !brugernavn.equals(that.brugernavn) : that.brugernavn != null) return false;
        if (rettetdato != null ? !rettetdato.equals(that.rettetdato) : that.rettetdato != null) return false;
        if (afsluttetdato != null ? !afsluttetdato.equals(that.afsluttetdato) : that.afsluttetdato != null)
            return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (afdelingid != null ? !afdelingid.equals(that.afdelingid) : that.afdelingid != null) return false;
        if (afdelingsnavn != null ? !afdelingsnavn.equals(that.afdelingsnavn) : that.afdelingsnavn != null)
            return false;
        if (afdelingsleder != null ? !afdelingsleder.equals(that.afdelingsleder) : that.afdelingsleder != null)
            return false;
        if (afdelingslederid != null ? !afdelingslederid.equals(that.afdelingslederid) : that.afdelingslederid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = brugerid != null ? brugerid.hashCode() : 0;
        result = 31 * result + (titelid != null ? titelid.hashCode() : 0);
        result = 31 * result + (titelnavn != null ? titelnavn.hashCode() : 0);
        result = 31 * result + (oprettetdato != null ? oprettetdato.hashCode() : 0);
        result = 31 * result + (oprettetafid != null ? oprettetafid.hashCode() : 0);
        result = 31 * result + (loginbrugernavn != null ? loginbrugernavn.hashCode() : 0);
        result = 31 * result + (rettetafid != null ? rettetafid.hashCode() : 0);
        result = 31 * result + (rettetaf != null ? rettetaf.hashCode() : 0);
        result = 31 * result + (afsluttetafid != null ? afsluttetafid.hashCode() : 0);
        result = 31 * result + (afsluttetaf != null ? afsluttetaf.hashCode() : 0);
        result = 31 * result + (oprettetaf != null ? oprettetaf.hashCode() : 0);
        result = 31 * result + (brugernavn != null ? brugernavn.hashCode() : 0);
        result = 31 * result + (rettetdato != null ? rettetdato.hashCode() : 0);
        result = 31 * result + (afsluttetdato != null ? afsluttetdato.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (afdelingid != null ? afdelingid.hashCode() : 0);
        result = 31 * result + (afdelingsnavn != null ? afdelingsnavn.hashCode() : 0);
        result = 31 * result + (afdelingsleder != null ? afdelingsleder.hashCode() : 0);
        result = 31 * result + (afdelingslederid != null ? afdelingslederid.hashCode() : 0);
        return result;
    }
}

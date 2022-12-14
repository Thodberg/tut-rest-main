package akademikerne.domain.table;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class System2 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "systemid", nullable = false)
    private Integer systemid;
    @Basic
    @Column(name = "systemnavn", nullable = false, length = 50)
    private String systemnavn;
    @Basic
    @Column(name = "adgangadstyret", nullable = false)
    private Boolean adgangadstyret;
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

    public Integer getSystemid() {
        return systemid;
    }

    public void setSystemid(Integer systemid) {
        this.systemid = systemid;
    }

    public String getSystemnavn() {
        return systemnavn;
    }

    public void setSystemnavn(String systemnavn) {
        this.systemnavn = systemnavn;
    }

    public Boolean getAdgangadstyret() {
        return adgangadstyret;
    }

    public void setAdgangadstyret(Boolean adgangadstyret) {
        this.adgangadstyret = adgangadstyret;
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

        System2 system2 = (System2) o;

        if (systemid != null ? !systemid.equals(system2.systemid) : system2.systemid != null) return false;
        if (systemnavn != null ? !systemnavn.equals(system2.systemnavn) : system2.systemnavn != null) return false;
        if (adgangadstyret != null ? !adgangadstyret.equals(system2.adgangadstyret) : system2.adgangadstyret != null)
            return false;
        if (oprettetafid != null ? !oprettetafid.equals(system2.oprettetafid) : system2.oprettetafid != null)
            return false;
        if (oprettetdato != null ? !oprettetdato.equals(system2.oprettetdato) : system2.oprettetdato != null)
            return false;
        if (rettetafid != null ? !rettetafid.equals(system2.rettetafid) : system2.rettetafid != null) return false;
        if (rettetdato != null ? !rettetdato.equals(system2.rettetdato) : system2.rettetdato != null) return false;
        if (afsluttetafid != null ? !afsluttetafid.equals(system2.afsluttetafid) : system2.afsluttetafid != null)
            return false;
        if (afsluttetdato != null ? !afsluttetdato.equals(system2.afsluttetdato) : system2.afsluttetdato != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = systemid != null ? systemid.hashCode() : 0;
        result = 31 * result + (systemnavn != null ? systemnavn.hashCode() : 0);
        result = 31 * result + (adgangadstyret != null ? adgangadstyret.hashCode() : 0);
        result = 31 * result + (oprettetafid != null ? oprettetafid.hashCode() : 0);
        result = 31 * result + (oprettetdato != null ? oprettetdato.hashCode() : 0);
        result = 31 * result + (rettetafid != null ? rettetafid.hashCode() : 0);
        result = 31 * result + (rettetdato != null ? rettetdato.hashCode() : 0);
        result = 31 * result + (afsluttetafid != null ? afsluttetafid.hashCode() : 0);
        result = 31 * result + (afsluttetdato != null ? afsluttetdato.hashCode() : 0);
        return result;
    }
}

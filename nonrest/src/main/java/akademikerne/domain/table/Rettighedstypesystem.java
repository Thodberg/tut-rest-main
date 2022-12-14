package akademikerne.domain.table;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Rettighedstypesystem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "rettighedstypesystemid", nullable = false)
    private Integer rettighedstypesystemid;
    @Basic
    @Column(name = "rettighedstypeid", nullable = false)
    private Integer rettighedstypeid;
    @Basic
    @Column(name = "systemid", nullable = false)
    private Integer systemid;
    @Basic
    @Column(name = "adstyret", nullable = false)
    private Boolean adstyret;
    @Basic
    @Column(name = "automatiskopdatering", nullable = false)
    private Boolean automatiskopdatering;
    @Basic
    @Column(name = "revideringsfrekvens", nullable = false)
    private Integer revideringsfrekvens;
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
    @Column(name = "Rettetdato", nullable = true)
    private Date rettetdato;
    @Basic
    @Column(name = "afsluttetafid", nullable = true)
    private Integer afsluttetafid;
    @Basic
    @Column(name = "afsluttetdato", nullable = true)
    private Date afsluttetdato;

    public Integer getRettighedstypesystemid() {
        return rettighedstypesystemid;
    }

    public void setRettighedstypesystemid(Integer rettighedstypesystemid) {
        this.rettighedstypesystemid = rettighedstypesystemid;
    }

    public Integer getRettighedstypeid() {
        return rettighedstypeid;
    }

    public void setRettighedstypeid(Integer rettighedstypeid) {
        this.rettighedstypeid = rettighedstypeid;
    }

    public Integer getSystemid() {
        return systemid;
    }

    public void setSystemid(Integer systemid) {
        this.systemid = systemid;
    }

    public Boolean getAdstyret() {
        return adstyret;
    }

    public void setAdstyret(Boolean adstyret) {
        this.adstyret = adstyret;
    }

    public Boolean getAutomatiskopdatering() {
        return automatiskopdatering;
    }

    public void setAutomatiskopdatering(Boolean automatiskopdatering) {
        this.automatiskopdatering = automatiskopdatering;
    }

    public Integer getRevideringsfrekvens() {
        return revideringsfrekvens;
    }

    public void setRevideringsfrekvens(Integer revideringsfrekvens) {
        this.revideringsfrekvens = revideringsfrekvens;
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

        Rettighedstypesystem that = (Rettighedstypesystem) o;

        if (rettighedstypesystemid != null ? !rettighedstypesystemid.equals(that.rettighedstypesystemid) : that.rettighedstypesystemid != null)
            return false;
        if (rettighedstypeid != null ? !rettighedstypeid.equals(that.rettighedstypeid) : that.rettighedstypeid != null)
            return false;
        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (adstyret != null ? !adstyret.equals(that.adstyret) : that.adstyret != null) return false;
        if (automatiskopdatering != null ? !automatiskopdatering.equals(that.automatiskopdatering) : that.automatiskopdatering != null)
            return false;
        if (revideringsfrekvens != null ? !revideringsfrekvens.equals(that.revideringsfrekvens) : that.revideringsfrekvens != null)
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
        int result = rettighedstypesystemid != null ? rettighedstypesystemid.hashCode() : 0;
        result = 31 * result + (rettighedstypeid != null ? rettighedstypeid.hashCode() : 0);
        result = 31 * result + (systemid != null ? systemid.hashCode() : 0);
        result = 31 * result + (adstyret != null ? adstyret.hashCode() : 0);
        result = 31 * result + (automatiskopdatering != null ? automatiskopdatering.hashCode() : 0);
        result = 31 * result + (revideringsfrekvens != null ? revideringsfrekvens.hashCode() : 0);
        result = 31 * result + (oprettetafid != null ? oprettetafid.hashCode() : 0);
        result = 31 * result + (oprettetdato != null ? oprettetdato.hashCode() : 0);
        result = 31 * result + (rettetafid != null ? rettetafid.hashCode() : 0);
        result = 31 * result + (rettetdato != null ? rettetdato.hashCode() : 0);
        result = 31 * result + (afsluttetafid != null ? afsluttetafid.hashCode() : 0);
        result = 31 * result + (afsluttetdato != null ? afsluttetdato.hashCode() : 0);
        return result;
    }
}

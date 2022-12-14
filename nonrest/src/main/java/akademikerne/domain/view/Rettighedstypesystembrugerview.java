package akademikerne.domain.view;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Rettighedstypesystembrugerview {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Basic
    @Column(name = "rettighedstypesystembrugerID", nullable = false)
    private Integer rettighedstypesystembrugerId;
    @Basic
    @Column(name = "brugerid", nullable = false)
    private Integer brugerid;
    @Basic
    @Column(name = "brugernavn", nullable = false, length = 50)
    private String brugernavn;
    @Basic
    @Column(name = "afdelingid", nullable = false)
    private Integer afdelingid;
    @Basic
    @Column(name = "afdelingsnavn", nullable = false, length = 50)
    private String afdelingsnavn;
    @Basic
    @Column(name = "titelid", nullable = false)
    private Integer titelid;
    @Basic
    @Column(name = "titelnavn", nullable = false, length = 50)
    private String titelnavn;
    @Basic
    @Column(name = "systemid", nullable = false)
    private Integer systemid;
    @Basic
    @Column(name = "systemnavn", nullable = false, length = 50)
    private String systemnavn;
    @Basic
    @Column(name = "rettighedstypeid", nullable = false)
    private Integer rettighedstypeid;
    @Basic
    @Column(name = "rettighedsnavn", nullable = false, length = 50)
    private String rettighedsnavn;
    @Basic
    @Column(name = "oprettetdato", nullable = false)
    private Date oprettetdato;
    @Basic
    @Column(name = "rettetdato", nullable = true)
    private Date rettetdato;
    @Basic
    @Column(name = "revideretdato", nullable = true)
    private Date revideretdato;
    @Basic
    @Column(name = "afsluttetdato", nullable = true)
    private Date afsluttetdato;
    @Basic
    @Column(name = "rettighedstypesystemid", nullable = false)
    private Integer rettighedstypesystemid;
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
    @Column(name = "rolleindehaver", nullable = false, length = 50)
    private String rolleindehaver;
    @Basic
    @Column(name = "rolleindehaverid", nullable = false)
    private Integer rolleindehaverid;
    @Basic
    @Column(name = "rollenavn", nullable = false, length = 50)
    private String rollenavn;
    @Basic
    @Column(name = "rettetafid", nullable = true)
    private Integer rettetafid;
    @Basic
    @Column(name = "revideretafid", nullable = true)
    private Integer revideretafid;
    @Basic
    @Column(name = "afsluttetafid", nullable = true)
    private Integer afsluttetafid;
    @Basic
    @Column(name = "afdelingsleder", nullable = false, length = 50)
    private String afdelingsleder;
    @Basic
    @Column(name = "afdelingslederid", nullable = true)
    private Integer afdelingslederid;
    @Basic
    @Column(name = "oprettetafid", nullable = false)
    private Integer oprettetafid;
    @Basic
    @Column(name = "rolleid", nullable = false)
    private Integer rolleid;
    @Basic
    @Column(name = "rollebrugerid", nullable = false)
    private Integer rollebrugerid;
    @Basic
    @Column(name = "oprettetaf", nullable = false, length = 50)
    private String oprettetaf;
    @Basic
    @Column(name = "rettetaf", nullable = true, length = 50)
    private String rettetaf;
    @Basic
    @Column(name = "revideretaf", nullable = true, length = 50)
    private String revideretaf;
    @Basic
    @Column(name = "naesterevideringsdato", nullable = true)
    private Date naesterevideringsdato;
    @Basic
    @Column(name = "afsluttetaf", nullable = true, length = 50)
    private String afsluttetaf;

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

    public String getAfdelingsnavn() {
        return afdelingsnavn;
    }

    public void setAfdelingsnavn(String afdelingsnavn) {
        this.afdelingsnavn = afdelingsnavn;
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

    public Date getOprettetdato() {
        return oprettetdato;
    }

    public void setOprettetdato(Date oprettetdato) {
        this.oprettetdato = oprettetdato;
    }

    public Date getRettetdato() {
        return rettetdato;
    }

    public void setRettetdato(Date rettetdato) {
        this.rettetdato = rettetdato;
    }

    public Date getRevideretdato() {
        return revideretdato;
    }

    public void setRevideretdato(Date revideretdato) {
        this.revideretdato = revideretdato;
    }

    public Date getAfsluttetdato() {
        return afsluttetdato;
    }

    public void setAfsluttetdato(Date afsluttetdato) {
        this.afsluttetdato = afsluttetdato;
    }

    public Integer getRettighedstypesystemid() {
        return rettighedstypesystemid;
    }

    public void setRettighedstypesystemid(Integer rettighedstypesystemid) {
        this.rettighedstypesystemid = rettighedstypesystemid;
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

    public String getRolleindehaver() {
        return rolleindehaver;
    }

    public void setRolleindehaver(String rolleindehaver) {
        this.rolleindehaver = rolleindehaver;
    }

    public Integer getRolleindehaverid() {
        return rolleindehaverid;
    }

    public void setRolleindehaverid(Integer rolleindehaverid) {
        this.rolleindehaverid = rolleindehaverid;
    }

    public String getRollenavn() {
        return rollenavn;
    }

    public void setRollenavn(String rollenavn) {
        this.rollenavn = rollenavn;
    }

    public Integer getRettetafid() {
        return rettetafid;
    }

    public void setRettetafid(Integer rettetafid) {
        this.rettetafid = rettetafid;
    }

    public Integer getRevideretafid() {
        return revideretafid;
    }

    public void setRevideretafid(Integer revideretafid) {
        this.revideretafid = revideretafid;
    }

    public Integer getAfsluttetafid() {
        return afsluttetafid;
    }

    public void setAfsluttetafid(Integer afsluttetafid) {
        this.afsluttetafid = afsluttetafid;
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

    public Integer getOprettetafid() {
        return oprettetafid;
    }

    public void setOprettetafid(Integer oprettetafid) {
        this.oprettetafid = oprettetafid;
    }

    public Integer getRolleid() {
        return rolleid;
    }

    public void setRolleid(Integer rolleid) {
        this.rolleid = rolleid;
    }

    public Integer getRollebrugerid() {
        return rollebrugerid;
    }

    public void setRollebrugerid(Integer rollebrugerid) {
        this.rollebrugerid = rollebrugerid;
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

    public String getRevideretaf() {
        return revideretaf;
    }

    public void setRevideretaf(String revideretaf) {
        this.revideretaf = revideretaf;
    }

    public Date getNaesterevideringsdato() {
        return naesterevideringsdato;
    }

    public void setNaesterevideringsdato(Date naesterevideringsdato) {
        this.naesterevideringsdato = naesterevideringsdato;
    }

    public String getAfsluttetaf() {
        return afsluttetaf;
    }

    public void setAfsluttetaf(String afsluttetaf) {
        this.afsluttetaf = afsluttetaf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rettighedstypesystembrugerview that = (Rettighedstypesystembrugerview) o;

        if (rettighedstypesystembrugerId != null ? !rettighedstypesystembrugerId.equals(that.rettighedstypesystembrugerId) : that.rettighedstypesystembrugerId != null)
            return false;
        if (brugerid != null ? !brugerid.equals(that.brugerid) : that.brugerid != null) return false;
        if (brugernavn != null ? !brugernavn.equals(that.brugernavn) : that.brugernavn != null) return false;
        if (afdelingid != null ? !afdelingid.equals(that.afdelingid) : that.afdelingid != null) return false;
        if (afdelingsnavn != null ? !afdelingsnavn.equals(that.afdelingsnavn) : that.afdelingsnavn != null)
            return false;
        if (titelid != null ? !titelid.equals(that.titelid) : that.titelid != null) return false;
        if (titelnavn != null ? !titelnavn.equals(that.titelnavn) : that.titelnavn != null) return false;
        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (systemnavn != null ? !systemnavn.equals(that.systemnavn) : that.systemnavn != null) return false;
        if (rettighedstypeid != null ? !rettighedstypeid.equals(that.rettighedstypeid) : that.rettighedstypeid != null)
            return false;
        if (rettighedsnavn != null ? !rettighedsnavn.equals(that.rettighedsnavn) : that.rettighedsnavn != null)
            return false;
        if (oprettetdato != null ? !oprettetdato.equals(that.oprettetdato) : that.oprettetdato != null) return false;
        if (rettetdato != null ? !rettetdato.equals(that.rettetdato) : that.rettetdato != null) return false;
        if (revideretdato != null ? !revideretdato.equals(that.revideretdato) : that.revideretdato != null)
            return false;
        if (afsluttetdato != null ? !afsluttetdato.equals(that.afsluttetdato) : that.afsluttetdato != null)
            return false;
        if (rettighedstypesystemid != null ? !rettighedstypesystemid.equals(that.rettighedstypesystemid) : that.rettighedstypesystemid != null)
            return false;
        if (adstyret != null ? !adstyret.equals(that.adstyret) : that.adstyret != null) return false;
        if (automatiskopdatering != null ? !automatiskopdatering.equals(that.automatiskopdatering) : that.automatiskopdatering != null)
            return false;
        if (revideringsfrekvens != null ? !revideringsfrekvens.equals(that.revideringsfrekvens) : that.revideringsfrekvens != null)
            return false;
        if (rolleindehaver != null ? !rolleindehaver.equals(that.rolleindehaver) : that.rolleindehaver != null)
            return false;
        if (rolleindehaverid != null ? !rolleindehaverid.equals(that.rolleindehaverid) : that.rolleindehaverid != null)
            return false;
        if (rollenavn != null ? !rollenavn.equals(that.rollenavn) : that.rollenavn != null) return false;
        if (rettetafid != null ? !rettetafid.equals(that.rettetafid) : that.rettetafid != null) return false;
        if (revideretafid != null ? !revideretafid.equals(that.revideretafid) : that.revideretafid != null)
            return false;
        if (afsluttetafid != null ? !afsluttetafid.equals(that.afsluttetafid) : that.afsluttetafid != null)
            return false;
        if (afdelingsleder != null ? !afdelingsleder.equals(that.afdelingsleder) : that.afdelingsleder != null)
            return false;
        if (afdelingslederid != null ? !afdelingslederid.equals(that.afdelingslederid) : that.afdelingslederid != null)
            return false;
        if (oprettetafid != null ? !oprettetafid.equals(that.oprettetafid) : that.oprettetafid != null) return false;
        if (rolleid != null ? !rolleid.equals(that.rolleid) : that.rolleid != null) return false;
        if (rollebrugerid != null ? !rollebrugerid.equals(that.rollebrugerid) : that.rollebrugerid != null)
            return false;
        if (oprettetaf != null ? !oprettetaf.equals(that.oprettetaf) : that.oprettetaf != null) return false;
        if (rettetaf != null ? !rettetaf.equals(that.rettetaf) : that.rettetaf != null) return false;
        if (revideretaf != null ? !revideretaf.equals(that.revideretaf) : that.revideretaf != null) return false;
        if (naesterevideringsdato != null ? !naesterevideringsdato.equals(that.naesterevideringsdato) : that.naesterevideringsdato != null)
            return false;
        if (afsluttetaf != null ? !afsluttetaf.equals(that.afsluttetaf) : that.afsluttetaf != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rettighedstypesystembrugerId != null ? rettighedstypesystembrugerId.hashCode() : 0;
        result = 31 * result + (brugerid != null ? brugerid.hashCode() : 0);
        result = 31 * result + (brugernavn != null ? brugernavn.hashCode() : 0);
        result = 31 * result + (afdelingid != null ? afdelingid.hashCode() : 0);
        result = 31 * result + (afdelingsnavn != null ? afdelingsnavn.hashCode() : 0);
        result = 31 * result + (titelid != null ? titelid.hashCode() : 0);
        result = 31 * result + (titelnavn != null ? titelnavn.hashCode() : 0);
        result = 31 * result + (systemid != null ? systemid.hashCode() : 0);
        result = 31 * result + (systemnavn != null ? systemnavn.hashCode() : 0);
        result = 31 * result + (rettighedstypeid != null ? rettighedstypeid.hashCode() : 0);
        result = 31 * result + (rettighedsnavn != null ? rettighedsnavn.hashCode() : 0);
        result = 31 * result + (oprettetdato != null ? oprettetdato.hashCode() : 0);
        result = 31 * result + (rettetdato != null ? rettetdato.hashCode() : 0);
        result = 31 * result + (revideretdato != null ? revideretdato.hashCode() : 0);
        result = 31 * result + (afsluttetdato != null ? afsluttetdato.hashCode() : 0);
        result = 31 * result + (rettighedstypesystemid != null ? rettighedstypesystemid.hashCode() : 0);
        result = 31 * result + (adstyret != null ? adstyret.hashCode() : 0);
        result = 31 * result + (automatiskopdatering != null ? automatiskopdatering.hashCode() : 0);
        result = 31 * result + (revideringsfrekvens != null ? revideringsfrekvens.hashCode() : 0);
        result = 31 * result + (rolleindehaver != null ? rolleindehaver.hashCode() : 0);
        result = 31 * result + (rolleindehaverid != null ? rolleindehaverid.hashCode() : 0);
        result = 31 * result + (rollenavn != null ? rollenavn.hashCode() : 0);
        result = 31 * result + (rettetafid != null ? rettetafid.hashCode() : 0);
        result = 31 * result + (revideretafid != null ? revideretafid.hashCode() : 0);
        result = 31 * result + (afsluttetafid != null ? afsluttetafid.hashCode() : 0);
        result = 31 * result + (afdelingsleder != null ? afdelingsleder.hashCode() : 0);
        result = 31 * result + (afdelingslederid != null ? afdelingslederid.hashCode() : 0);
        result = 31 * result + (oprettetafid != null ? oprettetafid.hashCode() : 0);
        result = 31 * result + (rolleid != null ? rolleid.hashCode() : 0);
        result = 31 * result + (rollebrugerid != null ? rollebrugerid.hashCode() : 0);
        result = 31 * result + (oprettetaf != null ? oprettetaf.hashCode() : 0);
        result = 31 * result + (rettetaf != null ? rettetaf.hashCode() : 0);
        result = 31 * result + (revideretaf != null ? revideretaf.hashCode() : 0);
        result = 31 * result + (naesterevideringsdato != null ? naesterevideringsdato.hashCode() : 0);
        result = 31 * result + (afsluttetaf != null ? afsluttetaf.hashCode() : 0);
        return result;
    }
}

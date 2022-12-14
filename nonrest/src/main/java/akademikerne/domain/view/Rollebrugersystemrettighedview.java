package akademikerne.domain.view;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rollebrugersystemrettighedview {
    @Id
    @Basic
    @Column(name = "rollebrugerid", nullable = false)
    private Integer rollebrugerid;
    @Basic
    @Column(name = "systemid", nullable = false)
    private Integer systemid;
    @Basic
    @Column(name = "rollenavn", nullable = false, length = 50)
    private String rollenavn;
    @Basic
    @Column(name = "rolleid", nullable = false)
    private Integer rolleid;
    @Basic
    @Column(name = "systemnavn", nullable = false, length = 50)
    private String systemnavn;
    @Basic
    @Column(name = "rettighedstypesystemid", nullable = false)
    private Integer rettighedstypesystemid;
    @Basic
    @Column(name = "rettighedsnavn", nullable = false, length = 50)
    private String rettighedsnavn;
    @Basic
    @Column(name = "rettighedstypeid", nullable = false)
    private Integer rettighedstypeid;
    @Basic
    @Column(name = "rollerbrugersystemid", nullable = false)
    private Integer rollerbrugersystemid;
    @Basic
    @Column(name = "rolleindehaver", nullable = false, length = 50)
    private String rolleindehaver;
    @Basic
    @Column(name = "rolleindehaverid", nullable = false)
    private Integer rolleindehaverid;
    @Basic
    @Column(name = "adstyret", nullable = false)
    private Boolean adstyret;
    @Basic
    @Column(name = "automatiskopdatering", nullable = false)
    private Boolean automatiskopdatering;
    @Basic
    @Column(name = "revideringsfrekvens", nullable = false)
    private Integer revideringsfrekvens;

    public Integer getRollebrugerid() {
        return rollebrugerid;
    }

    public void setRollebrugerid(Integer rollebrugerid) {
        this.rollebrugerid = rollebrugerid;
    }

    public Integer getSystemid() {
        return systemid;
    }

    public void setSystemid(Integer systemid) {
        this.systemid = systemid;
    }

    public String getRollenavn() {
        return rollenavn;
    }

    public void setRollenavn(String rollenavn) {
        this.rollenavn = rollenavn;
    }

    public Integer getRolleid() {
        return rolleid;
    }

    public void setRolleid(Integer rolleid) {
        this.rolleid = rolleid;
    }

    public String getSystemnavn() {
        return systemnavn;
    }

    public void setSystemnavn(String systemnavn) {
        this.systemnavn = systemnavn;
    }

    public Integer getRettighedstypesystemid() {
        return rettighedstypesystemid;
    }

    public void setRettighedstypesystemid(Integer rettighedstypesystemid) {
        this.rettighedstypesystemid = rettighedstypesystemid;
    }

    public String getRettighedsnavn() {
        return rettighedsnavn;
    }

    public void setRettighedsnavn(String rettighedsnavn) {
        this.rettighedsnavn = rettighedsnavn;
    }

    public Integer getRettighedstypeid() {
        return rettighedstypeid;
    }

    public void setRettighedstypeid(Integer rettighedstypeid) {
        this.rettighedstypeid = rettighedstypeid;
    }

    public Integer getRollerbrugersystemid() {
        return rollerbrugersystemid;
    }

    public void setRollerbrugersystemid(Integer rollerbrugersystemid) {
        this.rollerbrugersystemid = rollerbrugersystemid;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rollebrugersystemrettighedview that = (Rollebrugersystemrettighedview) o;

        if (rollebrugerid != null ? !rollebrugerid.equals(that.rollebrugerid) : that.rollebrugerid != null)
            return false;
        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (rollenavn != null ? !rollenavn.equals(that.rollenavn) : that.rollenavn != null) return false;
        if (rolleid != null ? !rolleid.equals(that.rolleid) : that.rolleid != null) return false;
        if (systemnavn != null ? !systemnavn.equals(that.systemnavn) : that.systemnavn != null) return false;
        if (rettighedstypesystemid != null ? !rettighedstypesystemid.equals(that.rettighedstypesystemid) : that.rettighedstypesystemid != null)
            return false;
        if (rettighedsnavn != null ? !rettighedsnavn.equals(that.rettighedsnavn) : that.rettighedsnavn != null)
            return false;
        if (rettighedstypeid != null ? !rettighedstypeid.equals(that.rettighedstypeid) : that.rettighedstypeid != null)
            return false;
        if (rollerbrugersystemid != null ? !rollerbrugersystemid.equals(that.rollerbrugersystemid) : that.rollerbrugersystemid != null)
            return false;
        if (rolleindehaver != null ? !rolleindehaver.equals(that.rolleindehaver) : that.rolleindehaver != null)
            return false;
        if (rolleindehaverid != null ? !rolleindehaverid.equals(that.rolleindehaverid) : that.rolleindehaverid != null)
            return false;
        if (adstyret != null ? !adstyret.equals(that.adstyret) : that.adstyret != null) return false;
        if (automatiskopdatering != null ? !automatiskopdatering.equals(that.automatiskopdatering) : that.automatiskopdatering != null)
            return false;
        if (revideringsfrekvens != null ? !revideringsfrekvens.equals(that.revideringsfrekvens) : that.revideringsfrekvens != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rollebrugerid != null ? rollebrugerid.hashCode() : 0;
        result = 31 * result + (systemid != null ? systemid.hashCode() : 0);
        result = 31 * result + (rollenavn != null ? rollenavn.hashCode() : 0);
        result = 31 * result + (rolleid != null ? rolleid.hashCode() : 0);
        result = 31 * result + (systemnavn != null ? systemnavn.hashCode() : 0);
        result = 31 * result + (rettighedstypesystemid != null ? rettighedstypesystemid.hashCode() : 0);
        result = 31 * result + (rettighedsnavn != null ? rettighedsnavn.hashCode() : 0);
        result = 31 * result + (rettighedstypeid != null ? rettighedstypeid.hashCode() : 0);
        result = 31 * result + (rollerbrugersystemid != null ? rollerbrugersystemid.hashCode() : 0);
        result = 31 * result + (rolleindehaver != null ? rolleindehaver.hashCode() : 0);
        result = 31 * result + (rolleindehaverid != null ? rolleindehaverid.hashCode() : 0);
        result = 31 * result + (adstyret != null ? adstyret.hashCode() : 0);
        result = 31 * result + (automatiskopdatering != null ? automatiskopdatering.hashCode() : 0);
        result = 31 * result + (revideringsfrekvens != null ? revideringsfrekvens.hashCode() : 0);
        return result;
    }
}

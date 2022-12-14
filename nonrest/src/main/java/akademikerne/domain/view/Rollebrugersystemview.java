package akademikerne.domain.view;

import javax.persistence.*;

@Entity
public class Rollebrugersystemview {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Basic
    @Column(name = "rollerbrugersystemid", nullable = false)
    private Integer rollerbrugersystemid;
    @Basic
    @Column(name = "systemnavn", nullable = false, length = 50)
    private String systemnavn;
    @Basic
    @Column(name = "systemid", nullable = false)
    private Integer systemid;
    @Basic
    @Column(name = "titelnavn", nullable = false, length = 50)
    private String titelnavn;
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
    @Column(name = "rollenavn", nullable = false, length = 50)
    private String rollenavn;
    @Basic
    @Column(name = "rolleid", nullable = false)
    private Integer rolleid;
    @Basic
    @Column(name = "rollebrugerid", nullable = false)
    private Integer rollebrugerid;
    @Basic
    @Column(name = "rolleindehaver", nullable = false, length = 50)
    private String rolleindehaver;
    @Basic
    @Column(name = "rolleindehaverid", nullable = false)
    private Integer rolleindehaverid;
    @Basic
    @Column(name = "oprettetafid", nullable = false)
    private Integer oprettetafid;
    @Basic
    @Column(name = "oprettetaf", nullable = false, length = 50)
    private String oprettetaf;
    @Basic
    @Column(name = "rettetaf", nullable = true, length = 50)
    private String rettetaf;
    @Basic
    @Column(name = "rettetafid", nullable = true)
    private Integer rettetafid;
    @Basic
    @Column(name = "adgangadstyret", nullable = false)
    private Boolean adgangadstyret;
    @Basic
    @Column(name = "afsluttetaf", nullable = true, length = 50)
    private String afsluttetaf;
    @Basic
    @Column(name = "afsluttetafid", nullable = true)
    private Integer afsluttetafid;

    public Integer getRollerbrugersystemid() {
        return rollerbrugersystemid;
    }

    public void setRollerbrugersystemid(Integer rollerbrugersystemid) {
        this.rollerbrugersystemid = rollerbrugersystemid;
    }

    public String getSystemnavn() {
        return systemnavn;
    }

    public void setSystemnavn(String systemnavn) {
        this.systemnavn = systemnavn;
    }

    public Integer getSystemid() {
        return systemid;
    }

    public void setSystemid(Integer systemid) {
        this.systemid = systemid;
    }

    public String getTitelnavn() {
        return titelnavn;
    }

    public void setTitelnavn(String titelnavn) {
        this.titelnavn = titelnavn;
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

    public Integer getRollebrugerid() {
        return rollebrugerid;
    }

    public void setRollebrugerid(Integer rollebrugerid) {
        this.rollebrugerid = rollebrugerid;
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

    public Integer getRettetafid() {
        return rettetafid;
    }

    public void setRettetafid(Integer rettetafid) {
        this.rettetafid = rettetafid;
    }

    public Boolean getAdgangadstyret() {
        return adgangadstyret;
    }

    public void setAdgangadstyret(Boolean adgangadstyret) {
        this.adgangadstyret = adgangadstyret;
    }

    public String getAfsluttetaf() {
        return afsluttetaf;
    }

    public void setAfsluttetaf(String afsluttetaf) {
        this.afsluttetaf = afsluttetaf;
    }

    public Integer getAfsluttetafid() {
        return afsluttetafid;
    }

    public void setAfsluttetafid(Integer afsluttetafid) {
        this.afsluttetafid = afsluttetafid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rollebrugersystemview that = (Rollebrugersystemview) o;

        if (rollerbrugersystemid != null ? !rollerbrugersystemid.equals(that.rollerbrugersystemid) : that.rollerbrugersystemid != null)
            return false;
        if (systemnavn != null ? !systemnavn.equals(that.systemnavn) : that.systemnavn != null) return false;
        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (titelnavn != null ? !titelnavn.equals(that.titelnavn) : that.titelnavn != null) return false;
        if (afdelingid != null ? !afdelingid.equals(that.afdelingid) : that.afdelingid != null) return false;
        if (afdelingsnavn != null ? !afdelingsnavn.equals(that.afdelingsnavn) : that.afdelingsnavn != null)
            return false;
        if (titelid != null ? !titelid.equals(that.titelid) : that.titelid != null) return false;
        if (rollenavn != null ? !rollenavn.equals(that.rollenavn) : that.rollenavn != null) return false;
        if (rolleid != null ? !rolleid.equals(that.rolleid) : that.rolleid != null) return false;
        if (rollebrugerid != null ? !rollebrugerid.equals(that.rollebrugerid) : that.rollebrugerid != null)
            return false;
        if (rolleindehaver != null ? !rolleindehaver.equals(that.rolleindehaver) : that.rolleindehaver != null)
            return false;
        if (rolleindehaverid != null ? !rolleindehaverid.equals(that.rolleindehaverid) : that.rolleindehaverid != null)
            return false;
        if (oprettetafid != null ? !oprettetafid.equals(that.oprettetafid) : that.oprettetafid != null) return false;
        if (oprettetaf != null ? !oprettetaf.equals(that.oprettetaf) : that.oprettetaf != null) return false;
        if (rettetaf != null ? !rettetaf.equals(that.rettetaf) : that.rettetaf != null) return false;
        if (rettetafid != null ? !rettetafid.equals(that.rettetafid) : that.rettetafid != null) return false;
        if (adgangadstyret != null ? !adgangadstyret.equals(that.adgangadstyret) : that.adgangadstyret != null)
            return false;
        if (afsluttetaf != null ? !afsluttetaf.equals(that.afsluttetaf) : that.afsluttetaf != null) return false;
        if (afsluttetafid != null ? !afsluttetafid.equals(that.afsluttetafid) : that.afsluttetafid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rollerbrugersystemid != null ? rollerbrugersystemid.hashCode() : 0;
        result = 31 * result + (systemnavn != null ? systemnavn.hashCode() : 0);
        result = 31 * result + (systemid != null ? systemid.hashCode() : 0);
        result = 31 * result + (titelnavn != null ? titelnavn.hashCode() : 0);
        result = 31 * result + (afdelingid != null ? afdelingid.hashCode() : 0);
        result = 31 * result + (afdelingsnavn != null ? afdelingsnavn.hashCode() : 0);
        result = 31 * result + (titelid != null ? titelid.hashCode() : 0);
        result = 31 * result + (rollenavn != null ? rollenavn.hashCode() : 0);
        result = 31 * result + (rolleid != null ? rolleid.hashCode() : 0);
        result = 31 * result + (rollebrugerid != null ? rollebrugerid.hashCode() : 0);
        result = 31 * result + (rolleindehaver != null ? rolleindehaver.hashCode() : 0);
        result = 31 * result + (rolleindehaverid != null ? rolleindehaverid.hashCode() : 0);
        result = 31 * result + (oprettetafid != null ? oprettetafid.hashCode() : 0);
        result = 31 * result + (oprettetaf != null ? oprettetaf.hashCode() : 0);
        result = 31 * result + (rettetaf != null ? rettetaf.hashCode() : 0);
        result = 31 * result + (rettetafid != null ? rettetafid.hashCode() : 0);
        result = 31 * result + (adgangadstyret != null ? adgangadstyret.hashCode() : 0);
        result = 31 * result + (afsluttetaf != null ? afsluttetaf.hashCode() : 0);
        result = 31 * result + (afsluttetafid != null ? afsluttetafid.hashCode() : 0);
        return result;
    }
}

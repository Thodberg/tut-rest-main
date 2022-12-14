package akademikerne.domain.table;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Rollerbrugersystem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "rollerbrugersystemid", nullable = false)
    private Integer rollerbrugersystemid;
    @Basic
    @Column(name = "rollerbrugerid", nullable = false)
    private Integer rollerbrugerid;
    @Basic
    @Column(name = "systemid", nullable = false)
    private Integer systemid;
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
    @Column(name = "rettetafdato", nullable = true)
    private Date rettetafdato;
    @Basic
    @Column(name = "afsluttetafid", nullable = true)
    private Integer afsluttetafid;
    @Basic
    @Column(name = "afsluttetdato", nullable = true)
    private Date afsluttetdato;

    public Integer getRollerbrugersystemid() {
        return rollerbrugersystemid;
    }

    public void setRollerbrugersystemid(Integer rollerbrugersystemid) {
        this.rollerbrugersystemid = rollerbrugersystemid;
    }

    public Integer getRollerbrugerid() {
        return rollerbrugerid;
    }

    public void setRollerbrugerid(Integer rollerbrugerid) {
        this.rollerbrugerid = rollerbrugerid;
    }

    public Integer getSystemid() {
        return systemid;
    }

    public void setSystemid(Integer systemid) {
        this.systemid = systemid;
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

    public Date getRettetafdato() {
        return rettetafdato;
    }

    public void setRettetafdato(Date rettetafdato) {
        this.rettetafdato = rettetafdato;
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

        Rollerbrugersystem that = (Rollerbrugersystem) o;

        if (rollerbrugersystemid != null ? !rollerbrugersystemid.equals(that.rollerbrugersystemid) : that.rollerbrugersystemid != null)
            return false;
        if (rollerbrugerid != null ? !rollerbrugerid.equals(that.rollerbrugerid) : that.rollerbrugerid != null)
            return false;
        if (systemid != null ? !systemid.equals(that.systemid) : that.systemid != null) return false;
        if (oprettetafid != null ? !oprettetafid.equals(that.oprettetafid) : that.oprettetafid != null) return false;
        if (oprettetdato != null ? !oprettetdato.equals(that.oprettetdato) : that.oprettetdato != null) return false;
        if (rettetafid != null ? !rettetafid.equals(that.rettetafid) : that.rettetafid != null) return false;
        if (rettetafdato != null ? !rettetafdato.equals(that.rettetafdato) : that.rettetafdato != null) return false;
        if (afsluttetafid != null ? !afsluttetafid.equals(that.afsluttetafid) : that.afsluttetafid != null)
            return false;
        if (afsluttetdato != null ? !afsluttetdato.equals(that.afsluttetdato) : that.afsluttetdato != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rollerbrugersystemid != null ? rollerbrugersystemid.hashCode() : 0;
        result = 31 * result + (rollerbrugerid != null ? rollerbrugerid.hashCode() : 0);
        result = 31 * result + (systemid != null ? systemid.hashCode() : 0);
        result = 31 * result + (oprettetafid != null ? oprettetafid.hashCode() : 0);
        result = 31 * result + (oprettetdato != null ? oprettetdato.hashCode() : 0);
        result = 31 * result + (rettetafid != null ? rettetafid.hashCode() : 0);
        result = 31 * result + (rettetafdato != null ? rettetafdato.hashCode() : 0);
        result = 31 * result + (afsluttetafid != null ? afsluttetafid.hashCode() : 0);
        result = 31 * result + (afsluttetdato != null ? afsluttetdato.hashCode() : 0);
        return result;
    }
}

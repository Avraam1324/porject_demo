package entity;

import jakarta.persistence.*;

@Entity
@Table(name = "person_con", schema = "public", catalog = "Demonstration_license")
public class PersonCon {
    private int id;
    private int idReg;
    private int idInfo;

    @Basic
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_reg", nullable = false)
    public int getIdReg() {
        return idReg;
    }

    public void setIdReg(int idReg) {
        this.idReg = idReg;
    }

    @Basic
    @Column(name = "id_info", nullable = false)
    public int getIdInfo() {
        return idInfo;
    }

    public void setIdInfo(int idInfo) {
        this.idInfo = idInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonCon personCon = (PersonCon) o;

        if (id != personCon.id) return false;
        if (idReg != personCon.idReg) return false;
        if (idInfo != personCon.idInfo) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + idReg;
        result = 31 * result + idInfo;
        return result;
    }
}

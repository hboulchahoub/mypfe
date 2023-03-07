package ma.geo.local.entities;

import javax.persistence.*;

// @Embeddable @EmbeddedId
@Entity
public class StudentEntity {

    @EmbeddedId
    private StudentId studentId;

    @Column(name = "name_student")
    private String name;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="rue",column = @Column(name = "rue_student")),
            @AttributeOverride(name="avenue",column = @Column(name = "avenue_student"))
    })
    private Adresse adresse;

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public StudentId getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentId studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                '}';
    }
}

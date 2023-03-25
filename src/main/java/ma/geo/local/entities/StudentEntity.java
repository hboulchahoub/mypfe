package ma.geo.local.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class StudentEntity {

    @EmbeddedId
    private StudentId studentId;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<CourseEntity> courses;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "fk_level_id")
    private NiveauEntity niveau;

    public NiveauEntity getNiveau() {
        return niveau;
    }

    public void setNiveau(NiveauEntity niveau) {
        this.niveau = niveau;
    }

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }

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
                ", courses=" + courses +
                ", niveau=" + niveau +
                ", name='" + name + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}

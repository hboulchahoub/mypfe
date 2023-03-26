package ma.geo.local.entities;

import javax.persistence.*;
import java.util.List;

// @Embeddable @EmbeddedId
@Entity
public class StudentEntity {

    @EmbeddedId
    private StudentId studentId;

    @Column(name = "name_student")
    private String name;

    @ManyToMany(cascade = {CascadeType.MERGE,
            CascadeType.PERSIST,
    },fetch = FetchType.EAGER
    )
    @JoinTable(name = "tab_list_course")
    private List<CourseEntity> courses;


    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="rue",column = @Column(name = "rue_student")),
            @AttributeOverride(name="avenue",column = @Column(name = "avenue_student"))
    })
    private Adresse adresse;

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
    }

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

}



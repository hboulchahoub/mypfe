package ma.geo.local.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class StudentEntity {

    @EmbeddedId
    private StudentId studentId;

    @Column(name = "name_student")
    private String name;

    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    private List<CourseEntity> courses;


    @Embedded
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<CourseEntity> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseEntity> courses) {
        this.courses = courses;
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
                ", courses=" + courses +
                ", adresse=" + address +
                '}';
    }
}

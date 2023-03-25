package ma.geo.local.models;

import java.util.List;

public class StudentDTO {

    private StudentIdDTO studentId;
    private String name;
    private List<CourseDTO> courses;
    private AdresseDTO address;

    public AdresseDTO getAddress() {
        return address;
    }

    public void setAddress(AdresseDTO address) {
        this.address = address;
    }

    public StudentIdDTO getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentIdDTO studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseDTO> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseDTO> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                ", address=" + address +
                '}';
    }
}

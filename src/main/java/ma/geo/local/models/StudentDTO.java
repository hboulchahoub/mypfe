package ma.geo.local.models;

import java.util.List;

public class StudentDTO {

    private StudentIdDTO studentId;
    private String name;
    private List<CourseDTO> courses;
    private AdresseDTO adresse;

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

    public AdresseDTO getAdresse() {
        return adresse;
    }

    public void setAdresse(AdresseDTO adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                ", adresse=" + adresse +
                '}';
    }
}

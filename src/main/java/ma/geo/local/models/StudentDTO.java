package ma.geo.local.models;

import java.util.List;

public class StudentDTO {
    private StudentIdDto studentId;
    private String name;
    private AdresseDTO adresse;
    private List<CourseDTO> courses;
    private NiveauDTO niveau;

    public NiveauDTO getNiveau() {
        return niveau;
    }

    public void setNiveau(NiveauDTO niveau) {
        this.niveau = niveau;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentIdDto getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentIdDto studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", adresse=" + adresse +
                ", courses=" + courses +
                ", niveau=" + niveau +
                '}';
    }
}

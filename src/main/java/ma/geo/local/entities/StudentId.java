package ma.geo.local.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class StudentId implements Serializable{
    private Long id;
    private String code;

    public StudentId(Long id, String code) {
        this.id = id;
        this.code = code;
    }

    public StudentId() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentId studentId = (StudentId) o;
        return Objects.equals(id, studentId.id) && Objects.equals(code, studentId.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}

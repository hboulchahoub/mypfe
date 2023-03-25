package ma.geo.local.models;

public class StudentIdDto {
    private Long id;
    private String code;

    public StudentIdDto() {
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

    @Override
    public String toString() {
        return "StudentIdDto{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}

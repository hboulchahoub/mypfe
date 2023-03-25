package ma.geo.local.models;

public class NiveauDTO {

    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NiveauDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

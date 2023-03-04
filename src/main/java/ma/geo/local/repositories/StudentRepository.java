package ma.geo.local.repositories;

import ma.geo.local.entities.StudentEntity;

import java.util.List;

public interface StudentRepository {

    Long save(StudentEntity s);
    Long update(StudentEntity s);
    Boolean delete(Long id);
    List<StudentEntity> selectAll();

}

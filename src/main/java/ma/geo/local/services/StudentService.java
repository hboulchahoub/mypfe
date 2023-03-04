package ma.geo.local.services;

import ma.geo.local.models.StudentDTO;

import java.util.List;

public interface StudentService {
    Long save(StudentDTO s);

    Long update(StudentDTO s);

    Boolean delete(Long id);

    List<StudentDTO> selectAll();
}

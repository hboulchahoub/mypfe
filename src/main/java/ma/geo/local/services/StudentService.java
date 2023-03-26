package ma.geo.local.services;

import ma.geo.local.models.StudentDTO;
import ma.geo.local.models.StudentIdDTO;

import java.util.List;

public interface StudentService {
    Long save(StudentDTO s);

    Long update(StudentDTO s);

    Boolean deleteById(StudentIdDTO idDto);

    List<StudentDTO> selectAll();

    StudentDTO findById(StudentIdDTO idDto);
}

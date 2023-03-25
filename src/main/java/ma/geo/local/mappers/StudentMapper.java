package ma.geo.local.mappers;

import ma.geo.local.entities.StudentEntity;
import ma.geo.local.models.StudentDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    StudentEntity studentDtoToEntity(StudentDTO dto);
    StudentDTO studentEntityToDto(StudentEntity studentEntity);
    List<StudentDTO> studentEntiesToDtos(List<StudentEntity> studentEntities);
}

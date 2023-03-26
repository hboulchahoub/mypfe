package ma.geo.local.mappers;

import ma.geo.local.entities.StudentEntity;
import ma.geo.local.entities.StudentId;
import ma.geo.local.models.StudentDTO;
import ma.geo.local.models.StudentIdDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Mapper
public interface StudentMapper {
     StudentEntity studentDtoToEntity(StudentDTO dto);
     StudentDTO studentEntityToDto(StudentEntity studentEntity) ;
     List<StudentDTO> studentEntiesToDtos(List<StudentEntity> studentEntities) ;
     StudentId studentIdDtoToStudentId(StudentIdDTO studentIdDTO) ;
}

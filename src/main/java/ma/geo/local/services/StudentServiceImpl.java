package ma.geo.local.services;

import ma.geo.local.entities.StudentEntity;
import ma.geo.local.mappers.StudentMapper;
import ma.geo.local.models.StudentDTO;
import ma.geo.local.models.StudentIdDTO;
import ma.geo.local.repositories.StudentRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("service1")
public class StudentServiceImpl implements StudentService {
    private final static Logger LOGGER = LoggerFactory.getLogger(StudentServiceImpl.class);

    private StudentRepository studentRepository;
    private StudentMapper studentMapper = Mappers.getMapper(StudentMapper.class);


    public StudentServiceImpl(@Qualifier("repo1") StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Long save(StudentDTO dto) {
        LOGGER.debug("start method save dto : {} ", dto);
        LOGGER.debug(" Mapping DTO TO ENTITY : {} ", studentMapper.studentDtoToEntity(dto));
        StudentDTO re = studentMapper.studentEntityToDto(studentRepository.save(studentMapper.studentDtoToEntity(dto)));
        return re.getStudentId().getId();
    }

    @Override
    public Long update(StudentDTO dto) {
        LOGGER.debug("start method save dto : {} ", dto);
        StudentDTO re = studentMapper.studentEntityToDto(studentRepository.save(studentMapper.studentDtoToEntity(dto)));
        return re.getStudentId().getId();
    }

    @Override
    public Boolean delete(StudentIdDTO idDto) {
        LOGGER.debug("start method delete idDto : {} ", idDto);
        studentRepository.deleteById(studentMapper.studentIdDTOToStudentId(idDto));
        return true;
    }

    @Override
    public List<StudentDTO> selectAll() {
        LOGGER.debug("start method select All");
        return studentMapper.studentEntiesToDtos(studentRepository.findAll());
    }

    @Override
    public StudentDTO selectById(StudentIdDTO idDto) {
        Optional result = studentRepository.findById(studentMapper.studentIdDTOToStudentId(idDto));
        return studentMapper.studentEntityToDto((StudentEntity) result.orElse(null));
    }


}

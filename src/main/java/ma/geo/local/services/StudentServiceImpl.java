package ma.geo.local.services;

import ma.geo.local.mappers.StudentMapper;
import ma.geo.local.models.StudentDTO;
import ma.geo.local.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service1")
public class StudentServiceImpl implements StudentService {
    private final static Logger LOGGER= LoggerFactory.getLogger(StudentServiceImpl.class);

    private StudentRepository studentRepository;
    private StudentMapper studentMapper;


    public StudentServiceImpl(@Qualifier("repo1") StudentRepository studentRepository, @Qualifier("mapper1") StudentMapper studentMapper) {
        this.studentRepository = studentRepository;
        this.studentMapper = studentMapper;
    }

    @Override
    public Long save(StudentDTO dto) {
        LOGGER.debug("start method save dto : {} ",dto);
        StudentDTO re = studentMapper.studentEntityToDto(studentRepository.save(studentMapper.studentDtoToEntity(dto)));
        return re.getId();
    }

    @Override
    public Long update(StudentDTO dto) {
        LOGGER.debug("start method save dto : {} ",dto);
        StudentDTO re = studentMapper.studentEntityToDto(studentRepository.save(studentMapper.studentDtoToEntity(dto)));
        return re.getId();
    }

    @Override
    public Boolean delete(Long id) {
        LOGGER.debug("start method delete id : {} ",id);
         studentRepository.deleteById(id);
         return true;
    }

    @Override
    public List<StudentDTO> selectAll() {
        LOGGER.debug("start method select All");
        return studentMapper.studentEntiesToDtos(studentRepository.findAll());
    }




}

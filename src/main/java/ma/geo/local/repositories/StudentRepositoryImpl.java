package ma.geo.local.repositories;

import ma.geo.local.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value="repo1")
public class StudentRepositoryImpl implements StudentRepository {

    private final static Logger LOGGER= LoggerFactory.getLogger(StudentRepositoryImpl.class);

    public StudentRepositoryImpl() {
    }

    @Override
    public Long save(StudentEntity entity) {
        return null;
    }

    @Override
    public Long update(StudentEntity entity) {
        LOGGER.debug("start method update");
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        LOGGER.debug("start method delete");
        return null;
    }

    @Override
    public List<StudentEntity> selectAll() {
        LOGGER.debug("start method selectAll");
        return null;
    }
}

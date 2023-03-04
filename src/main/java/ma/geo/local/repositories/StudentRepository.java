package ma.geo.local.repositories;

import ma.geo.local.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repo1")
public interface StudentRepository
        extends JpaRepository<StudentEntity,Long> {

}

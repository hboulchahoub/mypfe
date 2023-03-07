package ma.geo.local.repositories;

import ma.geo.local.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository("repo1")
public interface StudentRepository
        extends JpaRepository<StudentEntity,Long> {

    CrudRepository r1=null;
    PagingAndSortingRepository r2=null;

}

package ma.geo.local.controllers;

import ma.geo.local.models.StudentDTO;
import ma.geo.local.models.StudentIdDTO;
import ma.geo.local.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final static Logger LOGGER= LoggerFactory.getLogger(StudentController.class);

    private StudentService studentService;

    public StudentController(@Qualifier("service1") StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Long save(@RequestBody  StudentDTO dto) {
        LOGGER.debug("start method save dto : {} ",dto);
        return studentService.save(dto);
    }

    @PutMapping
    public Long update(@RequestBody StudentDTO dto) {
        LOGGER.debug("start method update dto : {} ",dto);
        return studentService.update(dto);
    }

    @DeleteMapping("/{id}/{code}")
    public Boolean deleteById(@PathVariable("id") long id,@PathVariable("code") String code) {
        LOGGER.debug("start method select by id {} , code {} ",id,code);
        StudentIdDTO idcomp =new StudentIdDTO(id,code);
        return studentService.delete(idcomp);
    }

    @GetMapping
    public List<StudentDTO> selectAll() {
        LOGGER.debug("start method select All");
        return studentService.selectAll();
    }

    @GetMapping("/{id}/{code}")
    public StudentDTO selectById(@PathVariable("id") long id,@PathVariable("code") String code) {
        LOGGER.debug("start method select by id {} , code {} ",id,code);
        StudentIdDTO idcomp =new StudentIdDTO(id,code);
        return studentService.selectById(idcomp);
    }

}

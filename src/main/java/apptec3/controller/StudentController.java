package apptec3.controller;


import apptec3.model.Student;
import apptec3.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Va a ser un Restcontroller va a exponer esta clase a distintas url
@RestController("")
//Mi ruta general de toda la clases
@RequestMapping("/student")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class StudentController {
    private final StudentService studentService;


    @Autowired
    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }

    @GetMapping("/{Student}")
    public Student getStudentById(@PathVariable Integer PersonId)
    {
        return new Student();
    }

    @PostMapping("/")
    public void addStudent(@RequestBody  Student newStudent)
    {
        studentService.addStudent(newStudent);
    }

    @GetMapping("/")
    public List<Student> getAll()
    {
        return studentService.getAll();
    }

}

package apptec3.service;

import apptec3.model.Student;
import apptec3.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student newPerson)
    {
        studentRepository.save(newPerson);
    }

    public List<Student> getAll()
    {
        return studentRepository.findAll();
    }
}

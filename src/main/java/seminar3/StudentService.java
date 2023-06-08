package seminar3;

import java.util.List;
import lombok.*;

class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void addStudent(Student student) {
        studentRepository.saveStudent(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }
}

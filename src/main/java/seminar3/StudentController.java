package seminar3;
import lombok.*;
import java.util.List;

class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }

    public void printAll() {
        List<Student> students = studentService.getAllStudents();
        for (Student student : students) {
            System.out.println(student.getId() + ": " + student.getFullName());
        }
    }
}
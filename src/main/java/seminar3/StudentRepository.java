package seminar3;

import java.util.List;
import lombok.*;
class StudentRepository {
    private StudentGroup studentGroup;

    public StudentRepository(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void saveStudent(Student student) {
        studentGroup.addStudent(student);
    }

    public List<Student> getAllStudents() {
        return studentGroup.getStudents();
    }
}
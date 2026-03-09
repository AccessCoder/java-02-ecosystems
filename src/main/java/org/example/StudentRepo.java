package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class StudentRepo {

    private Map<String, Student> students = new HashMap<>();

    public Optional<Student> getStudentById(String id) {
        return Optional.ofNullable(students.get(id));
    }

    public void addStudent(Student student) {
        students.put(student.id(), student);
    }
}

package org.example;


public class Main {

    static void main() {

        System.out.println(Weekdays.MONDAY.getWorkingHours());
        System.out.println(Weekdays.MONDAY.isHomeoffice());

        Student student = new Student("John", Weekdays.MONDAY, "1");

        StudentRepo repo =  new StudentRepo();

        repo.addStudent(student);

        Student x = repo.getStudentById("student.id()")
                .orElseThrow();

        System.out.println(x);
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);
        System.out.println(x);
    }
}

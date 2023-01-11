package ProgrammingExercisesCAP11;

import java.util.ArrayList;

public class Ejercicio_11_5_TheCourseClass {
    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database Systems");

        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");
        course1.addStudent("Susan Kennedy");
        course1.addStudent("John Kennedy");
        course1.addStudent("Kim Johnson");
        course1.addStudent("S1");
        course1.addStudent("S2");
        course1.addStudent("S3");
        course1.addStudent("S4");
        course1.addStudent("S5");
        course1.addStudent("S6");
        course1.addStudent("S7");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");


        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < students.length; i++)
            System.out.print(students[i] + ", ");


        System.out.println();
        System.out.println("Number of students in course2: "
                + course2.getNumberOfStudents());

        course1.dropStudent("S1");

        System.out.println("Number of students in course1: "
                + course1.getNumberOfStudents());
        students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + (i < course1.getNumberOfStudents() - 1 ? ", " : " "));


        course1.clear();
        System.out.println("\nNumber of students in course1: "
                + course1.getNumberOfStudents());

    }
}

class Course {
    private final String courseName;

    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        this.students.add(student);
    }


    public void dropStudent(String student) {
        this.students.remove(student);
    }

    public String[] getStudents() {
        String[] array = new String[students.size()];
        students.toArray(array);
        return array;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public void clear() {
        students.clear();
    }
}

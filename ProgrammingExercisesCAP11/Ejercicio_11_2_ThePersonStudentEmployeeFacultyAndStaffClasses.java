package ProgrammingExercisesCAP11;


public class Ejercicio_11_2_ThePersonStudentEmployeeFacultyAndStaffClasses {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alex");
        System.out.println(person);

        Student student = new Student();
        student.setName("Erick");
        System.out.println(student);

        Employee employee = new Employee();
        employee.setName("Pablo");
        System.out.println(employee);

        Faculty faculty = new Faculty();
        faculty.setName("Karla");
        System.out.println(faculty);

        Staff staff = new Staff();
        staff.setName("Susy");
        System.out.println(staff);

    }
}

class Person {
    private String name;

    private String address;

    private String phoneNumber;

    private String eMail;

    public Person() {

    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Class name is Person and name is " + name;
    }

}

class Student extends Person {
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;

    protected int status;

    public Student() {
    }

    @Override
    public String toString() {
        return "Class name is Student and name is " + getName();
    }

}

class Employee extends Person {
    private String office;

    private double salary;

    private MyDate dateHired;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Class name is Employee and name is " + getName();
    }

}

class Faculty extends Employee {
    private String rank;

    private double hours;

    public Faculty() {

    }

    @Override
    public String toString() {
        return "Class name is Faculty and name is " + getName();
    }

}

class Staff extends Employee {
    private String title;

    public Staff() {

    }

    @Override
    public String toString() {
        return "Class name is Staff and name is " + getName();
    }
}
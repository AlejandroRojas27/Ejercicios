public class Listing10_5TestCourse {
    public static void main(String[] args) {
        Listing10_6_Course course1 = new Listing10_6_Course("Data Structures");

        Listing10_6_Course course2 = new Listing10_6_Course("Database Systems");

        course1.addStudent("Peter Parker");
        course1.addStudent("Kim Smith");
        course1.addStudent("John F. Kennedy");

        course2.addStudent("Peter Parker");
        course2.addStudent("Steve Smith");


        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();

        for (int i = 0; i < course1.getNumberOfStudents()-1; i++) {
            System.out.print(students[i] + ", ");
        }

        System.out.println(" ");

        System.out.print("Number of students in course2: " + course2.getNumberOfStudents());



    }
}

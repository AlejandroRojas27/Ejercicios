public class Listing10_6_Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Listing10_6_Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        int index = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            if(students[i].equals(student)){
                index = i;
            }
        }


        String[] temp = new String[students.length-1];
        System.arraycopy(students,0,temp,0,index);
        if(student.length() != index){
            System.arraycopy(students, index + 1, temp, index, student.length() - index - 1);
        }


        numberOfStudents--;
        students = temp;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
}

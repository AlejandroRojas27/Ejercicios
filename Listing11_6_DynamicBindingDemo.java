public class Listing11_6_DynamicBindingDemo {
    public static void main(String[] args) {

        System.out.println("1");
        m(new GraduateStudent());
        System.out.println("2");
        m(new Student());
        System.out.println("3");
        m(new Person());
        System.out.println("4");
        m(new Object());
    }

    public static void m(Object x){
        System.out.println(x.toString());
    }
}

class GraduateStudent extends Student{
}

class Student extends Person{
    @Override
    public String toString(){
        return "Student";
    }
}

class Person extends Object{
    @Override
    public String toString(){
        return "Person";
    }
}

public class EJERCICIOSCAP11 {
    public static void main(String[] args) {

        //Ejercicio 11.3.1

        // (a)

        /*

        class A{
    public A(){
        System.out.println(
                "A's, no-arg constructor is invoked"
        );
    }
}

class B extends A{

}

public class TEST {
    public static void main(String[] args) {
        B b = new B();
    }
}

         */

        // (b) There's no non arg constructor in A
        /*

        class A {
    public A(int x) {

    }
}

class B extends A {
    public B() {

    }
}

public class TEST {
    public static void main(String[] args) {
        B b = new B();
    }
}

         */

        //OVERLOAD METHODS

        /*

        public class TEST {
    public static void main(String[] args) {
        A a = new A();
        a.p(10);
        a.p(10.0);
    }
}
class B {
    public void p(double i) {
        System.out.println("---------- class B ----------");
        System.out.println(i * 2);
    }
}
class A extends B {
    // This method overloads the method in B
    public void p(int i) {
        System.out.println("---------- class A extends B ----------");
        System.out.println(i);
    }
}

         */

        //Ejercicio 11.5.1
        /*

        public class TEST {
    private double radius;

    public TEST(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}

class B extends TEST{
    private double length;

    B(double radius, double length){
        super(radius);
        this.length = length;
    }

    @Override
    public double getArea(){
        return super.getArea() * length;
    }
}

         */

        //Ejercicio 11.8.4
        /*

        public class TEST {
    public static void main(String[] args) {
        Integer[] list1 = {12,24,55,1};
        Double[] list2 = {12.4,24.0,55.2,1.0};
        Integer[] list3 = {1,2,3};

        printArray(list1);
        printArray(list2);
        printArray(list3);
    }

    public static void printArray(Object[] list){
        for (Object o: list)
            System.out.print(o + " ");
        System.out.println(" ");
    }
}

         */

        //Ejercicio 11.8.5
        //(a)
        /*

        public class TEST {
    public static void main(String[] args) {
        System.out.println("1");
        new Person1().printPerson();
        System.out.println("2");
        new Student1().printPerson();
    }
}
class Student1 extends Person1{
    @Override
    public String getInfo(){
        return "Student";
    }
}

class Person1{
    public String getInfo(){
        return "Person";
    }

    public void printPerson(){
        System.out.println(getInfo());
    }
}

         */

        //(b)
        /*

public class TEST {
    public static void main(String[] args) {
        System.out.println("1");
        new Person1().printPerson();
        System.out.println("2");
        new Student1().printPerson();
    }
}
class Student1 extends Person1{
    private String getInfo(){
        return "Student";
    }
}

class Person1{
    private String getInfo(){
        return "Person";
    }

    public void printPerson(){
        System.out.println(getInfo());
    }
}

         */

        //Ejercicio 11.8.6
        /*

        public class TEST {
    public static void main(String[] args) {
        System.out.println("main start");
        A a = new A(3);
        System.out.println("main end");
    }
}

class A extends B{
    public A(int t){
        System.out.println("A's constructor is invoked");
    }
}

class B{
    public B(){
        System.out.println("B's constructor is invoked");
    }
}


         */

        //Ejercicio 11.8.7
        /*

        public class TEST {
    public static void main(String[] args) {
        System.out.println("A");
        new A();
        System.out.println("B");
        new B();
    }
}

class A{
    int i = 7;

    public A(){
        setI(20);
        System.out.println("i from A is " + i);
    }

    public void setI(int i) {
        this.i = 2 * i;
    }
}

class B extends A{
    public B(){
        System.out.println("i from B is " + i);
    }

    public void setI(int i){
        this.i = 3 * i;
    }
}

         */

        //Ejercicio 11.9.2
        /*

        public static void main(String[] args) {

        {
            Listing11_2_Circle circle = new Listing11_2_Circle(1);
            Listing11_1_GeometricObject object1 = new Listing11_1_GeometricObject();

            System.out.println(circle instanceof Listing11_1_GeometricObject);
            System.out.println(object1 instanceof Listing11_1_GeometricObject);
            System.out.println(circle instanceof Listing11_2_Circle);
            System.out.println(object1 instanceof Listing11_2_Circle);
        }

        {
            Listing11_2_Circle circle = new Listing11_2_Circle(5);
            Listing11_1_GeometricObject object = circle;
        }

        Listing11_1_GeometricObject object = new Listing11_1_GeometricObject();
        if(object instanceof Listing11_2_Circle) {
            System.out.println("*");
            Listing11_2_Circle circle = (Listing11_2_Circle) object;
        }

         */

        //Ejercicio 11.10.2
        //a

        /*

        public class TEST {
    public static void main(String[] args) {
        Object circle1 = new Circle11102();
        Object circle2 = new Circle11102();

        System.out.println(circle1.equals(circle2));
    }
}

class Circle11102{
    double radius;

    public boolean equals(Circle11102 circle){
        return this.radius == circle.radius;
    }
}

         */

        //print false

        //Repleced Object by Circle

        /*

        public class TEST {
    public static void main(String[] args) {
        Circle11102 circle1 = new Circle11102();
        Circle11102 circle2 = new Circle11102();

        System.out.println(circle1.equals(circle2));
    }
}

class Circle11102{
    double radius;

    public boolean equals(Circle11102 circle){
        return this.radius == circle.radius;
    }
}

         */

        //print true

        //b
        /*

        public class TEST {
    public static void main(String[] args) {
        Object circle1 = new Circle11102();
        Object circle2 = new Circle11102();

        System.out.println(circle1.equals(circle2));
    }
}

class Circle11102{
    double radius;

    public boolean equals(Object o){
        return this.radius == ((Circle11102)o).radius;
    }
}

         */

        //print true

        //Repleced Object by Circle

        /*

        public class TEST {
    public static void main(String[] args) {
        Circle11102 circle1 = new Circle11102();
        Circle11102 circle2 = new Circle11102();

        System.out.println(circle1.equals(circle2));
    }
}

class Circle11102{
    double radius;

    public boolean equals(Object o){
        return this.radius == ((Circle11102)o).radius;
    }
}

         */

        //print true

        //Ejercicio 11.11.1 --SOBRE ArrayList<Double> --
        /*

        public static void main(String[] args) {

        //a Create an ArrayList for storing double values?
        ArrayList<Double> list = new ArrayList<>();

        //b Append an object to a list?
        list.add(1.5);
        list.add(2.5);
        list.add(3.5);

        //c Insert an object at the beginning of a list?
        list.add(0,3.15);
        System.out.println(list.toString());

        //d Find the number of objects in a list?
        int elements = list.size();
        System.out.println("Size: " + elements);

        //e Remove a given object from a list?
        list.remove(1);
        System.out.println(list.toString());

        //f Remove the last object from a list?
        list.remove(list.size()-1);
        System.out.println(list.toString());

        //g Check whether a given object is in a list?
        list.contains(3.15);
        System.out.println("CHECK IF 3.15 ITS IN THE ARRAY " + list.contains(3.15));

        //h Retrieve an object at a specified index from a list?
        list.get(1);
        System.out.println("Check de object at index 1:  " + list.get(1));

    }

         */

        //Ejercicio 11.11.2
        /*

        public class TEST {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Denver");
        list.add("Austin");
        list.add(new java.util.Date().toString());


        String city = list.get(0);
        list.add("Dallas");
        System.out.println(list.get(3));
        System.out.println(list.toString());
    }
}

         */

        //Ejercicio 11.11.3
        /*

        public class TEST {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Dallas");
        list.add("Dallas");
        list.add("Houston");
        list.add("Dallas");
        System.out.println(list.toString());

        for (int i = 0; i < list.size(); i++) {
            System.out.println("i: " + i + " | " + list.get(i));
            if(list.get(i).equals("Dallas")){
                list.remove("Dallas");
                i--;
            }
        }

        System.out.println(list.toString());

    }
}

         */

        //Ejercicio 11.11.4
        /*

        public class TEST {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.remove((Integer)1);
        System.out.println(list);
    }
}

         */

        //Ejercicio 11.12.1
        //Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        //ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        //Ejercicio 11.12.2
        //Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        //ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        //System.out.println(java.util.Collections.max(list));














    }
}

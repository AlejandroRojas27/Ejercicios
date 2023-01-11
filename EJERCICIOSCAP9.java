public class EJERCICIOSCAP9 {
    public static void main(String[] args) {

        //Ejercico 9.4.4
        /*

        class TEST {
    //AREA DE PRUEBAS
    public static void main(String[] args) {
        A a = new A();
        a.print();
    }
}

class A {
    String s;

    A(){
        s = "X";
    }


    A(String newS) {
        s = newS;
    }

    public void print() {
        System.out.print(s);
    }
}

         */

        //Ejercicio 9.5.6
        /*

        public class TEST {
    //AREA DE PRUEBAS
    boolean x;

    public static void main(String[] args){
        TEST a = new TEST();
        System.out.print(a.x);
    }
}

         */

        //Ejercicio 9.7.1
        /*

        public class TEST {
    //AREA DE PRUEBAS
    int i;
    static String s;
    void imethod() {
    }
    static void smethod() {
    }

    public static void main(String[] args) {
        TEST f = new TEST();

        System.out.println(f.i);
        System.out.println(f.s);
        f.imethod(); // Invoke imethod as  instance variable
        f.smethod();

        //System.out.println(TEST.i); WRONG TEST is instance
        System.out.println(TEST.s);
        //TEST.imethod(); WRONG imethod is instance and cannot be invoked from the main that is static
        TEST.smethod();

    }

         */

        //Ejercicio 9.7.2
        /*

        public class TEST {
    //AREA DE PRUEBAS
    int count;
    public static void main(String[] args) {
    }
    public int getCount() { //getCount() must be instance to access a data field
        return count;
    }
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }

}

         */

        //Ejercicio 9.7.3
        /*

        public class TEST {
    //AREA DE PRUEBAS
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        Circle c = new Circle();
        System.out.println("What is radius " + c.radius);
    }

}

         */

        //Ejercicio 9.9.3
        /*

        public class TEST {
    //AREA DE PRUEBAS
    private double radius = 100;

    //Find the area of the circle
        public double getArea(){
            return  radius * radius * Math.PI;
        }

        public static void main(String[] args){
            TEST myCircle = new TEST();
            System.out.println("Radius is " + myCircle.radius); //We can call radius even if it private because radius is on the same class
        }

    }


         */

        //Ejercicio 9.10.1
        /*

        public class TEST {
    //AREA DE PRUEBAS
    public static void main(String[] args){
        Count myCount = new Count();
        int times = 0;

        for(int i = 0;i < 100; i++){
            increment(myCount, times);

        }

        System.out.println("count is " + myCount.count);
        System.out.println("times is " + times);
    }

    public static void increment(Count c, int times){
        c.count++;
        times++;
    }

         */

        //Ejercicio 9.10.2
        /*

        public class TEST {
    //AREA DE PRUEBAS
    public static void main(String[] args) {
        Circle9102 circle1 = new Circle9102(1);
        Circle9102 circle2 = new Circle9102(2);

        swap1(circle1, circle2);
        System.out.println("After swap1: circle1 = " +
                circle1.radius + " circle2 = " + circle2.radius);

        swap2(circle1, circle2);
        System.out.println("After swap2: circle1 = " +
                circle1.radius + " circle2 = " + circle2.radius);
    }

    public static void swap1(Circle9102 x, Circle9102 y){
        Circle9102 temp = x;
        x = y;
        y = temp;
    }

    public static void swap2(Circle9102 x, Circle9102 y){
        double temp = x.radius;
        x.radius = y.radius;
        y.radius = temp;
    }

}
class Circle9102{
    double radius;
    Circle9102(double newRadius){
        radius = newRadius;
    }
}

         */

        //Ejercicio 9.10.3

        //(a)

        /*

        public static void main(String[] args) {
        int[] a = {1,2};
        swap(a[0], a[1]);
        System.out.println("a[0] = " + a[0]
        + " a[1] = " + a[1]);
    }

    public static void swap(int n1, int n2){
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

         */

        //(b)
        /*

        public static void main(String[] args) {
        int[] a = {1, 2};
        swap(a);
        System.out.println("a[0] = " + a[0]
                + " a[1] = " + a[1]);
    }

    public static void swap(int[] a) {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }

         */

        //(c)
        /*

        public class TEST {
    //AREA DE PRUEBAS
    public static void main(String[] args) {
        T t = new T();
        swap(t);
        System.out.println("e1 = " + t.e1
                + " e2 = " + t.e2);
    }

    public static void swap(T t){
        int temp = t.e1;
        t.e1 = t.e2;
        t.e2 = temp;
    }
}

class T{
    int e1 = 1;
    int e2 = 2;
}

         */

        //(d)
        /*

        public class TEST {
    //AREA DE PRUEBAS
    public static void main(String[] args) {
        T t1 = new T();
        T t2 = new T();
        System.out.println("t1's i = "
                + t1.i + " and j = " + t1.j);
        System.out.println("t2's i = "
                + t2.i + " and j = " + t2.j);
    }
}

class T{
    static int i = 0;
    int j = 0;

    T(){
        i++;
        j = 1;
    }
}

         */

        //Ejercicio 9.10.4

        //(a)

        /*

        import java.util.Date;

public class TEST {
    //AREA DE PRUEBAS
    public static void main(String[] args) {
        Date date = null;
        m1(date);
        System.out.println(date);
    }

    public static void m1(Date date){
        date = new Date();
    }
}

         */

        //(b)

        /*

        import java.util.Date;

public class TEST {
    //AREA DE PRUEBAS
    public static void main(String[] args) {
        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());
    }

    public static void m1(Date date){
        date = new Date(7654321);
    }
}

         */

        //(c)

        /*

        import java.util.Date;

public class TEST {
    //AREA DE PRUEBAS
    public static void main(String[] args) {
        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());
    }

    public static void m1(Date date){
        date.setTime(7654321);
    }
}

         */

        //(d)

        /*

        import java.util.Date;

public class TEST {
    //AREA DE PRUEBAS
    public static void main(String[] args) {
        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());
    }

    public static void m1(Date date){
        date = null;
    }
}

         */

        //Ejercicio 9.11.1
        /*

        public static void main(String[] args) {
        java.util.Date[] dates = new java.util.Date[2];

        for (int i = 0; i < dates.length; i++) {
            dates[i] = new java.util.Date();
        }

        System.out.println(dates[0]);
        System.out.println(dates[0].toString());

    }

         */

        //Ejercicio 9.12.3 Is the following class immutable? Yes
        /*

        private int[] values;
    public int[] getValues(){
        return values;
    }


         */

        //Ejercicio 9.13.1
        /*

        public class TEST {
    //AREA DE PRUEBAS
    private static int i = 0;
    private static int j = 0;

    public static void main(String[] args) {
        int i = 2;
        int k = 2;

        {
            int j = 3;
            System.out.println("i + j is " + (i + j));
        }

        k = i + j;
        System.out.println("k is " + k);
        System.out.println("j is " + j);
    }
}

         */

        //Ejercicio 9.14.2
        /*

        public class TEST {
    //AREA DE PRUEBAS
    private int p;

    public TEST(int p){
        this.p = p;
    }

    public TEST(){
        this(1);
        System.out.println("C's no-arg constructor invoked");
    }

    public void setP(int p){
        this.p = p;
    }

}

         */

        //Ejercicio 9.14.3
        /*

public class TEST {
    private int id;

    public void m1(){
        this.id = 45;
    }

    public void  m2(){
        this.id = 45;
    }

}

         */







    }
}

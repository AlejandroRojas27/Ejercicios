public class EJERCICIOSCAP12 {
    public static void main(String[] args) {

        //Ejercicio 12.2.2

        //System.out.println(1 / 0);
        //System.out.println(1.0 / 0);

        //Ejercicio 12.2.3

         /*
        int n = 1;
        long value = Long.MAX_VALUE + n;
        System.out.println(value);

         */

        //Ejercicio 12.2.5

        /*

        public static void main(String[] args) {

        try {
            int value = 50;
            if (value < 40) {
                throw new Exception("value is too small");
            } else {
                System.out.println("Value is greater");
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Continue after the catch block");
    }

         */

        //Ejercicio 12.2.6

        //(a)
        /*

        public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.print(i + " ");
            try {
                System.out.println(1 / 0);
            } catch (Exception ex) {
            }
        }
    }

         */

        //(b)
        /*

        public static void main(String[] args) {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.print(i + " ");
                System.out.print(1 / 0);
            }
        } catch (Exception ex) {
        }
    }

         */

        //Ejercicio 12.3.2

        //(a)
        //System.out.println(1 / 0); ------>>>> ArithmeticException

        //(b)
        //int[] list = new int[5];
        //System.out.println(list[5]); ------>>>> ArrayIndexOutOfBoundsException

        //(c)
        //String s = "abc";
        //System.out.println(s.charAt(3)); ------>>>> StringIndexOutOfBoundsException

        //(d)
        //Object o = new Object();
        //String d = (String) o; ------>>>> ClassCastException

        //(e)
        //Object o = null;
        //System.out.println(o.toString()); ------>>>> NullPointerException

        //(f)
        //System.out.println(1.0 / 0); ------>>>> It is not an Runtime exception, but is infinity

        //Ejercicio 12.4.5

        /*

        public static void main(String[] args) {
        try {
            int[] list = new int[10];
            System.out.println("list[10] is " + list[10]);
        }
        catch (ArithmeticException ex){
            System.out.println("ArithmeticalException");
        }catch (RuntimeException ex){
            System.out.println("RuntimeException");
        }catch (Exception ex){
            System.out.println("Exception");
        }
    }

         */

        //Display RuntimeException

        //Ejercicio 12.4.6

        /*

        public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticalException");
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException");
        } catch (Exception ex) {
            System.out.println("Exception");
        }
    }

    static void method() throws Exception {
        System.out.println(1 / 0);
    }

         */

        //Display ArithmeticalException

        //Ejercicio 12.4.7

        /*

        public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");
        } catch (RuntimeException ex) {
            System.out.println("RuntimeException");
        } catch (Exception ex) {
            System.out.println("Exception");
        }
    }

    static void method() throws Exception {
        try {
            String s = "abc";
            System.out.println(s.charAt(3));
        }catch (RuntimeException ex){
            System.out.println("RuntimeException in method()");
        }catch (Exception ex){
            System.out.println("Exception in method()");
        }
    }

         */

        //Display RuntimeException in method()
        //After the method call

        //Ejercicio 12.4.11

        /*

        public static void main(String[] args) {
        try {
            m(10);
            System.out.println("After the method call");
        }catch (RuntimeException ex){
            System.out.println("RuntimeException");
        }catch (Exception ex){
            System.out.println("Exception");
        }


    }

    public static void m(int value)  {
        if (value < 40) {
            try {
                throw new Exception("value is too small");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

         */

        //Display RuntimeException

        //Ejercicio 12.6.1

        /*

        public static void main(String[] args) {
        String token1 = "123";
        System.out.println("token1 is numeric: "+ isNumeric(token1));

        String token2 = "1a2b";
        System.out.println("token2 is numeric: "+ isNumeric(token2));

    }

    public static boolean isNumeric(String token){
        boolean answer = true;

        for (int i = 0; i < token.length(); i++) {
            if(!Character.isDigit(token.charAt(i))){
               answer = false;
               break;
            }
        }

        return answer;
    }

         */

        //Ejercicio 12.8.1

        /*

        public static void main(String[] args) {
        try {
            method1();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void method1() throws Exception{
        try {
            method2();
        }
        catch (Exception ex){
            throw new Exception("New info from method1");
        }
    }

    public static void method2() throws Exception{
        throw new Exception("New info from method2");
    }

         */

        //java.lang.Exception: New info from method1
        //	at Listing12_9_ChainedExceptionDemo.method1(Listing12_9_ChainedExceptionDemo.java:16)
        //	at Listing12_9_ChainedExceptionDemo.main(Listing12_9_ChainedExceptionDemo.java:4)

        //Ejercicio 12.9.2

        /*

        public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");
        }
        catch (RuntimeException ex){
            System.out.println("RuntimeException in main");
        }
        catch (Exception ex){
            System.out.println("Exception in main");
        }
    }

    static void method() throws Exception{
        try {
            CircleWithCustomException c1 = new CircleWithCustomException(1);
            c1.setRadius(-1);
        }
        catch (RuntimeException ex){
            System.out.println("RuntimeException in method()");
        }
        catch (Exception ex){
            System.out.println("Exception in method()");
            throw ex;
        }
    }

         */

        //Display: Exception in method()
        //Exception in main

        //Ejercicio 12.11.2

        /*

        public static void main(String[] args) throws Exception{
        PrintWriter output = new PrintWriter("temp.txt");
        output.printf("amount is %f %e\r\n", 32.32,32.32);
        output.printf("amount is %5.4f %5.4e\r\n", 32.32,32.32);
        output.printf("%6b\r\n", (1 > 2));
        output.printf("%6s\r\n", "Java");
        output.close();
    }

         */

        //temp.txt
        /*
        amount is 32.320000 3.232000e+01
        amount is 32.3200 3.2320e+01
         false
          Java

         */


        //Ejercicio 12.11.3

        /*

        public static void main(String[] args) throws Exception {
        try (
                PrintWriter output = new PrintWriter("temp.txt");
        ) {
            output.printf("amount is %f %e\r\n", 32.32, 32.32);
            output.printf("amount is %5.4f %5.4e\r\n", 32.32, 32.32);
            output.printf("%6b\r\n", (1 > 2));
            output.printf("%6s\r\n", "Java");
        }
    }

         */

        //Ejercicio 12.11.7

        /*

        public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        int intValue = input.nextInt();
        double doubleValue = input.nextDouble();
        String line = input.nextLine();

    }

         */

        //Display 45 57.8  789

        //Ejercicio 12.11.8

         /*

        public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        int intValue = input.nextInt();
        double doubleValue = input.nextDouble();
        String line = input.nextLine();

    }

         */
        //Display 45 57.8 
















    }
}

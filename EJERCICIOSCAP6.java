public class EJERCICIOSCAP6 {
    public static void main(String[] args) {

        //Ejercicico 6.4.4
        //a.
        //public static void main(String[] args) {} ---- to enter the sales amount and commmission rate
        //public static double salesAmount (double x, double y ) --- to enter an interval of diferents amounts and to enter a commision rate corresponding

        //b.
        //public static void main(String[] args) {} ---- to enter the year and the month
        //public static void month ( int year , int month){} --- to compute if the year is leap and print it calendar

        //c.
        //public static double squareRoot (double sqr) --- to compute the squereroot
        //public static  double sqr (double number) --- to prompt the number

        //d.
        //public static int even (int num) --- to test if the number its even
        //public static int num (int i) --- to prompt the number

        //e.
        //public static int message (int msg) --- to prompt the message
        //public static int msd (int times) ----for promt how many times the message will be display

        //f.
        //public static double datos (double loamAmount, double number of year, double annualInteresRate ) -- to compute
        //public static void main (String [] args) -- to propt the "datos" and display the results

        //g.
        //public static String letterInUpper (String letter) -- to prompt the string to uppercase
        //public static void main (String [] args) -- to print the string in lowercase

        //Passing Arguments by Values

        /*
    public static void main(String[] args) {
        nPrintln("Hello", 3);
    }

    public static void nPrintln (String message, int n){
        for (int i = 0; i < n; i++)
            System.out.println(message);
    }
     */

        //Ejercicio 6.5.2
        /*
        public static void main(String[] args) {
        nPrintln(5, "Welcome to Java");
    }

    public static void nPrintln(int n, String message){
        for (int i = 0; i < n; i++)
            System.out.println(message);
    }
         */

        //Ejercicio 6.5.3
        //a.
        /*
    public static void main(String[] args) {
        int max = 0;
        max(1,2,max);
        System.out.println(max);
    }

    public static void max(int value1, int value2, int max){
        if (value1 > value2)
            max = value1;
        else
            max = value2;

        System.out.println("Maximun value in method max " + max);
    }

     */
        //b.
        /*
    public static void main(String[] args) {
        int i = 1;
        while (i <= 6){
            method1(i,2);
            i++;
        }
    }

    public static void method1(int i, int num){
        for (int j=1; j<=i;j++){
            System.out.print(num + " ");
            num *= 2;
        }

        System.out.println(" ");
    }

     */
        //c.
        /*
    public static void main(String[] args) {
        //Initialize times
        int times = 3;
        System.out.println("Before the call, variable times is " + times);

        //invoke nPrintln and display times
        nPrintln("Welcome to Java!", times);
        System.out.println("After the call, variable times is " + times);
    }

    //Print the message in times
    public static void nPrintln(String message, int n){
        while (n > 0){
            System.out.println("n = " + n);
            System.out.println(message);
            n--;
        }
    }

     */
        //d.
        /*
    public static void main(String[] args) {
        int i = 0;
        while (i<=4){
            method1 (i);
            i++;
        }

        System.out.println("i is " + i);
    }

    public static void method1(int i){
        do{
            if(i % 3 !=0)
                System.out.print(i + " ");
            i--;
        }while (i >=1);

        System.out.println(" ");
    }

     */

        //Elercicio 6.6.1
        /*
    public static void main(String[] args) {
        System.out.println("The great common divisor for 4 and 6 are " + gcd(4,6));
    }

    public static int gcd(int n1, int n2){
        int gcd = 1; //Initial gcd is 1
        int k = 2; //Possible gcd

        while (k <=n1 && k <= n2){
            if(n1 % k == 0 && n2 % k == 0)
                gcd = k; //Update gcd
            k++;
        }

        return gcd; //Return gcd
    }

     */

        //Ejercicio 6.6.2
        /*
    public static void main(String[] args) {
        System.out.println("25 is prime? " + isPrime(25));
    }
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number /2; divisor++){
            if(number % divisor == 0){//If true, number is not prime
                return false; //Number is not prime
            }
        }

        return true; //Number is prime
    }

    */

        //Ejercicio 6.7.1
        //Question 1
        /*
    public static void main(String[] args) {
        System.out.println("What is hexCharToDecimal('B'))? " + hexCharToDecimal('B'));
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else //ch is '0', '1', ..., or '9'
            return ch - '0';
    }

     */
        //Question 2
        /*
    public static void main(String[] args) {
        System.out.println("What is hexCharToDecimal('7'))? " + hexCharToDecimal('7'));
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else //ch is '0', '1', ..., or '9'
            return ch - '0';
    }

     */
        //Question 3
        /*
    public static void main(String[] args) {
        String hex = "A9";
        System.out.print("Enter a hex number: " + hex);

        System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));

    }
    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++){
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }
    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F')
            return 10 + ch - 'A';
        else //ch is '0', '1', ..., or '9'
            return ch - '0';
    }

     */

        //Ejercicio 6.8.2
        /*
    public static void main(String[] args) {
        method(5);
    }
    public static int method(int y){
        return y;
    }

     */

        //Ejercicio 6.8.3
        /*
    public static void main(String[] args) {
        double z = m(4, 5);
        //double z = m(4, 5.4);
        //double z = m(4.5 , 5.4);

        System.out.println("Max: " + z);
    }

    public static double m(double x, double y){
        System.out.println("|");

        if (x > y)
            return x;
        else
            return y;

    }

    public static double m(int x, double y){
        System.out.println("*");

        if (x > y)
            return x;
        else
            return y;
    }

     */


















    }
}

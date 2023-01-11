import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Propt the user to enter two integers
        System.out.print("Enter first integer: ");
        int n1 = 125;//(int)(Math.random() * 51);//input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = 2525;//(int)(Math.random() * 51);//input.nextInt();

        int gcd = 1; //Initial great common divisor
        int k = 2; //Possible gcd
        while (k <= n1 && k < n2){
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;

        }

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd);
    }
}

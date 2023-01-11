import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        //Prompt the user to enter a decimal integer
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        int count = -1;

        //Convert decimal to hex
        String hex = "";

        if (decimal == 0){
            System.out.println("The hex number is 0");
            System.exit(1);
        }

        while (decimal != 0){
            int hexValue = decimal % 16;

            //Convert a decimal value to a hex digit
            char hexDigit = (0 <= hexValue && hexValue <= 9)?
                    (char) (hexValue + '0') : (char) (hexValue - 10 + 'A');

            hex = hexDigit + hex;
            decimal = decimal / 16;
            count++;
            System.out.println("count: " + count);
        }

        System.out.println("The hex number is " + hex);
    }
}

import java.util.Scanner;

public class GuessNumberOneTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //MI SOLUCION
        /*
            int guess = 0;
            int numero = (int) (Math.random() * 100);

            while (numero != guess) {
                System.out.print("Enter guess: ");
                guess = input.nextInt();
                if (guess > numero) {
                    System.out.println("Your guess is too high");
                } else if (guess < (numero)) {
                    System.out.println("Your guess is too low");
                }
            }
            System.out.println("Yes, the number is " + numero);

         */

        //Solucion del libro
        int number = (int) (Math.random() * 101);
        System.out.println("Guess a magic number between 0 and 100");

        int guess = -1;
        while (guess != number){
            // Prompt the user to guess the number
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();

            if (guess == number)
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        } //End of the loop

    }
}

package ProgrammingExercisesCAP6;

public class Ejercicio_6_10_UseThe_isPrimeMethod {
    public static void main(String[] args) {
        printPrimeNumbers(10000);
    }

    public static void printPrimeNumbers(int numberOfPrimes){
        final int NUMBER_OF_PRIMES_PER_LINE = 10;//Display 10 per line
        int count = 0; //Display 10 per line
        int number = 2; //A number to be tested for primeness

        //Repeatedly find prime numbers
        while (number<=numberOfPrimes){
            //Print the prime number and increase the count
            if (isPrime(number)){
                count++; // Increase the count

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    //Print the number and advance to the new line
                    System.out.printf("%-5d\n", number);
                }
                else
                    System.out.printf("%-5d", number);
            }

            //Check whether the next number is prime
            number++;
        }
    }

    /** Check whether number is prime */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= (int) (Math.sqrt(number)); divisor++){
            if(number % divisor == 0){//If true, number is not prime
                return false; //Number is not prime
            }
        }

        return true; //Number is prime
    }





}

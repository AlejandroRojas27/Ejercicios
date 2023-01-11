package ProgrammingExercisesCAP7;

public class Ejercicio_7_6_ReviseListing5_15_PrimeNumber {
    public static void main(String[] args) {

        final int NUMBERS_OF_PRIMES = 50;
        int count = 0;
        System.out.println("The first " + NUMBERS_OF_PRIMES + " prime numbers are ");
        System.out.println("Enter n: ");
        int n = (int)(Math.random() * 51);


        int[] primeNumbers = new int[NUMBERS_OF_PRIMES];


        //Repeatedly find prime numbers
        for(int number=2, i=0;count<NUMBERS_OF_PRIMES;number++, i++){
            //Assume the number prime
            boolean isPrime = true;

            //Test whether number is prime
            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++){

                if (number % divisor == 0) { //If true, number is not prime
                    isPrime = false;
                    break;
                }
            }

            //Assign primeNumber[index] = prime number
            if (isPrime){
                primeNumbers[count] = number;
                count++;
            }

        }


        System.out.println(" ");
        //Array with primes
        System.out.println("The first " + NUMBERS_OF_PRIMES + " prime numbers are ");
        System.out.println(java.util.Arrays.toString(primeNumbers));

        //Serch the divisors
        System.out.println("The divisors for " + n + " are: ");

        for (int i = 0; i < primeNumbers.length;i++){
            if(n % primeNumbers[i] == 0)
                System.out.print(primeNumbers[i] + " ");
        }

    }
}

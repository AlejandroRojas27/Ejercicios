public class AprendiendoFor {
    public static void main(String[] args) {
        /*for (int i = 0; i < 50; i++) {
            System.out.print(i + " ");
        }

        for (int x = 0; x <= 7; x++) {
            System.out.println("x= " + x);
        }
        */


        //Programa un algoritmo que, imprima los primeros 50 números, salvo que, si el número es multiplo de 3, imprima "Fizz"
        //Si el número es multiplo de 5, imprima "Buzz" y si es multiplo de ambos, imprima "FizzBuzz"

        for (int y = 1; y <= 50; y++) {
            if ((y % 3 == 0) && (y % 5 == 0)){
                System.out.println("Fizz Buzz");
            }
            else if (y % 5 == 0 ) {
                System.out.println("Buzz");
            }
            else if (y % 3 == 0) {
                System.out.println("Fizz");
            }
            else{
                System.out.println(y);
            }

        }

        int v = (int) (100 + Math.random() * 899);
        System.out.println("Numero de 3 digitos: " + v);

        int vCentena = v / 100;
        int vUnidad = v % 10;

        if (vCentena == vUnidad )
            System.out.println("El numero es un palindromo");
        else
            System.out.println("El numero no es un palindromo");



    }
}


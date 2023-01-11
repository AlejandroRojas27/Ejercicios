import  java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner inport = new Scanner(System.in);

        System.out.print("Numero participante: ");
        int numeroPropuesto = inport.nextInt();

        int primerDigitoPropuesto = numeroPropuesto / 10;
        int segundoDigitoPropuesto = numeroPropuesto % 10;

        int numeroGanador = (int)(Math.random() * 100);
        System.out.println("Numero ganador: " + numeroGanador);
        int primerDigitoGanador = numeroGanador / 10;
        int segundoDigitoGanador = numeroGanador % 10;



        //Premiacion


        if ((numeroGanador  == numeroPropuesto))
            System.out.println("Exact, the award is $10,000");

        boolean segundoPremio =
                ((primerDigitoGanador + segundoDigitoGanador) == (primerDigitoPropuesto + segundoDigitoPropuesto));
        if (segundoPremio == true)
            System.out.println("Match all digits, the award is $3,000");

        boolean tercerPremio =
                ((primerDigitoGanador == primerDigitoPropuesto) ^ (primerDigitoGanador == segundoDigitoPropuesto) ^
                        (segundoDigitoGanador == primerDigitoPropuesto) ^
                        (segundoDigitoGanador == segundoDigitoPropuesto));

        if (tercerPremio == true)
            System.out.println("Match one digit, the award is $1,000");
        else
            System.out.println("Sorry, no match");
    }
}

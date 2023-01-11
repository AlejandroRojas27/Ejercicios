package ProgrammingExercisesCAP6;

public class Ejercicio_6_31_FinancialCreditCardNumberValidation {
    public static void main(String[] args) {
         String number = "4388576018410707";
        if (isValid(number))
            System.out.println(number + " is valid");
        else if (!isValid(number))
            System.out.println(number + " is invalid");
    }

    /** Return true if the card number is valid */
    public static boolean isValid(String number){
        int x = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        int d = Integer.parseInt(String.valueOf(number.charAt(0)));
        prefixMarched(number, d);

        if(x % 10 == 0 && prefixMarched(number, d))
            return true;
        else
            return false;
    }

    public static int sumOfDoubleEvenPlace(String number){
        int num = number.length();
        int c = 0;
        for (int y =0;y<=num-1;y+=2){
            int n = getDigit(Integer.parseInt(String.valueOf(number.charAt(y))));
            c+=n;
        }
        return c;
    }

    public static int getDigit(int number){
        int x = number * 2;
        String n = x + "";
        if(n.length() >=2)
            x = Integer.parseInt(String.valueOf(n.charAt(0))) + Integer.parseInt(String.valueOf(n.charAt(1)));
        return x;
    }

    public static int sumOfOddPlace(String number){
        int num = number.length();
        int b = 0;
        for (int y =1;y<=num-1;y+=2){
            int n = Integer.parseInt(String.valueOf(number.charAt(y)));
            b+=n;
        }
        return b;
    }

    public static boolean prefixMarched(String number, int d){

        int prefix = Integer.parseInt(number.substring(0, getSize(number)));
        if (prefix == getPrefix(number, d))
            return true;
        else
            return false;
    }

    public static int getSize(String number){
        int d = Integer.parseInt(String.valueOf(number.charAt(0)));
        getPrefix(number,d);
        String sz = Integer.toString((int)getPrefix(number,d));
        int size = sz.length();
        return size;
    }

    public static long getPrefix(String number, int k){
        //Prefixes
        long visa = 4;
        long masterCard = 5;
        long americanExpress = 37;
        long discovery = 6;
        String x = Character.toString(number.charAt(0)).concat(String.valueOf(number.charAt(1)));
        int a = Integer.parseInt(x);

        long prefix = 0;

        if (k == visa)
            prefix=visa;
        else if (k == masterCard)
            prefix = masterCard;
        else if (k == discovery)
            prefix = discovery;
        else if (a == americanExpress)
            prefix = a;

        return prefix;
    }





}

package ProgrammingExercisesCAP6;

public class Ejercicio_6_37_FormatAnInteger {
    public static void main(String[] args) {
        System.out.println("Number in format: " + format(34,3));

    }

    public static String format(int number, int width){
        String numberStr = number + "";
        String f = "";
        int numberLength = numberStr.length();
        if(numberLength >= width)
            f = numberStr;

        String a = "";
        for (int x =1; x<=(width-numberLength);x++){
            String zero = "0";
            a+=zero;
        }
        f = a.concat(numberStr);



        return f;
    }
}

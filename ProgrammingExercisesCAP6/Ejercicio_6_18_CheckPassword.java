package ProgrammingExercisesCAP6;

import java.util.Scanner;

public class Ejercicio_6_18_CheckPassword {
    public static void main(String[] args) {
        Scanner lala = new Scanner(System.in);
        System.out.print("The password is: ");
        String pass = lala.next();
        password(pass);
    }

    public static void  password (String word){
        if(rule1(word) && rule2(word) && rule3(word))
            System.out.println("Valid password");
        else
            System.out.println("Invalid password");
    }

    public static boolean rule1(String word){
        if (word.length() >=8)
            return true;
        return false;
    }

    public static boolean rule2(String word){
        int count =0;
        for (int x=0;x<=word.length()-1;x++){
            char ch = word.charAt(x);
            boolean y = Character.isLetterOrDigit(ch);
            if(!y)
                count++;
        }
        if (count == 0)
            return true;
        return false;
    }

    public static boolean rule3(String word){
        int count = 0;
        for (int x = 0;x<=word.length()-1;x++){
            char ch = word.charAt(x);
            if (Character.isDigit(ch))
                count++;
        }
        if (count >= 2)
            return true;
        return false;

    }
}


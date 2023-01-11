package ProgrammingExercisesCAP6;

public class Ejercicio_6_21_PhoneKeypads {
    public static void main(String[] args) {
        String s = "1-800-Flowers";
        System.out.println("Enter a string: " + s);
        System.out.println("Word in the string: " + gettingWord(s));

        int w = 0;
        int x = gettingWord(s).length();
        int y = 0;
        int z = 0;
        for (y=0,w=x-1;y<=x-1;y++,w--){
            char ch = gettingWord(s).charAt(y);
            int b = (int)Math.pow(10,w);
            int a = getNumber(ch) * b;
            z+=a;
            //System.out.println(y + "w: " + w + "| ch: " + ch + "| num: " + getNumber(ch) + "| b: " + b + "| z: " + z);
        }
        String a = Integer.toString(z);
        System.out.println("Final number:" + concatenar(s,a));

    }

    public static String gettingWord(String s){
        int x = s.length();
        int count = 0;
        for (int y = 0;y<=x-1;y++){
            char ch = s.charAt(y);
            if(Character.isLetter(ch))
                count++;
        }
        int z = x - count;
        return s.substring(z);
    }

    public static int getNumber(char uppercaseLetter){
        int num = 0;
        char letterUpperCase = Character.toUpperCase(uppercaseLetter);
        //System.out.print(letterUpperCase);

        if (letterUpperCase == 'A' || letterUpperCase == 'B' || letterUpperCase == 'C')
            num = 2;
        else if (letterUpperCase == 'D' || letterUpperCase == 'E' || letterUpperCase == 'F')
            num = 3;
        else if (letterUpperCase == 'G' || letterUpperCase == 'H' || letterUpperCase == 'I')
            num = 4;
        else if (letterUpperCase == 'J' || letterUpperCase == 'K' || letterUpperCase == 'L')
            num = 5;
        else if (letterUpperCase == 'M' || letterUpperCase == 'N' || letterUpperCase == 'O')
            num = 6;
        else if (letterUpperCase == 'P' || letterUpperCase == 'Q' || letterUpperCase == 'R' || letterUpperCase == 'S')
            num = 7;
        else if (letterUpperCase == 'T' || letterUpperCase == 'U' || letterUpperCase == 'V')
            num = 8;
        else if (letterUpperCase == 'W' || letterUpperCase == 'X' || letterUpperCase == 'Y' || letterUpperCase == 'Z')
            num = 9;

        return num;
    }

    public static String concatenar(String s, String a){
        int x = s.length();
        int count = 0;
        for (int y = 0;y<=x-1;y++){
            char ch = s.charAt(y);
            if(Character.isLetter(ch))
                count++;
        }
        int z = x - count;
        String s1 = s.substring(0,(z));
        String s2 = s1.concat(a);

        return s2;
    }
}

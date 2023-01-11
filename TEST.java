import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Name of the file: ");
        String str = input.nextLine();
        File file = new File(str);
        System.out.println("Exist? " + file.exists());

    }
}





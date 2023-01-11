import java.io.File;
import java.io.PrintWriter;

public class Listing12_13_WriteData {
    public static void main(String[] args) throws Exception{
        //The reason why we declare throws Exception in the main method
        //is to avoid java.io.FileNotFoundException

        java.io.File file = new File("scores.txt");

        /*
        if(file.exists()){
            System.out.println("File already exist");
            System.exit(1);
        }

         */



        //Create a file
        java.io.PrintWriter output = new java.io.PrintWriter(file);

        //Write formatted output to the file

        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);


        //Close the file
        output.close();




    }
}

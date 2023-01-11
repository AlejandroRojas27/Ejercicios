public class MultiplicationTable {
    /** Main method */
    public static void main(String[] args) {
        //Display the table heading
        System.out.println("            Multiplication Table");

        //Display the number title
        System.out.print("     ");
        for (int j = 1; j<= 15; j++) {
            System.out.printf("%5d", j);
        }
        System.out.println("\n _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");


        //Display table body
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + "   | ");
            for (int j = 1; j <= 15; j++) {
                //Display the product and aling properly
                System.out.printf("%5d", i * j);
            }
            System.out.println();
        }

    }
}

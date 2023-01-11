public class TestPassByValue {
    /** Main method */
    public static void main(String[] args) {
        //Declare and initialize variables
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before invoking the swap method, num1 is " + num1 + " and num2 is " + num2);

        //invoke the swap method to attempt to swap two variables
        swap(num1,num2);

        System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
    }

    /**Swap two variables */
    public static void swap(int num1, int num2){
        System.out.println("\tInside the swap method");
        System.out.println("\t\tBefore swapping, ni is " + num1 + " and n2 is " + num2);

        //Swap ni wirth n2
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("\t\tAfter swapping, ni is " + num1 + " and n2 is " + num2);
    }
}

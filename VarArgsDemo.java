public class VarArgsDemo {
    public static void main(String[] args) {
        printMax(34, 3,3,2,56.5);
        printMax(new double[]{1,2,3});
        printMax(new int[]{9,4,7});
    }

    public static void printMax(double... numbers){ // elipsis == (...)
     if (numbers.length == 0){
         System.out.println("No argument passed");
         return;
     }

     double result = numbers[0];

     for (int i = 0; i < numbers.length; i++)
         if(numbers[i] > result)
             result = numbers[i];

     System.out.println("The max value is " + result);
    }

    /**Overloading a method */
    public static void printMax(int... numbers){
        if (numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 0; i < numbers.length; i++)
            if(numbers[i] > result)
                result = numbers[i];

        System.out.println("The max value is " + result);

    }
}



public class AnalyzeNumbers {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        double [] numbers = new double[n];
        double sum = 0;

        //Initialize values for the array
        System.out.println("Enter the numbers: ");
        for (int i = 0;i<n;i++){
            numbers[i] = input.nextDouble();
        }

        //Get the averange
        for (int i = 0;i<n;i++){
            sum+=numbers[i];
        }
        double averange = sum / n;
        System.out.println("Averange: " + averange);

        //Get the number of the items greater than the average
        int count = 0;
        for (int i = 0;i<n;i++){
            if (numbers[i]>averange)
                count++;
        }
        System.out.println("Number of the items greater than the average: " + count);
        //What numbers are
        System.out.print("What numbers are: ");
        for (int i = 0;i<n;i++){
            if (numbers[i]>averange)
                System.out.print(numbers[i] + " ");
        }


    }
}

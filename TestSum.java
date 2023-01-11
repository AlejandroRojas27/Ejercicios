public class TestSum {
    public static void main(String[] args) {
        //Initialize sum
        double sum = 0;

        //Add 0.01, 0.02, ..., 0.99, 1 to sum
        for (double i = 0.01; i<=1.0; i = i + 0.01)
            sum += i;

        //Display results
        System.out.println("The sum is " + sum);
    }
}

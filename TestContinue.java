public class TestContinue {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 10) {
            number++;
            if (number == 5 || number == 6)
                continue;
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}

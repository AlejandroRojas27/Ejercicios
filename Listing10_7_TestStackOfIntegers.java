public class Listing10_7_TestStackOfIntegers {
    public static void main(String[] args) {
        Listing10_8StackOfIntegers stack = new Listing10_8StackOfIntegers();

        for (int i = 1; i < 40; i++) {
            stack.push(i);
        }

        System.out.print(stack.pop() + " ");
        System.out.print(stack.pop() + " ");
    }
}

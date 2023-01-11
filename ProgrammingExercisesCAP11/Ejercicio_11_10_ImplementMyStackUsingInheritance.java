package ProgrammingExercisesCAP11;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_11_10_ImplementMyStackUsingInheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack list = new MyStack();

        System.out.println("Prompt 5 strings");

        for (int i = 1; i <= 5; i++) {
            System.out.print("String No. " + i + ": ");
            list.push(input.nextLine());
        }


        int size = list.getSize();

        System.out.println("Strings pop");
        for (int i = 0; i < size; i++) {
            System.out.println(list.pop());
        }



    }
}

class MyStack extends ArrayList<Object> {

    public boolean isEmpty() {
        return isEmpty();
    }

    public int getSize() {
        return size();
    }

    public Object peek() {
        return get(getSize() - 1);
    }

    public Object pop() {
        Object ans = get(getSize() - 1);
        remove(getSize() - 1);
        return ans;
    }

    public void push(Object o) {
        add(o);
    }

}

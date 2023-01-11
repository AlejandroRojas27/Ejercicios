package ProgrammingExercisesCAP11;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Ejercicio_11_6_UseArrayList {
    public static void main(String[] args) {
        java.util.Date date = new Date();
        Circle circle = new Circle(10);
        Loan loan = new Loan(5,10,1000);

        ArrayList<Object> list = new ArrayList<>();

        list.add(date);
        list.add(circle);
        list.add("Alex");
        list.add(loan);

        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }


    }
}

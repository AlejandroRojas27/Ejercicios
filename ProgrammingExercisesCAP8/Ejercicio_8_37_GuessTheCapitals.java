package ProgrammingExercisesCAP8;

import java.util.Scanner;

public class Ejercicio_8_37_GuessTheCapitals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[][] capitals = {
                {"Aguascalientes", "Aguascalientes"},
                {"Baja California", "Mexicali"},
                {"Baja California Sur", "La_Paz"},
                {"Campeche", "San_Francisco_de_Campeche"},
                {"Chiapas", "Tuxtla_Gutiérrez"},
                {"Chihuahua", "Chihuahua"},
                {"Ciudad de México", "Ciudad_de_México"},
                {"Coahuila", "Saltillo"},
                {"Colima", "Colima"},
                {"Durango", "Victoria_de_Durango"},
                {"Guanajuato", "Guanajuato"},
                {"Guerrero", "Chilpancingo_de_los_Bravo"},
                {"Hidalgo", "Pachuca_de_Soto"},
                {"Jalisco", "Guadalajara"},
                {"Estado de México", "Toluca_de_Lerdo"},
                {"Michoacán", "Morelia"},
                {"Morelos", "Cuernavaca"},
                {"Nayarit", "Tepic"},
                {"Nuevo León", "Monterrey"},
                {"Oaxaca", "Oaxaca_de_Juárez"},
                {"Puebla", "Puebla_de_Zaragoza"},
                {"Querétaro", "Santiago_de_Querétaro"},
                {"Quintana Roo", "Chetumal"},
                {"San Luis Potosí", "San_Luis_Potosí"},
                {"Sinaloa", "Culiacán_Rosales"},
                {"Sonora", "Hermosillo"},
                {"Tabasco", "Villahermosa"},
                {"Tamaulipas", "Ciudad_Victoria"},
                {"Tlaxcala", "Tlaxcala_de_Xicohténcatl"},
                {"Veracruz", "Xalapa_Enríquez"},
                {"Yucatán", "Mérida"},
                {"Zacatecas", "Zacatecas"},
        };

        int countCorrect = 0;
        String answer = " ";

        for (int i = 0; i < capitals.length; i++) {

            System.out.printf("\nWhat is the capital of %s? ", capitals[i][0]);

            answer = input.next();

            if(answer.equals(capitals[i][1])){
                System.out.println("Your answer is correct");
                countCorrect++;
            } else {
                System.out.printf("The correct answer should be %s", capitals[i][1]);
            }





        }

        System.out.printf("\nThe correct count is %d", countCorrect);


    }
}

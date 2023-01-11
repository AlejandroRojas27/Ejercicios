public class Listing10_3UseBMIClass {
    public static void main(String[] args) {
        Listing10_4_BMI bmi1 = new Listing10_4_BMI("Kim Yang", 26, 183, 67);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());

        Listing10_4_BMI bmi2 = new Listing10_4_BMI("Susan King", 195, 67);
        System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());

        

    }
}

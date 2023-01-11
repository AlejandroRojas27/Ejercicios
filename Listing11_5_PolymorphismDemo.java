public class Listing11_5_PolymorphismDemo {
    /** Main method */
    public static void main(String[] args) {
        // Display circle and rectangle properties
        displayObject(new Listing11_2_Circle(1, "red", false));
        displayObject(new Listing11_3_Rectangle(1,1,"black", true));
    }

    /** Display geometric object properties */
    public static void displayObject(Listing11_1_GeometricObject object){
        System.out.println("Created on " + object.getDateCreated() +
                ". Color is " + object.getColor());
    }
}

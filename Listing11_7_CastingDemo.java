public class Listing11_7_CastingDemo {
    /**
     * Main method
     */
    public static void main(String[] args) {
        //Create and initialize two objets
        Object object1 = new Listing11_2_Circle(1);  //Implicitly casting
        Object object2 = new Listing11_3_Rectangle(1, 1);  //Implicitly casting

        // Display circle and rectangle
        displayObject(object1);
        displayObject(object2);
    }

    /**
     * A method for displaying an object
     */
    public static void displayObject(Object object) {
        if (object instanceof Listing11_2_Circle) {
            System.out.println("The circle area is " +
                    ((Listing11_2_Circle) object).getArea());       //Explicitly casting
            System.out.println("The circle diameter is " +          //Polymorphic call
                    ((Listing11_2_Circle) object).getDiameter());   //Explicitly casting
        } else if (object instanceof Listing11_3_Rectangle) {
            System.out.println("The rectangle area is " +
                    ((Listing11_3_Rectangle) object).getArea());    //Polymorphic call
        }
    }
}

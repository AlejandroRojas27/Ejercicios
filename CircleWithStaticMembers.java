public class CircleWithStaticMembers {
    /**The radius of the circle */
    double radius;

    /** The number of objects created */
    static int numberOfObjets = 0;

    /** Construct a circle with radius 1*/
    CircleWithStaticMembers(){
        radius = 1;
        numberOfObjets++;
    }

    /**Construct a circle with a specified radius */
    CircleWithStaticMembers(double newRadius){
        radius = newRadius;
        numberOfObjets++;
    }

    /** Return numberOfObjects */
    static int getNumberOfObjets(){
        return numberOfObjets;
    }

    /** Return the area of this circle */
    double getArea(){
        return radius * radius * Math.PI;
    }

}

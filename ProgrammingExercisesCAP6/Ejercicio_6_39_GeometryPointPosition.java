package ProgrammingExercisesCAP6;

public class Ejercicio_6_39_GeometryPointPosition {
    public static void main(String[] args) {
        double x0 = 1;
        double y0 = 1;
        double x1 = 2;
        double y1 = 2;
        double x2 = 1;
        double y2 = -1;

        if(leftOfTheLine(x0, y0, x1, y1, x2, y2))
            System.out.println("("+ x2 + ", " + y2 + ") is on the left side of the line from " +
                    "(" + x0 + ", " + y0 + ") to (" + x2 + ", " + y2 + ")");
        else if (rightOfTheLine(x0, y0, x1, y1, x2, y2)) {
            System.out.println("("+ x2 + ", " + y2 + ") is on the right side of the line from " +
                    "(" + x0 + ", " + y0 + ") to (" + x2 + ", " + y2 + ")");
        }
        else if (onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
            System.out.println("("+ x2 + ", " + y2 + ") is on the line segment from " +
                    "(" + x0 + ", " + y0 + ") to (" + x2 + ", " + y2 + ")");
        }
        else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
            System.out.println("("+ x2 + ", " + y2 + ") is on the same line from " +
                    "(" + x0 + ", " + y0 + ") to (" + x2 + ", " + y2 + ")");
        }

    }

    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
        double ecuacion = (((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0)));
        if(ecuacion > 0)
            return true;
        else
            return false;
    }

    public static boolean rightOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){
        double ecuacion = (((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0)));
        if(ecuacion < 0)
            return true;
        else
            return false;

    }

    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2){
        double ecuacion = (((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0)));
        double dist1 = Math.pow(((Math.pow((x1-x0),2)) + (y1-y0)),0.5);
        double dist2 = Math.pow(((Math.pow((x2-x0),2)) + (y2-y0)),0.5);

        if(ecuacion == 0 && dist1 > dist2)
            return true;
        else
            return false;
    }

    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2){
        double ecuacion = (((x1 - x0) * (y2 - y0)) - ((x2 - x0) * (y1 - y0)));
        double dist1 = Math.pow(((Math.pow((x1-x0),2)) + (y1-y0)),0.5);
        double dist2 = Math.pow(((Math.pow((x2-x0),2)) + (y2-y0)),0.5);

        if (ecuacion == 0 &&  dist1 < dist2)
            return true;
        else
            return false;
    }
}

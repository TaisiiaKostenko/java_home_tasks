package Homework7;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        Shape[] shapesArray = { new Rectangle(10, 10, "red"),
                new Rectangle(15, 14, "red"),
                new Rectangle(8, 7, "red"),
                new Rectangle(5, 4, "red"),
                new Circle("blue", 9),
                new Circle("blue", 8),
                new Circle("blue", 7),
                new Triangle("green", 5, 3, 6),
                new Triangle("green", 10, 14, 13)};

        arrayOutput(shapesArray);
        System.out.println("Sum of all shapes areas -> " + sumOfAllAreas(shapesArray));
        System.out.println("Areas of each shape -> " + Arrays.toString(eachShapeArea(shapesArray)));
    }

    public static void arrayOutput (Shape [] shapesArray) {
        for (Shape row : shapesArray) {
            System.out.println(row.toString());
        }
    }

    public static double sumOfAllAreas (Shape[] shapesArray){
        double sumAll = 0;
        for(int i=0; i< shapesArray.length; i++)
        {
            sumAll = sumAll + shapesArray[i].calcArea();
        }
        return sumAll;
    }

    static double[] eachShapeArea(Shape[] shapesArray) {
        double[] eachArea = new double[3];
        for (int i = 0; i < shapesArray.length ; i++) {
            if (shapesArray[i] instanceof Rectangle) {
                eachArea[0] += shapesArray[i].calcArea();
            }
            else if (shapesArray[i] instanceof Circle) {
                eachArea[1] += shapesArray[i].calcArea();
            }
            else if (shapesArray[i] instanceof Triangle) {
                eachArea[2] += shapesArray[i].calcArea();
            }
        }
            return eachArea;
    }
}

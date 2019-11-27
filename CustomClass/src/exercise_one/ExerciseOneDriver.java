/*
    Name: JR Iriarte
    Date: Nov 25, 2019
    File: ExerciseOneDriver.java
    Description: Driver for problem 1
 */

package exercise_one;

public class ExerciseOneDriver
{
    public static void main(String[] args)
    {
        Point atOrigin = new Point();
        Point point = new Point(1, 5);

        System.out.println(atOrigin.toString()); //Point - x: 0.0, y: 0.0
        System.out.println(point.toString()); //Point - x: 1.0, y: 5.0

        System.out.println(atOrigin.isLocatedAtOrigin()); //true
        System.out.println(point.isLocatedAtOrigin()); //false

        System.out.println(point.distance(-2, 1)); //5
        System.out.println(atOrigin.distance(0, 0)); //0
    }
}

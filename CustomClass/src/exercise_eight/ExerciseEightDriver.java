/*
    Name: JR Iriarte
    Date: Nov 25, 2019
    File: ExerciseEightDriver.java
    Description: Driver for problem 8
 */

package exercise_eight;

public class ExerciseEightDriver
{
    public static void main(String[] args)
    {
        for (double i = 1; i < 10; i++)
        {
            for (double j = 1; j < 10; j++)
            {
                Rational rationalObj = new Rational(i,j);
                System.out.println(rationalObj);
            }
        }
    }
}

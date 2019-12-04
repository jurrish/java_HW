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
        //one instance
        Rational rationalObj = new Rational();

        for (double i = 1; i < 10; i++)
        {
            rationalObj.setNumerator(i); //set numerator every iteration - still only one object

            for (double j = 1; j < 10; j++)
            {
                rationalObj.setDenominator(j); //same logic for denominator - only one instance
                System.out.println(rationalObj);
            }
        }
    }
}

/*
    Name: JR Iriarte
    Date: Nov 25, 2019
    File: ExerciseTwoDriver.java
    Description: Driver for problem 2
 */

package exercise_six;

public class ExerciseSixDriver
{
    public static void main(String[] args)
    {
        String[] people = {
                "William", "Sue", "Rose", "Timothy"
        };

        CheckoutLine line = new CheckoutLine(people);
        System.out.println(line.toString()); //end --> [William, Sue, Rose, Timothy] --> front

        CheckoutLine anotherLine = new CheckoutLine(new String[] {"Fred", "George"});
        System.out.println(anotherLine.toString()); //end --> [Fred, George] --> front

        System.out.println(line.isFirst()); //Timothy
        System.out.println(line.isLast()); //William

        line.enterLine("Isabelle");
        System.out.println(line.isFirst()); //Rose
        System.out.println(line.isLast()); //Isabelle

        anotherLine.enterLine("Brett");
        System.out.println(anotherLine.isFirst()); //Fred
        System.out.println(anotherLine.isLast()); //Brett
    }
}

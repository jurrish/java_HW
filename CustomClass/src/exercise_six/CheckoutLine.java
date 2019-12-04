/*
    Name: JR Iriarte
    Date: Nov 25, 2019
    File: CheckoutLine.java
    Description: Class for problem 6
 */

package exercise_six;

import java.util.Arrays;

public class CheckoutLine
{
    private String[] peopleInLine;

    public CheckoutLine(String[] peopleInLine)
    {
        this.peopleInLine = peopleInLine;
    }

    public String[] getPeopleInLine()
    {
        return peopleInLine;
    }

    public void setPeopleInLine(String[] peopleInLine)
    {
        this.peopleInLine = peopleInLine;
    }

    public String toString()
    {
        return "end --> " + Arrays.toString(peopleInLine) + " ---> front";
    }

    public String isFirst()
    {
        //return the name of the person at the front of the line
        return peopleInLine[peopleInLine.length - 1];
    };

    public String isLast()
    {
        return peopleInLine[0];
    }

    public void enterLine(String name)
    {
        //iterate backwards until at the first index, then set 0th index to the argument that was passed in
        for (int i = peopleInLine.length - 1; i > 0; i--)
        {
            //swap
            peopleInLine[i] = peopleInLine[i - 1];
            if(i == 1)
            {
                peopleInLine[0] = name;
            }
        }
    }
}

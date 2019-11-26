/*
    Name: Frank Iriarte
    Date: 11/1/19
    File: MethodAssignment.java
    Description: Homework problems #s: 1, 6, 7, 9, 14, 15, 16, 17, 19, 21
 */

package method_homework;

public class MethodAssignment
{
    public static void main(String[] args)
    {
        /*
//        instantiate instance of class to use dot notation for method calls
//        because instructions say we cannot modify method headers in ANY way
//         */
//        MethodAssignment methodAssignment = new MethodAssignment();
//
//        /*
//        note: for returned values, we could save the returned value with our
//        test cases, or "one line" it using the returned value as the argument for
//        S.O.P.
//        */
//
//        //#1 test cases
//        System.out.println(methodAssignment.average(10,10,10,10));
//        System.out.println(methodAssignment.average(10,20,30,40));
//        System.out.println(methodAssignment.average(-10, -11, -7, -8));
//        printStars(1);
//
//        //#6 test cases
//        methodAssignment.divisible();
//        printStars(6);
//
//        //#7 test cases
//        System.out.println(methodAssignment.sumAndCompare(3,-4,0));
//        System.out.println(methodAssignment.sumAndCompare(7,3,10));
//        System.out.println(methodAssignment.sumAndCompare(10,-4,6));
//        printStars(7);
//
//        //#9 test cases
//        System.out.println(methodAssignment.twentyOrMore(10,25,8));
//        System.out.println(methodAssignment.twentyOrMore(16,32,4));
//        System.out.println(methodAssignment.twentyOrMore(-5,10,-15));
//        printStars(9);
//
//        //#14 test cases - casted to int per screen shot
//        System.out.println((int)methodAssignment.quadratic(1,1,1,2));
//        System.out.println((int)methodAssignment.quadratic(3,2,1,2));
//        System.out.println((int)methodAssignment.quadratic(-2,4,3,3));
//        printStars(14);
//
//        //#15 test cases
//        methodAssignment.information(0.55);
//        methodAssignment.information(3);
//        methodAssignment.information(0);
//        methodAssignment.information(-65784000);
//        printStars(15);
//
//        //#16 test cases
//        System.out.println(methodAssignment.daysInMonth("March"));
//        System.out.println(methodAssignment.daysInMonth("February"));
//        System.out.println(methodAssignment.daysInMonth("Apple"));
//        printStars(16);
//
//        //#17 test cases
//        methodAssignment.perfectSquares(10);
//        methodAssignment.perfectSquares(30);
//        printStars(17);
//
//        //#19 test cases
//        methodAssignment.comparisons(10, -30, 20);
//        methodAssignment.comparisons(1,1,1);
//        methodAssignment.comparisons(3,7,3);
//        printStars(19);
//
//        //#21 test cases
//        System.out.println(methodAssignment.powerOfFour(10));
//        System.out.println(methodAssignment.powerOfFour(4));
//        System.out.println(methodAssignment.powerOfFour(16));
//        System.out.println(methodAssignment.powerOfFour(64));
//        printStars(21);

//        printNums();
        printN();
    }

    //1 - return double
    public double average(double first, double second, double third, double fourth)
    {
        //add them up, divide by 4, return double
        return ((first + second + third + fourth)/4);
    }

    //6 - no return
    public static void divisible()
    {
        //iterate from 1->100
        for (int i = 1; i <= 100; i++)
        {
            if(i % 15 == 0)
            {
                //if divisible by least common denom [both 3 and 5]
                System.out.println(i + " is divisible by both 3 and 5");
            } else if (i % 5 == 0)
            {
                //only divisible by 5
                System.out.println(i + " is divisible by 5");
            } else if(i % 3 == 0)
            {
                //divisible by 3
                System.out.println(i + " is divisible by 3");
            }
        }
    }

    //7 - return boolean
    public boolean sumAndCompare(int first, int second, int compare)
    {
        //sum first two arguments and compare value to 3rd argument
        if(first + second == compare)
        {
            //return bool
            return true;
        }
        else
        {
            return false;
        }
    }

    //9- return boolean
    public boolean twentyOrMore(int first, int second, int third)
    {
        //difference of at least 20 between the arguments?
        if(first - second >= 20 || second - first >= 20 || third - first >= 20
        || third - second >= 20 || first - third >= 20 || second - third >= 20)
        {
            //return bool
            return true;
        }
        else
        {
            return false;
        }
    }

    //14  - return double
    public double quadratic(double a, double b, double c, double x)
    {
        //apply quadratic formula to args and return that value
        return (a * Math.pow(x, 2) + (b*x) + c);
    }

    //15 - no return
    public void information(double number)
    {
        if(Math.abs(number) < 1 && Math.abs(number) > 0)
        {
            //is the abs value of arg between 0 and 1 (non-inclusive)
            System.out.println(number + " is small");
        } else if(Math.abs(number) > 1000000)
        {
            //does it meet condition
            System.out.println(number + " is large");
        }

        //check if negative/positive/zero
        if(number < 0)
        {
            System.out.println(number + " is negative");
        } else if(number == 0)
        {
            System.out.println(number + " is zero");
        } else
        {
            System.out.println(number + " is positive");
        }
    }

    //16 - return int
    public int daysInMonth(String month)
    {
        //string conditions for returning appropriate ints
        if(month.equals("January") || month.equals("March") || month.equals("May")
        || month.equals("July") || month.equals("August") || month.equals("October")
        || month.equals("December"))
        {
            return 31;
        } else if(month.equals("April") || month.equals("June") || month.equals("September")
        || month.equals("November"))
        {
            return 30;
        } else if(month.equals("February"))
        {
            return 28;
        } else {
            return -1;
        }
    }

    //17 - no return
    public void perfectSquares(int max)
    {
        //iterate from 1->max and square where you're at in the iterations
        for (int i = 1; i <= max; i++)
        {
            //no return value
            System.out.println(i + " * " + i + " = " + i * i);
        }
    }

    //19 - no return
    public void comparisons(double first, double second, double third)
    {
        //if args are all equal vs. none are vs. some are but not all
        if(first == second && second == third && first == third)
        {
            System.out.println("All numbers are equal");
        } else if(first != second && second != third && first != third)
        {
            System.out.println("All numbers are different");
        } else
        {
            System.out.println("Neither all are equal or different");
        }
    }

    //21 - return bool
    public boolean powerOfFour(double check)
    {
        //if mod n == 0, num is divisible by n
        if(check % 4 == 0)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public static void printStars(int problemNumber)
    {
        System.out.println();
        System.out.println("^----These are test cases for # " + problemNumber);

        for (int i = 0; i < 30; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printNums()
    {
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println(i);
        }
    }

    public static void printN()
    {
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j < i; j++) {
                System.out.print(i);
            }
            System.out.println(i);
        }
    }
}

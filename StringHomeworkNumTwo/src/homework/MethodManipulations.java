/*
    Name: Frank Iriarte
    Date: 11/13/19
    Filename: MethodManipulations.java
    Description: Homework prob #s: 1, 2, 6, 7, 14, 17, 20, 21, 24, 25
 */

package homework;

import java.util.Arrays;

public class MethodManipulations
{
    public static void main(String[] args)
    {
        MethodManipulations methodManipulations = new MethodManipulations();

        //1 Test Cases
        System.out.println(methodManipulations.vowels("the"));
        System.out.println(methodManipulations.vowels("the weather was windy today"));
        System.out.println(methodManipulations.vowels("cry"));
        printStars(1);

        //2 Test Cases
        System.out.println(methodManipulations.words("hello world"));
        System.out.println(methodManipulations.words("is this code going to compile"));
        System.out.println(methodManipulations.words("perfect"));
        printStars(2);

        //6 Test Cases
        System.out.println(methodManipulations.capitalize("welcome to the show"));
        System.out.println(methodManipulations.capitalize("where am I?"));
        System.out.println(methodManipulations.capitalize("hello"));
        printStars(6);

        //7 Test Cases
        System.out.println(methodManipulations.penultimate("The game was on at 5pm"));
        System.out.println(methodManipulations.penultimate("How did she do that?"));
        System.out.println(methodManipulations.penultimate("Hello world"));
        printStars(7);

        //14 Test Cases
        System.out.println(Arrays.toString(methodManipulations.trimFirstLast(new double[]{0.1, 1.23, 4.0, 5.2})));
        System.out.println(Arrays.toString(methodManipulations.trimFirstLast(new double[]{1.9})));
        System.out.println(Arrays.toString(methodManipulations.trimFirstLast(new double[]{2.22, 9.11, 4.2, 7.0, 11.13})));
        printStars(14);

        //17 Test Cases
        System.out.println(Arrays.toString(methodManipulations.perfectCubes(1)));
        System.out.println(Arrays.toString(methodManipulations.perfectCubes(4)));
        System.out.println(Arrays.toString(methodManipulations.perfectCubes(10)));
        printStars(17);

        //20 Test Cases
        System.out.println(Arrays.toString(methodManipulations.sums(new int[]{3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(methodManipulations.sums(new int[]{10,0})));
        System.out.println(Arrays.toString(methodManipulations.sums(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
        printStars(20);

        //21 Test Cases
        System.out.println(methodManipulations.adjacent(new String[]{"apple", "orange", "banana", "orange"}));
        System.out.println(methodManipulations.adjacent(new String[]{"apple", "grape", "grape", "banana", "raspberry"}));
        System.out.println(methodManipulations.adjacent(new String[]{"raisin"}));
        printStars(21);

        //24 Test Cases
        System.out.println(methodManipulations.findLargest(new String[]{"melodramatic", "terrible", "another", "blue"}));
        System.out.println(methodManipulations.findLargest(new String[]{"super"}));
        System.out.println(methodManipulations.findLargest(new String[]{"blue", "red", "cyan", "yellow", "gray"}));
        printStars(24);

        //25 Test Cases
        System.out.println(methodManipulations.allTheSame(new Boolean[]{true}));
        System.out.println(methodManipulations.allTheSame(new Boolean[]{false, false, true, false, false}));
        System.out.println(methodManipulations.allTheSame(new Boolean[]{false, false, false}));
        printStars(25);
    };

    //1
    public int vowels(String input)
    {
        //keep track of occurrences in count
        int count = 0;

        //iterate through input and increment count conditionally
        for (int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
            || input.charAt(i) == 'o' || input.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    };

    //2
    public int words(String sentence)
    {
        //create new word array, split by spaces, return length
        String[] words = sentence.split(" ");
        return words.length;
    };

    //6
    public String capitalize(String search)
    {
        //first split by space then create string aggregator
        String[] words = search.split(" ");
        String capWord = "";

        /*
            iterate through newly created array and uppercase first string index
            and re-concatenate
         */
        for (int i = 0; i < words.length; i++)
        {
          String newWord = words[i].substring(0,1).toUpperCase() + words[i].substring(1);
          capWord = capWord + " " + newWord;
        }
        return capWord;
    };

    //7
    public String penultimate(String sentence)
    {
        String[] wordArray = sentence.split(" ");

        //second to last index is penultimate word (no spaces in wordArray)
        String penultimate = wordArray[wordArray.length - 2];
        return penultimate;
    }

    //14
    public double[] trimFirstLast(double[] values)
    {
        double[] newArray = new double[2];

        //if array only contains 2 or less, it's trimmed
        if(values.length < 3)
        {
            return values;
        }

        //index 0 and 1 correlate to extracted words
        newArray[0] = values[0];
        newArray[1] = values[values.length - 1];

        return newArray;
    }

    //17
    public int[] perfectCubes(int n)
    {
        //allows dynamic insertion of n elements to be evaluated
        int[] perfArray = new int[n];

        //iterate through array and cube indices [cast to int bc .pow consumes doubles]
        for (int i = 0; i < perfArray.length; i++)
        {
            perfArray[i] = (int) Math.pow(i+1, 3);
        }
        return perfArray;
    }

    //20
    public int[] sums(int[] valuesToSum)
    {
        //make space for evenSums and oddSums
        int[] evenOdd = new int[2];

        //iterate and assign summed values according to modulus condition for even/odd nums
        for (int i = 0; i < valuesToSum.length; i++)
        {
            if(valuesToSum[i] % 2 == 0)
            {
                evenOdd[0] += valuesToSum[i];
            } else
            {
                evenOdd[1] += valuesToSum[i];
            }
        }
        return evenOdd;
    }

    //21
    public boolean adjacent(String[] words)
    {
        //create flag to toggle on/off conditionally
        boolean flag = true;

        //edge case
        if(words.length < 2)
        {
            return false;
        }

        // -1 to avoid out of bounds @ i+1 conditional check
        for (int i = 0; i < words.length - 1; i++)
        {
            if(words[i].equals(words[i+1]))
            {
                flag = true;
                return flag;
            } else
            {
                flag = false;
            }
        }
        return flag;
    }

    //24
    public String findLargest(String[] searchIn)
    {
        //edge case
        if(searchIn.length == 1)
        {
            return searchIn[0];
        }

        //aggregator
        String largest = "";

        //check up to last index and compare assigned largest vs current index
        for (int i = 0; i < searchIn.length - 1; i++)
        {
            if(largest.length() < searchIn[i].length())
            {
                largest = searchIn[i];
            }
        }
        return largest;
    }

    //25
    public boolean allTheSame(Boolean[] flags)
    {
        //edge case
        if(flags.length == 1)
        {
            return true;
        }

        //iterate to last index
        for (int i = 0; i < flags.length - 1; i+=2)
        {
            //local variables to compare
            boolean currIndex = flags[i];
            boolean indexToCompare = flags[i+1];

            //do their values correspond?
            if(currIndex != indexToCompare)
            {
                return false;
            }
        }
        return true;
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

}

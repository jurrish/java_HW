/*
    Name: JR Iriarte
    Date: Nov 25, 2019
    File: ExerciseFiveDriver.java
    Description: Driver for problem 5
 */

package exercise_five;

import java.util.Random;

public class ExerciseFiveDriver
{
    private static final int BOUNDARY = 5;
    private static String[] firstNames = new String[] { "Tom", "Russel", "Drew", "Aaron", "Kam"};
    private static String[] lastNames = new String[] {"Brady", "Wilson", "Brees", "Rodgers", "Chancellor"};
    private static String[] sport = new String[] {"Football", "Baseball", "Hockey", "Basketball", "Curling"};
    private static String[] position = new String[] {"Quarterback", "Safety", "Cornerback", "Center", "Runningback"};

    public static void main(String[] args)
    {
        ExerciseFiveDriver.printTenAthletes();
    }

    private static void printTenAthletes()
    {
        Random randomizer = new Random();

        for (int i = 0; i < 10; i++)
        {
            Athlete newAthlete = new Athlete(
                    sport[0], //only football - per homework instructions
                    position[randomizer.nextInt(BOUNDARY)],
                    firstNames[randomizer.nextInt(BOUNDARY)],
                    lastNames[randomizer.nextInt(BOUNDARY)]
            );
            System.out.println(newAthlete.toString());
        }
    };
}

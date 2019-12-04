package exercise_five;

public class Athlete
{
    private String sport;
    private String position;
    private String firstName;
    private String lastName;

    public Athlete(String sport, String position, String firstName, String lastName)
    {
        this.sport = sport;
        this.position = position;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getSport()
    {

        return sport;
    }

    public String getPosition()
    {
        return position;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setSport(String sport)
    {
        this.sport = sport;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String toString()
    {
        return "Athlete - " + firstName + " " + lastName + " (" + sport + " - " + position + ")";
    }
}

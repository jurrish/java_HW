package exercise_eight;

public class Rational
{
    private double numerator;
    private double denominator;

    public Rational(double numerator, double denominator)
    {
        if(denominator == 0){
            System.out.println("Error: cannot divide by zero - " + numerator + "/0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational()
    {
        this.numerator = 1;
        this.denominator = 1;
    }

    public double getNumerator()
    {
        return numerator;
    }

    public void setNumerator(double numerator)
    {
        this.numerator = numerator;
    }

    public double getDenominator()
    {
        return denominator;
    }

    public void setDenominator(double denominator)
    {
        this.denominator = denominator;
    }

    public String toString()
    {
        return (int)numerator + "/" + (int)denominator;
    }
}

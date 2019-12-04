package exercise_one;

public class Point
{
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point()
    {
        this.x = 0;
        this.y = 0;
    }

    public double getX()
    {

        return x;
    }

    public double getY()
    {

        return y;
    }

    public String toString()
    {

        return "Point - x: " + x + ", y: " + y;
    }

    public boolean isLocatedAtOrigin()
    {
        //if (0,0) return true
        if(x == 0 && y == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public double distance(double xOther, double yOther)
    {
        //distance formula given x and y values
        return Math.sqrt( (Math.pow((y-yOther),2))+(Math.pow((x-xOther), 2)));
    }
}

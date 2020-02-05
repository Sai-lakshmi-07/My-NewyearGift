package demo;

public class Sweets {
    double calories;
    double cost;
}
class Jalebi extends Sweets{
    public double dispCost()
    {
        String w=String.format("%.2f", cost);
        System.out.println("Price of Jalebi : "+w);
        System.out.println("Total Calories in Jalebi : "+calories);
        return cost;
    }
    public void totCalc(float c)
    {
        calories=c*30;
        cost=8*c;
    }
}
class Maalpuri extends Sweets{
    public double dispCost()
    {
        String w=String.format("%.2f", cost);
        System.out.println("Price of Maalpuri : "+w);
        System.out.println("Total Calories in Maalpuri : "+calories);
        return cost;
    }
    public void totCalc(float c)
    {
        calories=c*25;
        cost=10*c;
    }
}




package demo;

public class Candies {
    double calories;
    double price;
}
class Hardies extends Candies{
    public double dispPrice()
    {
        String w=String.format("%.2f", price);
        System.out.println("Price of Hardies : "+w);
        System.out.println("Total Calories in Hardies : "+calories);
        return price;
    }
    public void totCalc(float c)
    {
        calories=c*7;
        price=2*c;
    }
}
class Jellies extends Candies{
    public double dispPrice()
    {
        String w=String.format("%.2f", price);
        System.out.println("Price of Jellies : "+w);
        System.out.println("Total Calories in Jellies : "+calories);
        return price;
    }
    public void totCalc(float c)
    {
        calories=c*5;
        price=4*c;
    }
}




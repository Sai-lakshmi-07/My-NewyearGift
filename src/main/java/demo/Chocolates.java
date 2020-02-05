package demo;

public class Chocolates {
    double calories;
    double price;
}
class Temptations extends Chocolates{
    public double dispPrice()
    {
        String w=String.format("%.2f", price);
        System.out.println("Price of Temptations : "+w);
        System.out.println("Total Calories in Temptations : "+calories);
        return price;
    }
    public void totCalc(float c)
    {
        calories=c*20;
        price=80*c;
    }
}
class DairyMilk extends Chocolates{
    public double dispPrice()
    {
        String w=String.format("%.2f", price);
        System.out.println("Price of DairyMilk : "+w);
        System.out.println("Total Calories in DairyMilk : "+calories);
        return price;
    }
    public void totCalc(float c)
    {
        calories=c*15;
        price=45*c;
    }
}
class MilkyBar extends Chocolates{
    public double dispPrice()
    {
        String w=String.format("%.2f", price);
        System.out.println("Price of MilkyBar : "+w);
        System.out.println("Total Calories in MilkyBar : "+calories);
        return price;
    }
    public void totCalc(float c)
    {
        calories=c*25;
        price=15*c;
    }
}



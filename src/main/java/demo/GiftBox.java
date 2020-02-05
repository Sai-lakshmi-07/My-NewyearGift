package demo;

public class GiftBox {
    double price;
}
class Pen extends GiftBox{
    public double dispPrice()
    {
        String w=String.format("%.2f", price);
        System.out.println("Price of Pen Box : "+w);
        return price;
    }
    public void calcPrice(float c)
    {
        price=50*c;
    }
}
class PhotoFrame extends GiftBox{
    public double dispPrice()
    {
        String w=String.format("%.2f", price);
        System.out.println("Price of PhotoFrame : "+w);
        return price;
    }
    public void calcPrice(float c)
    {
        price=250*c;
    }
}
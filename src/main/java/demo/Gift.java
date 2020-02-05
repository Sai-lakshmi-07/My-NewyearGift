package demo;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class Gift {
    public static void main(String[] args)
    {
        ArrayList<String> shoppers=new ArrayList<String>(Arrays.asList("Sai","Nani","Riyaan","Sakshi"));
        ArrayList<String> giftbox  =new ArrayList<String>(Arrays.asList("PhotoFrame","Pen"));
        ArrayList<String> chocolates=new ArrayList<String>(Arrays.asList("Temptations","DairyMilk","MilkyBar"));
        ArrayList<String> sweets=new ArrayList<String>(Arrays.asList("Jalebi","Maalpuri"));
        ArrayList<String> candies=new ArrayList<String>(Arrays.asList("Hardies","Jellies"));
        int num=4;
        ArrayList<Double> sam=new ArrayList<Double>(num);
        double price=0;
        for(int i=0;i<shoppers.size();i++) {
            System.out.println("*****************************-------****************************");
            System.out.println(shoppers.get(i));
            System.out.println("<<<<<<<--------------->>>>>>>");
            Random random = new Random();
            String a = giftbox.get(random.nextInt(giftbox.size()));
            String b = candies.get(random.nextInt(candies.size()));
            String c = chocolates.get(random.nextInt(chocolates.size()));
            String d = sweets.get(random.nextInt(sweets.size()));
            if (a.equals("Pen")) {
                Pen p = new Pen();
                ThreadLocalRandom random1 = ThreadLocalRandom.current();
                int w = random1.nextInt(0, 5);
                p.calcPrice(w);
                price += p.dispPrice();
            } else if (a.equals("PhotoFrame")) {
                PhotoFrame pf = new PhotoFrame();
                ThreadLocalRandom random1 = ThreadLocalRandom.current();
                int w = random1.nextInt(0, 5);
                pf.calcPrice(w);
                price += pf.dispPrice();
            }
            if (b.equals("Hardies")) {
                Hardies h = new Hardies();
                ThreadLocalRandom random1 = ThreadLocalRandom.current();
                float w = random1.nextInt(0, 5);
                h.totCalc(w);
                price += h.dispPrice();
            } else if (b.equals("Jellies")) {
                Jellies jl = new Jellies();
                ThreadLocalRandom random1 = ThreadLocalRandom.current();
                float w = random1.nextInt(0, 5);
                jl.totCalc(w);
                price += jl.dispPrice();
            }
            if (c.equals("Temptations")) {
                Temptations t = new Temptations();
                ThreadLocalRandom random1 = ThreadLocalRandom.current();
                float w = random1.nextInt(0, 5);
                t.totCalc(w);
                price += t.dispPrice();
            } else if (c.equals("DairyMilk")) {
                DairyMilk dm = new DairyMilk();
                ThreadLocalRandom random1 = ThreadLocalRandom.current();
                float w = random1.nextInt(0, 5);
                dm.totCalc(w);
                price += dm.dispPrice();
            } else if (c.equals("MilkyBar")) {
                MilkyBar mb = new MilkyBar();
                ThreadLocalRandom random1 = ThreadLocalRandom.current();
                float w = random1.nextInt(0, 5);
                mb.totCalc(w);
                price += mb.dispPrice();
            }
            if (d.equals("Jalebi")) {
                Jalebi j = new Jalebi();
                ThreadLocalRandom random1 = ThreadLocalRandom.current();
                float w = random1.nextInt(0, 5);
                j.totCalc(w);
                price += j.dispCost();
            } else if (d.equals("Maalpuri")) {
                Maalpuri m = new Maalpuri();
                ThreadLocalRandom random1 = ThreadLocalRandom.current();
                float w = random1.nextInt(0, 5);
                m.totCalc(w);
                price += m.dispCost();
            }

            sam.add(price);
            price = 0;
        }
        System.out.println("Tadaaaaa............See What we Obtained!!!!!!!!");
        System.out.println("<<<-----:Sorted Result Regarding Price of Items owned by Individuals:----->>>");
        while(!sam.isEmpty()) {
            int min=sam.indexOf(Collections.min(sam));
            String re=String.format("%,.2f",sam.get(min));
            System.out.println(shoppers.get(min)+"---"+re);
            sam.remove(sam.get(min));
            shoppers.remove(min);

        }


    }

}

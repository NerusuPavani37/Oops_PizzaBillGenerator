import java.util.*;
public class pizza
{

    private String crust;
    private String cheese;
    private String topings;
    private String size;
    private String isveg;
    private int quantity;
    private String carryBag;
    private String deliveryType;
    private String orderconform;
    private int bill;
     pizza(){
        this.bill=0;
     }
    void addCrust(String crust)
    {
        if(crust.equals("wheat")){
            this.bill+=100;
        }
        if(crust.equals("maida")){
            this.bill+=50;
        }
         if(crust.equals("handtoast")){
            this.bill+=30;
        }
    }
    void addCheese(String cheese)
    {
            if(cheese.equals("yes")){
                this.bill+=50;
            }
    }
    void addTopings(String topings)
    {
       if(topings.equals("tomato"))
       {
        this.bill+=40;
       }

       if(topings.equals("onion"))
       {
        this.bill+=30;
       }

       if(topings.equals("olives"))
       {
        this.bill+=45;
       }

        if(topings.equals("mushroom"))
       {
        this.bill+=60;
       }

        if(topings.equals("paneer"))
       {
        this.bill+=50;
       }

        if(topings.equals("sweetcorn"))
       {
        this.bill+=25;
       }
    }
    void addSize(String size)
    {
        if(size.equals("regular")){
            this.bill+=100;
        }
        
        if(size.equals("medium")){
            this.bill+=150;
        }
        
        if(size.equals("large")){
            this.bill+=200;
        }

    }
    void isVeg(String isveg)
    {
        if(isveg.equals("yes"))
        {
            this.bill+=50;
        }
        if(isveg.equals("no"))
        {
            this.bill+=80;
        }
    }
    void addQuantity(int quant)
    {
    
       
            this.bill*=quant;
       
    }
    void addCarryBag(String carr){
        if(carr.equals("yes")){
            this.bill+=10;
        }
    }
    void addDeliveryType(String type)
    {
        if(type.equals("home"))
        {
            this.bill+=70;
        }
        if(type.equals("office"))
        {
            this.bill+=70;
        }
        if(type.equals("doorstep"))
        {
            this.bill+=100;
        }
    }
    void addorder(String order){
        if(order.equals("yes")){
            System.out.println("<<-----ORDER CONFIRMED----->>");
        }
        if(order.equals("no")){
            System.out.println("<<-----ORDER CANCELLED----->>");
            this.bill=0;
        }
    }
     int getBill(){
        return this.bill;
     }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
           pizza p1=new pizza();
           System.out.println("-->Select the type of crust you want");
           System.out.println("  1.wheat"); 
           System.out.println("  2.maida");
           System.out.println("  3.handtoast");  
           String cr=sc.nextLine();
           p1.addCrust(cr); 

           System.out.println("-->Do you want cheese? Enter yes/no");
           String ch=sc.nextLine();
           p1.addCheese(ch);
           
           System.out.println("-->please select the topings");
           System.out.println("->tomato? Enter yes/no");
           String opinion=sc.nextLine();
           if(opinion.equals("yes"))
           {
              p1.addTopings("tomato");
           }
           System.out.println("->onions? Enter yes/no");
               String op=sc.nextLine();
                if(op.equals("yes"))
                {
                  p1.addTopings("onion");
                }
           System.out.println("->olives? Enter yes/no");
               String opi=sc.nextLine();
                if(opi.equals("yes"))
                {
                  p1.addTopings("olives");
                }
           System.out.println("->mushroom? Enter yes/no");
               String opin=sc.nextLine();
           
                if(opin.equals("yes"))
                {
                  p1.addTopings("mushroom");
                }
           System.out.println("->paneer? Enter yes/no");
                String opini=sc.nextLine();
           
                if(opini.equals("yes"))
                {
                  p1.addTopings("paneer");
                }
           System.out.println("->sweetcorn? Enter yes/no");
               String opinio=sc.nextLine();
           
                if(opinio.equals("yes"))
                {
                  p1.addTopings("sweetcorn");
                }

           System.out.println("-->please enter the size");
           System.out.println("  1.regular");
           System.out.println("  2.medium");
           System.out.println("  3.large");
           String sz=sc.nextLine();
           p1.addSize(sz);

            System.out.println("-->is veg? Enter yes/no");
            String veg=sc.nextLine();
            p1.isVeg(veg);

            System.out.println("--> please enter the quantity");
            int quan=sc.nextInt();
            p1.addQuantity(quan);

            sc.nextLine();

            System.out.println("-->do you want carrybag? Enter yes/no");
            String cb=sc.nextLine();
            p1.addCarryBag(cb);

            System.out.println("-->please select the mode of delivery");
            System.out.println("  1.home");
            System.out.println("  2.office");
            System.out.println("  3.doorstep");
            String del=sc.nextLine();
            p1.addDeliveryType(del);

            System.out.println("please confirm the order Enter yes/no");
            String od=sc.nextLine();
            p1.addorder(od);

            int a=p1.getBill();
            if(a==0){
                return;
            }
            System.out.println("Total Bill --->>"+" "+a);
            System.out.println("Thank you PIZZA LOVER, Enjoy the Order :) ");
            System.out.println("Take care & Visit again");
    }
}
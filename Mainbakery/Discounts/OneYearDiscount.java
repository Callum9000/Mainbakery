package Discounts;

public class OneYearDiscount extends DiscountDecorator {

    public OneYearDiscount(Discount newDiscount)
    {
        super(newDiscount);
    }
    
    public String getDescription(){

        return tempDiscount.getDescription() + "20% off with one year on your loyalty card";
    }

    public double GetDiscount(){

        return tempDiscount.GetDiscount() + 20;
    }
}
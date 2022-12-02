package Discounts;

public class TwoYearDiscount extends DiscountDecorator {

    public TwoYearDiscount(Discount newDiscount)
    {
        super(newDiscount);
    }
    
    public String getDescription(){

        return tempDiscount.getDescription() + "30% off with two years on your loyalty card";
    }

    public double GetDiscount(){

        return tempDiscount.GetDiscount() + 30;
    }
}
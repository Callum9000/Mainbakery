package Discounts;

public class SixMonthDiscount extends DiscountDecorator {

    public SixMonthDiscount(Discount newDiscount)
    {
        super(newDiscount);
    }
    
    public String getDescription(){

        return tempDiscount.getDescription() + "15% off with 6 months on your loyalty card";
    }

    public double GetDiscount(){

        return tempDiscount.GetDiscount() + 15;
    }
}

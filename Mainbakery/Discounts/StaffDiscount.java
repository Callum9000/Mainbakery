package Discounts;

public class StaffDiscount extends DiscountDecorator{

    public StaffDiscount(Discount newDiscount)
    {
        super(newDiscount);
    }
    
    public String getDescription(){

        return tempDiscount.getDescription() + "40% off for memebers of staff";
    }

    public double GetDiscount(){

        return tempDiscount.GetDiscount() + 40;
    }
}
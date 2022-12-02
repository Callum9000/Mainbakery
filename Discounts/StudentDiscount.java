package Discounts;

public class StudentDiscount extends DiscountDecorator {

    public StudentDiscount(Discount newDiscount)
    {
        super(newDiscount);
    }
    
    public String getDescription(){

        return tempDiscount.getDescription() + "10% off with valid Student ID";
    }

    public double GetDiscount(){

        return tempDiscount.GetDiscount() + 10;
    }
}

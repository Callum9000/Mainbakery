package Discounts;

abstract class DiscountDecorator implements Discount {

    protected Discount tempDiscount;

    public DiscountDecorator(Discount newDiscount){

        tempDiscount = newDiscount;
    }

    public String getDescription(){

        return tempDiscount.getDescription();
    }

    public double GetDiscount(){

        return tempDiscount.GetDiscount();
    }
    
}

package Discounts;

public class BaseDiscount implements Discount
{

    @Override
    public double GetDiscount() {
        return 0;
    }

    @Override
    public String getDescription() {
        return "Discount available: ";
    }

}
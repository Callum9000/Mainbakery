import Discounts.*;
public class Payment extends Orders {
    
    public static String makePayment() //Payment method, takes delivery, total cost of user products and then applies the users discount from the DiscountDecorator class.
    {
        double total = 0.0;

        total += Delivery.calculate_delivery_cost();

        for(int i = 0; i < Orders.cart.size(); i++)
        {
            total += Orders.cart.get(i).getPrice();
        }


        String discount = AccountDTO.getDiscountType();
        switch(discount.toLowerCase()){
            case "staff":
                Discount myDiscountZero = new StaffDiscount(new BaseDiscount());
                total = total - (total * myDiscountZero.GetDiscount());
                break;
            case "twoyear":
                Discount myDiscountOne = new TwoYearDiscount(new BaseDiscount());
                total = total - (total * myDiscountOne.GetDiscount());
                break;
            case "sixmonth":
                Discount myDiscountTwo = new SixMonthDiscount(new BaseDiscount());
                total = total - (total * myDiscountTwo.GetDiscount());
                break;
            case "oneyear":
                Discount myDiscountThree = new OneYearDiscount(new BaseDiscount());
                total = total - (total * myDiscountThree.GetDiscount());
                break;
            case "student":
                Discount myDiscountFour = new StudentDiscount(new BaseDiscount());
                total = total - (total * myDiscountFour.GetDiscount());
                break;

            default:
        }

        String output = "Your order comes to: £" + total + ". " + "This amount will be taken out of your account. A discount of type: " + AccountDTO.getDiscountType() + " was applied." + " Thank you for shopping with us.";
        return output;

    }
}

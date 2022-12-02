public class Delivery extends Orders { //Calculates the cost of delivery, which is then passed to Payment
    static float standard_fee = 0.2f;
    static int base_fee = 2;

    static float calculate_delivery_cost() {
        float distance = 5.0f;
        float cost = Math.round(distance * standard_fee) + base_fee;
        return cost;
    }

}


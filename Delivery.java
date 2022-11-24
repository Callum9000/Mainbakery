public class Delivery extends Orders {
    static float standard_fee = 0.2f;
    static int base_fee = 2;

    static float get_distance(float x) {
        // maybe add google maps implimentation
        return x;
    }

    static int calculate_delivery_cost(int x) {
        float distance = get_distance(5.0f);
        int cost = Math.round(distance * standard_fee) + base_fee;
        return cost;
    }

}

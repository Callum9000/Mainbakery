import java.util.List;
import java.util.ArrayList;

public class Orders extends Main {
    static String current_cart;

    static String current_order(String x) {
        return x;
    }

    static String past_orders(String x) {
        return x;
    }

    static String make_order(String x) {
        return x;
    }

    static boolean cancel_order(boolean x) {
        return x;
    }

    static float net_price(float x) {
        return x;
    }

    static int delivery_charge(int x) {
        int charge = Delivery.calculate_delivery_cost(1);
        return charge;
    }
}

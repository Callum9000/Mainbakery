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

    public static void main(String[] args) {
        List<String> current_cart = new ArrayList<String>();
        current_cart.add("1");
        System.out.println(Account.name);
        System.out.println(Account.address);
        System.out.println(Account.email);
        Account.change_details("name", "callum");
        Account.change_details("address", "123 drive");
        Account.change_details("email", "Test@gmail.com");
        System.out.println(Account.name);
        System.out.println(Account.address);
        System.out.println(Account.email);
    }

}

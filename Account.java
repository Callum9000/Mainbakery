
public class Account extends Delivery {
    // add database
    static String name = "Callum";
    static String address = "testplace";
    static String email = "bob@gmail";
    static Boolean is_staff;

    static void change_details(String x, String y) {
        if (x == "name") {
            name = x + " " + y.toUpperCase();
            System.out.print(name);
        } else if (x == "address") {
            address = x + " " + y;
        } else if (x == "email") {
            email = x + " " + y;
        } else {
            System.out.print("error change details incorrect input");
        }
    }
}

import factoryClass.*;

import java.util.ArrayList;

public class Products extends productFactory{
    static ArrayList<productType> productList = new ArrayList<>();
    static ArrayList<String> productNames = new ArrayList<>();

    static String available_products(String x) {
        return x;
    }

    static int product_price(int x) {
        return x;
    }

    static void setName(String x){
        String name = x;
        productNames.add(name);
    }

    static void addProducts(String x){
        productList.add(getType(x));
    }

}

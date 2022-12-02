
import factoryClass.productFactory;

import java.util.Scanner;

public class ProductsDTO extends productFactory { //Business logic for our Products class
static int count = 0;
    public static boolean getProductName(){
        boolean complete = false;
        String input;
        Scanner in = new Scanner(System.in);
        String detail = in.nextLine().toLowerCase();
        switch (detail){
            case "CHOC CAKE":
                productFactory.getType("CHOC CAKE");
                String name = "ChocCake " + count;
                count++;
                Products.setName(name);
                return complete = true;
            case "CARROT CAKE":
                productFactory.getType("CARROT CAKE");
                return complete = true;
            case "CROISSANT":
                productFactory.getType("CROISSANT");
                return complete = true;
            default:
                return complete = true;
        }
    }

    public static String productsToString(){
        String output = "Available Products: ";
        for(int i = 0; i < Products.productList.size(); i++){
            output += Products.productList.get(i).getName() + ". ";
        }
        return output;
    }
}

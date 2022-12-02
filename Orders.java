import java.util.List;

import factoryClass.productFactory;
import factoryClass.productType;
import java.util.Scanner;

import java.util.ArrayList;

public class Orders extends Products {
    
    static ArrayList<productType> cart = new ArrayList<productType>();
    static String orderID;

    public Orders(){
    }

    public static String addProduct() //Adds a product to the users cart. calls the facotryclass getType();
    {
        String output = " ";
        String input = " ";
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the product you want to add");
        input = in.nextLine();
        switch(input.toLowerCase()){
            case "chocolate cake":
                cart.add(getType("CHOC CAKE"));
                output = "Succesfully added chocolate cake";
                return output;
            case "carrot cake":
                cart.add(getType("CARROT CAKE"));
                output = "Succesfully added carrot cake";
                return output;
            case "croissant":
                cart.add(getType("CROISSANT"));
                output = "Succesfully added Croissant";
                return output;
            default:
                output = "Could not add product, please try again.";
                return output;

        }
       
    }

    public static String getCart() // toString of users cart and the price of their products.
    {
        String output = " ";
        for(int i = 0; i < cart.size(); i++)
        {
            System.out.println("Loop: " + i);
            output += " Item: " + cart.get(i).getName() + " Price: £" + cart.get(i).getPrice();
        }

        return output;
    }
}


package BillPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Billythekid {
    
    static ArrayList<Bill> bills = new ArrayList<Bill>();
    static String orderID;

    public Billythekid(){
    }

    public static String bills() //adds bills
    {
        String output = " ";
        String input = " ";
        Scanner in = new Scanner(System.in);
        System.out.println("show bills, add a bill, pay bills");
        input = in.nextLine();
        switch(input.toLowerCase()){
            case "show bills":
                for (Bill num : bills){
                    output = output + num.toString() + num.getPrice();

                }
                return output;
            case "pay":
            for (Bill num : bills){
                num.pay();
                output = "all bills paid";
            }
                return output;
            case "add a bill":
                // String out = " ";
                // String inp = " ";
                // inp = in.nextLine();
                // Scanner i = new Scanner(System.in);
                // System.out.println("Please enter the amount");
                // try {
                // bills.add(new Bill(Integer.parseInt(inp)));
                // }
                // catch (Exception e) {
                //     System.out.println("Something went wrong.");
                // }
                bills.add(new Bill(10));
                output = "made bill";
                return output;

            default:
                output = "Could not add product, please try again.";
                return output;

        }
       
    }
}
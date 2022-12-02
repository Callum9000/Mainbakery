import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Products.addProducts("CHOC CAKE"); //Add products to our Product List
        Products.addProducts("CARROT CAKE");
        Products.addProducts("CROISSANT");
        String LoginFile = "Login.csv";
        LoginPage(LoginFile); //Start Login process
        viewer(LoginFile); //Start our viewer
    }

    public static void LoginPage(String file) {
        boolean running = true;
        Scanner LR = new Scanner(System.in);
        while(running == true)
        {
        System.out.println("Login or Register?"); //Ask user to either log in or create an account, and run the appropriate function.
        String LoginOrRegister = (LR.nextLine()).toString();
        if (LoginOrRegister.equals("L")) {
            String[] account = LogIn.login(file);
            AccountDTO.setAll(account);
            running = false;
        } else if (LoginOrRegister.equals("R")) {
            Register.writing(file);
            running = false;
        }
        }
    }

    public static void viewer(String file) { //Our main viewer, takes the users input and passes it to the Controller
        Scanner in = new Scanner(System.in);
        String input;
        boolean running = true;
        System.out.println("Welcome to The Bakery!, please enter your query. Type 'help' to see a list of commands");

        while (running == true) {
            input = in.nextLine().toLowerCase();
            String output = Controller(input, file);
            if (output.equals("quit"))
                running = false;
            else {
                System.out.println(output);
            }
        }
        in.close();
    }

    public static String Controller(String input, String file) { //Controller, calls various functions depending on input and returns string output to the viewer.
        String output = " ";

        switch (input) {
            case "help":
                output = "Available commands: getAccountDetails, changeAccountDetails, AddToOrder, ShowCart, products, payment, quit";
                return output;

            case "getaccountdetails":
                output = AccountDTO.AccountDetailsToString();
                return output;

            case "changeaccountdetails":
                boolean complete = AccountDTO.setAccountDetails();
                if (complete == true) {
                    ReadCSV.writeAccountDetails(AccountDTO.getID(), file);
                    output = "Change succesfully saved!";
                    return output;
                } else if (complete == false) {
                    output = "Change not saved, please try again";
                    return output;
                }

            case "addtoorder":
                output = Orders.addProduct();
                return output;

            case "showcart":
                output = Orders.getCart();
                return output;
            
            case "payment":
                output = Payment.makePayment();
                return output;

            case "quit":
                return input;

            case "products":
                output = ProductsDTO.productsToString();
                return output;

            default:
                output = "Invalid command, please try again. Type 'help' for a list of commands.";
                return output;
        }

    }
}
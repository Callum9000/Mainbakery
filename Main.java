import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        LogIn.login();
        viewer();
    }

    public static void viewer()
    {
        Scanner in = new Scanner(System.in);
        String input;
        boolean running = true;
        System.out.println("Welcome to The Bakery!, please enter your query. Type 'help' to see a list of commands");
        
        while(running == true)
        {
            input = in.nextLine().toLowerCase();
            String output = Controller(input);
            if(output.equals("quit"))
                running = false;
            else
            {
                System.out.println(output);
            }
        }
        in.close();
    }

    public static String Controller(String input)
    {
        String output = " ";

        switch(input)
        {
            case "help":
                output = "Available commands: getAccountDetails, changeAccountDetails, orders, products, quit";
                return output;

            case "getaccountdetails":
                output = AccountDTO.AccountDetailsToString();
                return output;

            case "changeaccountdetails":
                boolean complete = AccountDTO.setAccountDetails();
                if(complete == true){
                    output = "Change succesfully saved!";
                    return output;
                }
                else if(complete == false)
                {
                    output = "Change not saved, please try again";
                    return output;
                }

            case "orders":
                return output;

            case "quit":
                return input;
                
            default:
                output = "Invalid command, please try again. Type 'help' for a list of commands.";
                return output;
        }

    }
}

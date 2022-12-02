import java.util.Scanner; // Import the Scanner class
import java.util.ArrayList;

class LogIn {
  public static String[] login() {
    Boolean accepted = false;
    String[] accountName = {};
    ArrayList<String[]> data = ReadCSV.readcsv("Mainbakery//Login.csv");

    while (accepted == false) {
      Scanner myObj = new Scanner(System.in);
      System.out.println("Enter username");
      String inputuserName = (myObj.nextLine()).toString();
      System.out.println("Enter password");
      String inputPassword = (myObj.nextLine()).toString();

      for (int i = 0; i < data.size(); i++) {
        String[] account = data.get(i);
        if (inputuserName.equals(account[1]) && inputPassword.equals(account[2])) {
          System.out.println("Valid");
          accepted = true;
          accountName = account;
        }
      }

      if (accepted != true) {
        System.out.println("Invalid try again");
      }

    }
    return accountName;
  }
}
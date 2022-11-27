import java.util.Scanner;
import java.util.ArrayList;

class LogIn {
  public static void login() {
    Boolean accepted = false;
    ArrayList<String[]> data = ReadCSV.readcsv("Login.csv");
    while (accepted == false) {
      Scanner myObj = new Scanner(System.in);
      System.out.println("Enter username");
      String inputUserName = (myObj.nextLine()).toString();
      System.out.println("Enter password");
      String inputPassword = (myObj.nextLine()).toString();
      for (int i = 0; i < data.size(); i++) {
        String[] account = data.get(i);
        if (inputUserName.equals(account[0]) && inputPassword.equals(account[1])) {
          System.out.println("Valid");
          myObj.close();
          accepted = true;
        }
      }
      if (accepted != true) {
        System.out.println("Invalid try again");
      }
    }
  }
}
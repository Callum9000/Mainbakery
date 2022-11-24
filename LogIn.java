import java.util.Scanner; // Import the Scanner class
import java.util.List;

class LogIn {

  public static void login() {
    Boolean accepted = false;
    List<String[]> data = ReadCSV.readcsv("LogIn.csv");

    while (accepted == false) {
      Scanner myObj = new Scanner(System.in);
      System.out.println("Enter username");
      String inputuserName = (myObj.nextLine()).toString();
      System.out.println("Enter password");
      String inputPassword = (myObj.nextLine()).toString();

      for (int i = 0; i < data.size(); i++) {
        String[] account = data.get(i);
        if (inputuserName.equals(account[0]) && inputPassword.equals(account[1])) {
          System.out.println("Valid");
          accepted = true;
        }
      }

      if (accepted != true) {
        System.out.println("Invalid try again");
      }
    }
  }

}
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Register { //Create new Account
    public static void writing(String file) {

        try {
            ArrayList<String[]> data = ReadCSV.readcsv(file);
            String id = "";
            for (int i = 0; i < data.size(); i++) {
                id = Integer.toString(Integer.valueOf((data.get(i))[0]) + 1);
            }

            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter email");
            String inputUserName = (myObj.nextLine()).toString();
            System.out.println("Enter password");
            String inputPassword = (myObj.nextLine()).toString();
            System.out.println("Enter name");
            String inputName = (myObj.nextLine()).toString();
            System.out.println("Enter address");
            String inputAddress = (myObj.nextLine()).toString();
            String[] newAccount = { id, inputUserName, inputPassword, inputName, inputAddress };
            AccountDTO.setAll(newAccount);
            FileWriter fw = new FileWriter(file);
            for (int i = 0; i < data.size(); i++) {
                ReadCSV.writeLine(fw, data.get(i));
                fw.write(System.lineSeparator());
            }
            ReadCSV.writeLine(fw, newAccount);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("File updated successfully!");

    }

}

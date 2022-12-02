import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    public static void writing(String file) {

        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter username");
            String inputUserName = (myObj.nextLine()).toString();
            System.out.println("Enter password");
            String inputPassword = (myObj.nextLine()).toString();
            String[] newAccount = { inputUserName, inputPassword };
            ArrayList<String[]> data = ReadCSV.readcsv(file);
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

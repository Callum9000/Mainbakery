import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Register {
    public static void writing() {

        try {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter username");
            String inputUserName = (myObj.nextLine()).toString();
            System.out.println("Enter password");
            String inputPassword = (myObj.nextLine()).toString();
            String[] newAccount = { inputUserName, inputPassword };
            ArrayList<String[]> data = ReadCSV.readcsv("Login.csv");
            FileWriter fw = new FileWriter("Login.csv");
            for (int i = 0; i < data.size(); i++) {
                writeLine(fw, data.get(i));
                fw.write(System.lineSeparator());
            }
            writeLine(fw, newAccount);
            fw.close();
            myObj.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("File updated successfully!");

    }

    public static void writeLine(FileWriter x, String[] line) throws IOException {
        for (String cell : line) {
            if (cell.equals(line[line.length - 1])) {
                x.write(cell);
            } else {
                x.write(cell + ",");
            }
        }
    }
}

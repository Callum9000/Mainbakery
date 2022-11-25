import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Register {
    public static void writing(String[] writeInput) {
        try {
            ArrayList<String[]> data = ReadCSV.readcsv("Login.csv");
            FileWriter fw = new FileWriter("Login_test.csv");
            for (int i = 0; i < data.size(); i++) {
                writeLine(fw, data.get(i));
                fw.write(System.lineSeparator());
            }
            writeLine(fw, writeInput);
            fw.close();
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

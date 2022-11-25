import java.io.*;
import java.util.ArrayList; // import the ArrayList class

class ReadCSV {

    public static ArrayList<String[]> readcsv(String input_file) {

        ArrayList<String[]> data = new ArrayList<String[]>();
        String testRow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(input_file));
            while ((testRow = br.readLine()) != null) {
                String[] line = testRow.split(",");
                data.add(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found");
        } catch (IOException e) {
            System.out.println("ERROR: Could not read");
        }
        return data;
    }
}
import java.util.Scanner; // Import the Scanner class

import javax.swing.plaf.basic.BasicTreeUI.TreeIncrementAction;

import java.io.*;
import java.util.ArrayList; // import the ArrayList class
import java.util.List;

class ReadCSV {

    public static List<String[]> readcsv(String input_file) {

        List<String[]> data = new ArrayList<String[]>();
        String testRow;
        try {
            BufferedReader br = new BufferedReader(new FileReader(input_file));
            while ((testRow = br.readLine()) != null) {
                String[] line = testRow.split(",");
                data.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File not found");
        } catch (IOException e) {
            System.out.println("ERROR: Could not read");
        }
        return data;
    }
}
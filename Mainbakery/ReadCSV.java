import java.util.Scanner; // Import the Scanner class

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

    public static void writeLine(FileWriter x, String[] line) throws IOException {
        for (String cell : line) {
            if (cell.equals(line[line.length - 1])) {
                x.write(cell);
            } else {
                x.write(cell + ",");
            }
        }
    }

    public static void writeAccountDetails(String id, String file) {
        try {
            String[] newAccount = { id, AccountDTO.getEmail(), AccountDTO.getPassword(), AccountDTO.getName(),
                    AccountDTO.getAddress() };
            ArrayList<String[]> data = ReadCSV.readcsv(file);
            FileWriter fw = new FileWriter(file);
            for (int i = 0; i < data.size(); i++) {

                if (id.equals((data.get(i))[0])) {
                    ReadCSV.writeLine(fw, newAccount);
                } else {
                    ReadCSV.writeLine(fw, data.get(i));
                }
                fw.write(System.lineSeparator());
            }
            // ReadCSV.writeLine(fw, newAccount);
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
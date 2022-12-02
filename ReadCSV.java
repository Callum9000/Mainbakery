import java.io.*;
import java.util.ArrayList; // import the ArrayList class

class ReadCSV {

    public static ArrayList<String[]> readcsv(String input_file) { //Reads selected file, returns error if file not found

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

    public static void writeLine(FileWriter x, String[] line) throws IOException { //writes out input to a file
        for (String cell : line) {
            if (cell.equals(line[line.length - 1])) {
                x.write(cell);
            } else {
                x.write(cell + ",");
            }
        }
    }

    public static void writeAccountDetails(String id, String file) { //writes out a new accounts details to a file
        try {
            String[] newAccount = { id, AccountDTO.getEmail(), AccountDTO.getPassword(), AccountDTO.getName(),
                    AccountDTO.getAddress(), AccountDTO.getDiscountType() };
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

    public static void writeOrders(String file){ //writes out a orders detail to a file
        try{
            String[] newOrder = {ProductsDTO.productsToString()};
            ArrayList<String[]> data = ReadCSV.readcsv(file);
            FileWriter fw = new FileWriter(file);
            for (int i = 0; i < data.size(); i++) {


                    ReadCSV.writeLine(fw, newOrder);

                fw.write(System.lineSeparator());
            }
            // ReadCSV.writeLine(fw, newAccount);
            fw.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
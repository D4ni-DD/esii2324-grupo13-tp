package esii2324.grupo13.tp;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileReader;

public class CSVFileReader implements FileData {
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


    @Override
    public void readFile(String path) {
        String line = "";
        String splitBy = ",";

        try
        {
            BufferedReader br = new BufferedReader(new FileReader("CSVDemo.csv"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] data = line.split(splitBy);    // use comma as separator
                System.out.println("CSV [Process=" + data[0] + ", FLOW=" + data[1] + ", Type=" + data[2] + ", Unit=" + data[3] + ", Quantity= " + data[4] +"]");
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}

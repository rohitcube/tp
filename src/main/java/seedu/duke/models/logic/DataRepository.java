package seedu.duke.models.logic;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataRepository {
    public static ArrayList<String> getRequirements(String major){
        try{
            //add validation if wrong major?
            String fileName = String.format("src/main/java/seedu/duke/models/data/%sRequirements",major);
            File f = new File(fileName);
            if (!f.exists()) {
                System.out.println("File does not exist");
                return new ArrayList<>();
            }
            ArrayList<String> currentArray = new ArrayList<>();
            Scanner s = new Scanner(f);
            while (s.hasNext()) {
                String currentLine = s.nextLine();
                currentArray.add(currentLine);
            }
            return currentArray;
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}

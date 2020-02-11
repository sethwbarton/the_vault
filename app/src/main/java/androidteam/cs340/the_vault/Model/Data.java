package androidteam.cs340.the_vault.Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Data {
    private static Data _instance;
    public static Data instance() {
        if (_instance == null){
            _instance = new Data();
        }
        return _instance;
    }

    private ArrayList<Card> cards = new ArrayList<>();

    /*Data(){
        readFile();
    }


    private void readFile(){
        String csvFile = "androidteam/cs340/the_vault/DOMINION_CARD_NAMES";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] cardString = line.split(cvsSplitBy);

                System.out.println(cardString[0]);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }*/
}

package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader {
    private static Reader instance;
    private List<String> textFromFile;

    private Reader() {}

    public static Reader getInstance() {
        if (instance == null) {
            instance = new Reader();
        }
        return instance;
    }

    public void readFile(){

        try (InputStream is = Reader.getInstance().getClass().getClassLoader().getResourceAsStream("appliances_db.txt");
                BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            textFromFile = new ArrayList<>();
            String line;

            while ((line = reader.readLine()) != null) {
                textFromFile.add(line);
            }

        } catch (IOException e) {

        }
    }

    public List<String> getTextFromFile() {
        return textFromFile;
    }
}


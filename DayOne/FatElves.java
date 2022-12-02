package DayOne;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FatElves {
int calories ;






    void getInput() {
        StringBuilder contentBuilder = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String sCurrentLine;
            while ((sCurrentLine = reader.readLine()) != null) {
                contentBuilder.append(sCurrentLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String input  = contentBuilder.toString();
    }

}

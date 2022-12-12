package Day1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FatElves {
    int fatty;
    ArrayList<Integer> theLads = new ArrayList<Integer>();
    String str;

    public void calorieCalculator() {
        try {
            //creates a file object
            File myObj = new File("DayOne\\input.txt");
            //creates a reader object
            Scanner myReader = new Scanner(myObj);
            //while file has next line
            while (myReader.hasNextLine()) {
                //creating a string with next line
                str = myReader.nextLine();
                //if break
                if (str.isBlank()) {
                    //add to list
                    theLads.add(fatty);
                    //set total
                    fatty = 0;
                } else {
                    //add to calories
                    fatty = fatty + Integer.parseInt(str);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //sort the array
        Collections.sort(theLads);
        //adding last three values
        System.out.println(theLads.get(theLads.size() - 1) + theLads.get(theLads.size() - 2) + theLads.get(theLads.size() - 3));
    }
}


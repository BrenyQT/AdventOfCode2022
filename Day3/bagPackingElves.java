package Day3;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class bagPackingElves {

    String str;

    int total ;

    public void elfStacker() {
        try {
            //creates a file object
            File myObj = new File("Day3\\input.txt");
            //creates a reader object
            Scanner myReader = new Scanner(myObj);
            //while file has next line
            while (myReader.hasNextLine()) {
                //creating a string with next line
                str = myReader.nextLine();
                String strSplit1 = str.substring(0, str.length() / 2);
                String strSplit2 = str.substring(str.length() / 2);
                total += gotchaBitch(Compare(strSplit1, strSplit2));
            }
            System.out.println(total);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public char Compare(String strSplit1, String strSplit2) {
        char correct = 'c';
        for (char x : strSplit2.toCharArray()) {
            if (strSplit1.indexOf(x) != -1) {
                correct = x;
            }
        }
        return correct;
    }

    public int gotchaBitch(char c) {
        if (Character.isUpperCase(c)) {
            return ((int) c) - 38;
        } else {
            return ((int) c) - 96;
        }

    }


}

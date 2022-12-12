package Day3;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class bagPackingElves {

    String str;
    ArrayList<String> storeRoom = new ArrayList<>();
    String one;
    String two;
    String three;
    int total;

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
                storeRoom.add(str);
            }
            for (int i = 0; i < storeRoom.size(); ) {
                one = storeRoom.get(i);
                two = storeRoom.get(i + 1);
                three = storeRoom.get(i + 2);
                i += 3;
                total += gotchaBitch(Compare(one, two, three));
            }


            System.out.println(total);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public char Compare(String str1, String str2, String str3) {
        char correct = 'c';
        for (char x : str2.toCharArray()) {
            if (str1.indexOf(x) != -1 && str3.indexOf(x) != -1) {
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

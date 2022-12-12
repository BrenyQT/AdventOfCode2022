package Day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class wormyElves {


    //PART 1
    //A for Rock       #  Y for Paper
    // B for Paper     #  Z for Scissors
    // C for Scissors  #  X for Rock


    //PART 2
    //Win

    //A for Rock       #  Z for Paper
    // B for Paper     #  Z for Scissors
    // C for Scissors  #  Z for Rock

    //Draw
    //A for Rock       #  Y for Rock
    // B for Paper     #  Y for Paper
    // C for Scissors  #  Y for Scissors

    //Lose
    //A for Rock       #  X for Scissors
    // B for Paper     #  X for Rock
    // C for Scissors  #  X for Paper

    //X means you need to lose
    //Y means you need to end the round in a draw
    //Z means you need to win

    // 1 for Rock, 2 for Paper, and 3 for Scissors

    //0 if you lost
    // 3 if the round was a draw
    // 6 if you won
    int myScore;
    String str;
    public void rockPaperScissorsCalculator() {

        HashMap<String, Integer> numbers = new HashMap<>();
        numbers.put("A Z", 8);
        numbers.put("B Z", 9);
        numbers.put("C Z", 7);

        numbers.put("A X", 3);
        numbers.put("B X", 1);
        numbers.put("C X", 2);

        numbers.put("A Y", 4);
        numbers.put("B Y", 5);
        numbers.put("C Y", 6);


        try {
            //creates a file object
            File myObj = new File("DayTwo\\input.txt");
            //creates a reader object
            Scanner myReader = new Scanner(myObj);


            // 1 for Rock, 2 for Paper, and 3 for Scissors
            //0 if you lost, 3 if the round was a draw, and 6 if you won
            //A for Rock       #  Y for Paper
            // B for Paper     #  Z for Scissors
            // C for Scissors  #  X for Rock
            int finalScore = 0;
            while (myReader.hasNextLine()) {
                //itterarte through map
                str = myReader.nextLine();
                    for (Entry<String, Integer> entry : numbers.entrySet()) {
                        //if value on line = hashmap value
                        if (entry.getKey().equals(str)) {
                            myScore += entry.getValue();
                            finalScore += myScore;
                            myScore = 0;
                        }
                    }
                }
            System.out.println(finalScore);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}

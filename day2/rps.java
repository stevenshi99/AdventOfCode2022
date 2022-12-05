package day2;

// a, x = rock = 1
// b, y, = paper = 2
// c, z = scissors = 3

// loss = 0
// tie = 3
// win = 6

import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class rps {
    
    public static int helper() throws Exception {
        int score = 0;
        try {
            Scanner scanner = new Scanner(new File("day2/testInput.txt"));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                line = line.replace(" ", "");
                char[] arr = line.toCharArray();
                Move move = new Move(arr[1]);
                score += move.getScore(arr[0]);
            }
        } catch (IOException e) {
            throw new Exception(e);
        }


        return score;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(helper());
    }
}

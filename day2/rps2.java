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

public class rps2 {
    
    public static int helper() throws Exception {
        int score = 0;
        try {
            Scanner scanner = new Scanner(new File("day2/input.txt"));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                line = line.replace(" ", "");
                char[] arr = line.toCharArray();
                if(arr[1] == 'Y') { //tie
                    score += getNumberValue(arr[0]) + 3;
                } else if(arr[1] == 'X') { //lose
                    score += getLoss(arr[0]);
                } else { //win
                    score += getWin(arr[0]) + 6;
                }
            }
        } catch (IOException e) {
            throw new Exception(e);
        }


        return score;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(helper());
    }

    public static int getNumberValue (char value) {
        switch(value){
            case 'A':
                return 1;
            case 'B': 
                return 2;
            case 'C': 
                return 3;
            default:
                return 0;
        }
    }

    public static int getWin (char value) {
        switch(value){
            case 'A':
                return 2;
            case 'B': 
                return 3;
            case 'C': 
                return 1;
            default:
                return 0;
        }
    }

    public static int getLoss (char value) {
        switch(value){
            case 'A':
                return 3;
            case 'B': 
                return 1;
            case 'C': 
                return 2;
            default:
                return 0;
        }
    }
}

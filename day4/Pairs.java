package day4;

import java.io.File;
import java.util.Scanner;

public class Pairs {


    public static int countPairs() {
        int total = 0;
        try {
            Scanner scanner = new Scanner(new File("day4/input.txt"));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] nums = line.split(",");
                String[] firstRange = nums[0].split("-");
                String[] secondRange = nums[1].split("-");

                if(Integer.parseInt(firstRange[0]) >= Integer.parseInt(secondRange[0]) &&
                    Integer.parseInt(firstRange[1]) <= Integer.parseInt(secondRange[1]) ) {
                        total +=1;
                } else if(Integer.parseInt(firstRange[1]) >= Integer.parseInt(secondRange[1]) &&
                Integer.parseInt(firstRange[0]) <= Integer.parseInt(secondRange[0]) ) {
                    total +=1;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(countPairs());
    }
}
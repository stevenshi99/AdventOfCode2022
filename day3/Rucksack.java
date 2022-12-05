package day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class Rucksack {

    public static int getAmount() {
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        int amount = 1;
        for(char i = 'a'; i <= 'z'; ++i) {
            hashMap.put(i, amount++);
        }

        for(char i = 'A'; i <= 'Z'; ++i) {
            hashMap.put(i, amount++);
        }
        // for(char x : hashMap.keySet()) {
        //     System.out.println(x + " " + hashMap.get(x));
        // }
        int total = 0;
        List<Character> firstHalf = new ArrayList<>();
        List<Character> secondHalf = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("day3/input.txt"));
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                int length = line.length();
                for(int i = 0; i < length/2; ++i) {
                    firstHalf.add(line.charAt(i));
                }

                for(int i = length/2; i < length; ++i) {
                    secondHalf.add(line.charAt(i));
                }
                firstHalf.retainAll(secondHalf);
                total += hashMap.get(firstHalf.get(0));
                firstHalf.clear();
                secondHalf.clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(getAmount());
    }

}

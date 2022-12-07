package day3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.io.File;

public class Part2 {

    public static int getAmount() {
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        int amount = 1;
        for (char i = 'a'; i <= 'z'; ++i) {
            hashMap.put(i, amount++);
        }

        for (char i = 'A'; i <= 'Z'; ++i) {
            hashMap.put(i, amount++);
        }

        int total = 0;
        try {
            System.out.println("got here");
            String[] lines = new String[3];
            Scanner scanner = new Scanner(new File("day3/input.txt"));
            while (scanner.hasNextLine()) {
                HashSet<Character> lineSet = new HashSet<Character>();
                lines[0] = scanner.nextLine();
                lines[1] = scanner.nextLine();
                lines[2] = scanner.nextLine();
                Set<Character> first = new HashSet<Character>();
                Set<Character> second = new HashSet<Character>();
                Set<Character> third = new HashSet<Character>();
                for(int i = 0; i < lines[0].length(); ++i) {
                    first.add(lines[0].charAt(i));
                }

                for(int i = 0; i < lines[1].length(); ++i) {
                    second.add(lines[1].charAt(i));
                }

                for(int i = 0; i < lines[2].length(); ++i) {
                    third.add(lines[2].charAt(i));
                }

                first.retainAll(second);
                first.retainAll(third);

                List<Character> list = new ArrayList<Character>(first);
                total += hashMap.get(list.get(0));
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

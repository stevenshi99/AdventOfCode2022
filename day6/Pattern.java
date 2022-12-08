package day6;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Pattern {

    public static int firstValue() {

        int idx = 1;
        try {
            Scanner scanner = new Scanner(new File("day6/input.txt"));
            String line = scanner.nextLine();

            Queue<Character> sequence = new LinkedList<Character>();
            sequence.add(line.charAt(0));
            while (idx < line.length()) {
                char c = line.charAt(idx);
                if (sequence.contains(c)) {
                    while (sequence.contains(c) && !sequence.isEmpty()) {
                        sequence.poll();
                    }
                }
                sequence.add(c);
                if (sequence.size() == 14) { // set to 4 for part 1, 14 for part 2
                    return idx + 1;
                }
                ++idx;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return idx;
    }

    public static void main(String[] args) {
        System.out.println(firstValue());
    }
}

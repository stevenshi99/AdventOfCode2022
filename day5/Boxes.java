package day5;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Boxes {
    public static String findTop() {
        int total = 0;
        try {
            Scanner scanner = new Scanner(new File("day5/input.txt"));
            HashMap<Integer, Stack<Character>> map = new HashMap<>(); 
            Stack<Character> list = new Stack<Character>();
            list.push('H');
            list.push('C');
            list.push('R');
            Stack<Character> temp = (Stack<Character>) list.clone();
            map.put(1, temp);
            list.clear();

            list.push('B');
            list.push('J');
            list.push('H');
            list.push('L');
            list.push('S');
            list.push('F');
            temp = (Stack<Character>) list.clone();
            map.put(2, temp);
            list.clear();
            
            list.push('R');
            list.push('M');
            list.push('D');
            list.push('H');
            list.push('J');
            list.push('T');
            list.push('Q');
            temp = (Stack<Character>) list.clone();
            map.put(3, temp);
            list.clear();

            list.push('S');
            list.push('G');
            list.push('R');
            list.push('H');
            list.push('Z');
            list.push('B');
            list.push('J');
            temp = (Stack<Character>) list.clone();
            map.put(4, temp);
            list.clear();

            list.push('R');
            list.push('P');
            list.push('F');
            list.push('Z');
            list.push('T');
            list.push('D');
            list.push('C');
            list.push('B');
            temp = (Stack<Character>) list.clone();
            map.put(5, temp);
            list.clear();

            list.push('T');
            list.push('H');
            list.push('C');
            list.push('G');
            temp = (Stack<Character>) list.clone();
            map.put(6, temp);
            list.clear();

            list.push('S');
            list.push('N');
            list.push('V');
            list.push('Z');
            list.push('B');
            list.push('P');
            list.push('W');
            list.push('L');
            temp = (Stack<Character>) list.clone();
            map.put(7, temp);
            list.clear();

            list.push('R');
            list.push('J');
            list.push('Q');
            list.push('G');
            list.push('C');
            temp = (Stack<Character>) list.clone();
            map.put(8, temp);
            list.clear();

            list.push('L');
            list.push('D');
            list.push('T');
            list.push('R');
            list.push('H');
            list.push('P');
            list.push('F');
            list.push('S');
            temp = (Stack<Character>) list.clone();
            map.put(9, temp);
            list.clear();

            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                Stack<Character> current = (Stack<Character>) map.get(words[1]).clone();
                current = 
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
    public static void main(String[] args) {
        System.out.println(findTop());
    }
}

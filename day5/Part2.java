package day5;

import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Part2 {
    public static String findTop() {
        String ret = "";
        try {
            Scanner scanner = new Scanner(new File("day5/input.txt"));
            HashMap<Integer, Stack<Character>> map = new HashMap<>(); 
            Stack<Character> list = new Stack<Character>();

            // list.push('Z');
            // list.push('N');
            // map.put

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
                String[] words = line.split(" "); // move x from y to z
                int amount = Integer.parseInt(words[1]);
                int fromIndex = Integer.parseInt(words[3]);
                Stack<Character> from = (Stack<Character>) map.get(fromIndex).clone();

                int toIndex = Integer.parseInt(words[5]);
                Stack<Character> to = (Stack<Character>) map.get(toIndex).clone();
                
                Stack<Character> stackToAdd = new Stack<Character>();
                for(int i = 0 ; i < amount; ++i) {
                    char c = from.pop();
                    stackToAdd.push(c);
                }
                for(int i = 0; i < amount; ++i) {
                    to.push(stackToAdd.pop());
                }
                map.put(fromIndex, from);
                map.put(toIndex, to);
            }
            for(int k : map.keySet()) {
                ret += map.get(k).pop();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;
    }
    public static void main(String[] args) {
        System.out.println(findTop());
    }
}

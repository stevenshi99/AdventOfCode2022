package day1;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.PriorityQueue;


public class part2 {

    public static int helper() {
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(3);
        pQueue.add(0);
        pQueue.add(0);
        pQueue.add(0);
        int current = 0;
        int total = 0;
        try {
			RandomAccessFile file = new RandomAccessFile("day1/input.txt", "r");

            String str;

            while ((str = file.readLine()) != null) {
                if(str.isEmpty()) {
                    if(pQueue.peek() < current) {
                        pQueue.poll();
                        pQueue.add(current);
                    }
                    current = 0;
                } else {
                    current += Integer.parseInt(str);
                }
            }
            file.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

        for(int x : pQueue) {
            total += x;
        }
        return total;
    }
    public static void main(String[] args) {
        // helper();
        System.out.println(helper());
    }
}


package day1;

import java.io.IOException;
import java.io.RandomAccessFile;


public class maxCalories {

    public static int helper() {
        int maxInt = 0;
        int current = 0;

        try {
			RandomAccessFile file = new RandomAccessFile("day1/input.txt", "r");

            String str;

            while ((str = file.readLine()) != null) {
                if(str.isEmpty()) {
                    maxInt = Math.max(maxInt, current);
                    current = 0;
                } else {
                    current += Integer.parseInt(str);
                }
            }
            file.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

        return maxInt;
    }
    public static void main(String[] args) {
        // helper();
        System.out.println(helper());
    }
}


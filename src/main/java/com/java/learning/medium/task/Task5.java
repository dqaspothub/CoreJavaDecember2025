package com.java.learning.medium.task;

public class Task5 {

    public static void main(String[] args) {

        int[] numbers = {10, 15, 20, 25, 30};

        int evenCount = 0;
        int oddCount = 0;
        int sum = 0;
        int i = 0;

        // for loop → even count
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] % 2 == 0)
                evenCount++;
        }

        // enhanced for → odd count
        for (int num : numbers) {
            if (num % 2 != 0)
                oddCount++;
        }

        // while loop → sum
        while (i < numbers.length) {
            sum += numbers[i];
            i++;
        }

        // do-while → print numbers
        int k = 0;
        do {
            System.out.println(numbers[k]);
            k++;
        } while (k < numbers.length);

        System.out.println("Even Count: " + evenCount);
        System.out.println("Odd Count: " + oddCount);
        System.out.println("Sum: " + sum);
    }
}

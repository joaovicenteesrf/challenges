package Challenges;

import java.util.List;

public class MinMaxNumbersSum {

    /*
    Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of
    the five integers. Then print the respective minimum and maximum values as a single line of two space-separated
    long integers.
     */

    public static void miniMaxSum(List<Integer> arr) {

        long min = 0;
        long max = 0;
        long sum = 0;

        for (Integer number : arr) {

            sum += number;

            if (min == 0 || max == 0) {
                min = max = number;
            }

            if (number < min) {
                min = number;
            } else if (number > max) {
                max = number;
            }

        }

        long maxSum = sum - min;
        long minSum = sum - max;

        System.out.println(minSum + " " + maxSum);

    }

}

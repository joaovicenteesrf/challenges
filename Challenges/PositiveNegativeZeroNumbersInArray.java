package Challenges;

import java.util.List;

public class PositiveNegativeZeroNumbersInArray {


    /*
    Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
    Print the decimal value of each fraction on a new line with  places after the decimal.
     */
    public void plusMinus(List<Integer> arr) {

        int size = arr.size();

        int positiveQty = 0;
        int negativeQty = 0;
        int zeroQty = 0;


        for (Integer number : arr) {
            if (number == 0) {
                zeroQty++;
            } else if (number > 0) {
                positiveQty++;
            } else {
                negativeQty++;
            }
        }

        double positiveRatio = (double)positiveQty/(double)size;
        double negativeRatio = (double)negativeQty/(double)size;
        double zeroRatio = (double)zeroQty/(double)size;

        System.out.printf("%.5f\n%.5f\n%.5f", positiveRatio, negativeRatio, zeroRatio);

    }


}

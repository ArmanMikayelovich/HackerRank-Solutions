package com.hackerrank.armanmikayelovich.interview_preparation_kit.arrays;

//https://www.hackerrank.com/challenges/minimum-swaps-2
public class MinimumSwaps2 {
    public static int minimumSwaps(int[] arr) {
        int swapCount = 0;
        boolean needOrder = true;
        while (needOrder) {

            for (int offset = 0; offset < arr.length; offset++) {
                int currentNumber = arr[offset];
                if (currentNumber != offset + 1) {
                    arr[offset] = arr[currentNumber - 1];
                    arr[currentNumber - 1] = currentNumber;
                    swapCount++;
                }
            }
            for (int offset = 0; offset < arr.length-1; offset++) {
                if (arr[offset] > arr[offset + 1]) {
                    needOrder = true;
                    break;
                }
                needOrder = false;

            }
        }
        return swapCount;
    }
}

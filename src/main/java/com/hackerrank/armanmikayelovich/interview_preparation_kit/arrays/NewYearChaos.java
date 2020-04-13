package com.hackerrank.armanmikayelovich.interview_preparation_kit.arrays;

/*https://www.hackerrank.com/challenges/new-year-chaos*/
public class NewYearChaos {
    private static final String TOO_CHAOTIC = "Too chaotic";

    public static Object minimumBribes(int[] intArray) {
        int arrayLength = intArray.length;
        int numBribes = 0;
        for (int i = arrayLength - 2; i >= 0; i--) {
            int j = i + 1, t = intArray[i];
            int countB = 0;
            while ((j < arrayLength) && (t > intArray[j])) {
                intArray[j - 1] = intArray[j];
                j++;
                countB++;
                if (countB > 2) {
                    return TOO_CHAOTIC;
                }
            }
            intArray[j - 1] = t;
            numBribes += countB;
        }
        return numBribes;
    }
}

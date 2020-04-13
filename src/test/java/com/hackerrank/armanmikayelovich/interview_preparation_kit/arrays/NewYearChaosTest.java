package com.hackerrank.armanmikayelovich.interview_preparation_kit.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NewYearChaosTest {
    @Test
    public void testCase1() {
        int[] numbers1 = {2, 1, 5, 3, 4};
        int[] numbers2 = {2, 5, 1, 3, 4};

        Object answer1 = NewYearChaos.minimumBribes(numbers1);
        Assertions.assertEquals(3, answer1);

        Object answer2 = NewYearChaos.minimumBribes(numbers2);
        Assertions.assertEquals("Too chaotic", answer2);
    }


    @Test
    public void testCase2() {
        int[] numbers1 = {5, 1, 2, 3, 7, 8, 6, 4};
        int[] numbers2 = {1, 2, 5, 3, 7, 8, 6, 4};

        Object answer1 = NewYearChaos.minimumBribes(numbers1);
        Assertions.assertEquals("Too chaotic", answer1);

        Object answer2 = NewYearChaos.minimumBribes(numbers2);
        Assertions.assertEquals(7, answer2);
    }

    @Test
    public void testCase3() {
        int[] numbers1 = {1, 2, 5, 3, 4, 7, 8, 6};

        Object answer1 = NewYearChaos.minimumBribes(numbers1);
        Assertions.assertEquals(4, answer1);


    }
}
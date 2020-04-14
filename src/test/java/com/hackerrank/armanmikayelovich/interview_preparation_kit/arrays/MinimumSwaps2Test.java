package com.hackerrank.armanmikayelovich.interview_preparation_kit.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumSwaps2Test {
    @Test
    public void tests() {
        int[] array1 = {4, 3, 1, 2};

        int[] array2 = {2, 3, 4, 1, 5};
        int[] array3 = {1, 3, 5, 2, 4, 6, 7};

        Assertions.assertEquals(3, MinimumSwaps2.minimumSwaps(array1));
        Assertions.assertEquals(3, MinimumSwaps2.minimumSwaps(array2));
        Assertions.assertEquals(3, MinimumSwaps2.minimumSwaps(array3));
    }

}
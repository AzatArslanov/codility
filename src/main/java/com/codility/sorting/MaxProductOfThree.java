package com.codility.sorting;

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);
        int max = A[0] * A[1] * A[A.length-1];

        boolean isNegative = false;
        int startIndex = A.length - 3;
        for (int i = startIndex; i < A.length; i++) {
            if (A[i] < 0) {
                isNegative = true;
            }
        }
        if (isNegative) {
            int tmp = A[0] * A[1] * A[2];
            if (tmp > max) {
                max = tmp;
            }
        }
        int tmp = A[startIndex] * A[startIndex + 1] * A[startIndex + 2];
        if (tmp > max) {
            max = tmp;
        }
        return max;
    }
}

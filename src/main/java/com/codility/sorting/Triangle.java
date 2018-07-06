package com.codility.sorting;

import java.util.Arrays;

public class Triangle {

    public int solution(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        Arrays.sort(A);
        int index = 0;
        while (A[index] < 0 && index < A.length-1) {
            index++;
        }
        for (int i = index; i < A.length - 2; i++) {
            long sum = A[i] + A[i + 1];
            if (sum > A[i + 2]) {
                return 1;
            }
        }
        return 0;
    }
}

package com.codility.sorting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProductOfThreeTest {

    @Test
    public void testOne() {
        int result = new MaxProductOfThree().solution(new int[]{-3, 1, 2, -2, 5, 6});
        Assert.assertEquals(60, result);
    }

    @Test
    public void testTwo() {
        int result = new MaxProductOfThree().solution(new int[]{-5, 5, -5, 4});
        Assert.assertEquals(125, result);
    }

}
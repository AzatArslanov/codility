package com.codility.sorting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void solutionPositive() {
        int result = new Triangle().solution(new int[]{10, 2, 5, 1, 8, 20});
        Assert.assertEquals(1, result);
    }

    @Test
    public void solutionNegative() {
        int result = new Triangle().solution(new int[]{-10, -5, 10, 50, 5, 1});
        Assert.assertEquals(0, result);
    }

    @Test
    public void solutionEmpty() {
        int result = new Triangle().solution(new int[]{});
        Assert.assertEquals(0, result);
    }

    @Test
    public void solutionThree() {
        int result = new Triangle().solution(new int[]{5, 8, 10});
        Assert.assertEquals(1, result);
    }

    @Test
    public void solutionExtremeNegative() {
        int result = new Triangle().solution(new int[]{-2, -2, -2});
        Assert.assertEquals(0, result);
    }
}
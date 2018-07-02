package com.codility.sorting;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DistinctTest {

    @Test
    public void solution() {
        int result = new Distinct().solution(new int[]{2, 1, 1, 2, 3, 1});
        Assert.assertEquals(3, result);
    }
}
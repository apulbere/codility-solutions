package com.apulbere.codility.lesson3.frogjump;

public class Solution {

    public int solution(int start, int end, int jumpLength) {
        int res = (end - start) / jumpLength;
        return res * jumpLength + start < end ? res + 1 : res;
    }
}

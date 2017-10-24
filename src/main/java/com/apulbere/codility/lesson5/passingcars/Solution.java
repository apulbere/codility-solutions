package com.apulbere.codility.lesson5.passingcars;

public class Solution {

    public int solution(int[] arr) {
        int incrementor = 0;
        int sum = 0;
        for(int val: arr) {
            if(val == 0) {
                incrementor++;
            } else {
                sum += incrementor;
            }
            if(sum > 1_000_000_000) {
                sum = -1;
                break;
            }
        }
        return sum;
    }
}

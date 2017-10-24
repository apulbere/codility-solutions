package com.apulbere.codility.lesson4.frogriverone;

import java.util.LinkedHashSet;

public class Solution {

    public int solution(int x, int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(arr.length);
        for (int i = 0, sum = sum(x), currentSum = 0; i < arr.length; i++) {
            if(set.add(arr[i])) {
                currentSum += arr[i];
            }
            if(currentSum == sum) {
                return i;
            }
        }
        return -1;
    }

    public int sum(int num){
        return (num * (num + 1)) / 2;
    }
}

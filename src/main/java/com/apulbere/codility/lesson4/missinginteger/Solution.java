package com.apulbere.codility.lesson4.missinginteger;

import static java.util.Arrays.sort;

public class Solution {

    public int solution(int[] arr) {
        sort(arr);
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if(isDistinct(i, arr) && arr[i] > 0) {
                if(count != arr[i]) {
                    break;
                }
                count++;
            }
        }
        return count;
    }

    private boolean isDistinct(int i, int[] arr) {
        if(i + 1 == arr.length) {
            return true;
        } else {
            return arr[i] != arr[i + 1];
        }
    }
}

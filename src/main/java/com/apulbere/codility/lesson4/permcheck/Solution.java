package com.apulbere.codility.lesson4.permcheck;

import java.util.TreeSet;

public class Solution {

    public int solution(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>();
        for(int i: arr) {
            if(!set.add(i)) {
                return 0;
            }
        }
        return set.first() == 1 && set.last() == set.size() ? 1 : 0;
    }
}

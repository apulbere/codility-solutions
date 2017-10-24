package com.apulbere.codility.lesson2.oddoccurences;

import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {

    public int solution(int[] arr) {
        Set<Integer> map = new LinkedHashSet<>(arr.length);

        for(int i: arr) {
            if(!map.remove(i)) {
                map.add(i);
            }
        }
        return map.iterator().next();
    }
}

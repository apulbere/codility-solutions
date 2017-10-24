package com.apulbere.codility.lesson3.permmissingelem;

import static java.util.Arrays.sort;

public class Solution {

    public int solution(int a[]) {
        if(a.length == 0) return 1;
        if(a.length == 1) return a[0] == 1 ? 2 : 1;

        sort(a);
        for (int i = 0, next = 1; i < a.length; i++) {
            if(a[i] != next) return next;
            if(i + 1 < a.length) {
                if(a[i] != a[i + 1]) next++;
            }
        }

        return a[a.length - 1] + 1;
    }
}
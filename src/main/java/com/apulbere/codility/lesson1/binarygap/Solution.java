package com.apulbere.codility.lesson1.binarygap;

import static java.lang.Integer.toBinaryString;
import static java.util.Arrays.stream;
import static java.util.Comparator.comparingInt;

public class Solution {

    public int solution(int n) {
        String binary = ("00" + toBinaryString(n) + "00").replaceAll("0*0$", "").replaceAll("^0*0", "");
        return stream(binary.split("1")).max(comparingInt(String::length)).orElse("").length();
    }
}

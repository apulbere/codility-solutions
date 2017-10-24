package com.apulbere.codility.lesson4.missinginteger

import spock.lang.Specification

class SolutionSpec extends Specification{
    def solution = new Solution()

    def "Find the smallest positive integer that does not occur in a given sequence"() {
        when: "given an array A of N integers"
        then: "return the smallest positive integer (greater than 0) that does not occur in A"
            solution.solution(intArray) == missing
        where:
        intArray                || missing
        [1,3,6,4,1,2] as int[]  || 5
        [1,3,4,8,9] as int[]    || 2
        [1] as int[]            || 2
        [-1,-2] as int[]        || 1
        [2,3] as int[]          || 1
        [101] as int[]          || 1
        [1,-1,1] as int[]       || 2
    }
}

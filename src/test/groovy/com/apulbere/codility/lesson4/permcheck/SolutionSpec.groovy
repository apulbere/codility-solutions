package com.apulbere.codility.lesson4.permcheck

import spock.lang.Specification

class SolutionSpec extends Specification {
    def solution = new Solution()

    def "Check whether array A is a permutation"() {
        when: "A non-empty zero-indexed array A consisting of N integers is given"
        then: "1 if array A is a permutation and 0 if it is not"
        solution.solution(intArray) == isPermutation
        where:
        intArray                        || isPermutation
        [4,1,3,2] as int[]              || 1
        [2,2] as int[]                  || 0
        [1,3] as int[]                  || 0
        [9,5,7,3,2,7,3,1,10,8] as int[] || 0
    }
}

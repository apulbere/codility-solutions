package com.apulbere.codility.lesson2.oddoccurences

import spock.lang.Specification

class SolutionSpec extends Specification {
    def solution = new Solution()

    def "Find value that occurs in odd number of elements"() {
        when: "a non-empty zero-indexed array is received"
        then: "return the value of the unpaired element"
            solution.solution(intArray) == element
        where:
        intArray                    || element
        [9,3,9,3,9,7,9] as int[]    || 7
        [9,3,9,3,9,7] as int[]      || 9
        [2,2,3,3,4] as int[]        || 4
        [1,2,1,0,1] as int[]        || 2
        [9,9,9,1] as int[]          || 9
        [42] as int[]               || 42

    }
}

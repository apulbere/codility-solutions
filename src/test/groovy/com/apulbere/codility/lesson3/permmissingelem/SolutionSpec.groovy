package com.apulbere.codility.lesson3.permmissingelem

import spock.lang.Specification

class SolutionSpec extends Specification {
    def solution = new Solution()

    def "Find the missing element in a given permutation"() {
        when: "given a zero-indexed array"
        then: "the value of the missing element"
            solution.solution(intArray) == missing
        where:
        intArray                || missing
        [2,3,1,5] as int[]      || 4
        [2] as int[]            || 1
        [2,3] as int[]          || 1
        [1,2,4] as int[]        || 3
        [] as int[]             || 1
        [1,2,3,4,4,6] as int[]  || 5
        [1] as int[]            || 2
        [1,1,2,2] as int[]      || 3
    }
}

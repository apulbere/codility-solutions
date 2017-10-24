package com.apulbere.codility.lesson4.frogriverone

import spock.lang.Specification


class SolutionSpec extends Specification {
    def solution = new Solution()

    def "Find the earliest time when a frog can jump to the other side of a river"() {
        when: "given a zero-indexed array and X"
        then: "find the earliest moment when all the positions from 1 to X are covered by leaves"
            solution.solution(x, intArray) == theMoment
        where:
        x | intArray                    || theMoment
        5 | [1,3,1,4,2,3,5,4] as int[]  || 6
        2 | [6] as int[]                || -1
        1 | [1] as int[]                || 0
        3 | [3,2,1] as int[]            || 2
        3 | [1,2,3] as int[]            || 2
    }
}

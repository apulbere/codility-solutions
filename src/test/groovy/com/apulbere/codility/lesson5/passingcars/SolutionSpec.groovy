package com.apulbere.codility.lesson5.passingcars

import spock.lang.Specification

class SolutionSpec extends Specification {
    def solution = new Solution()

    def "Count the number of passing cars on the road"() {
        when: "A non-empty zero-indexed array A consisting of N integers is given"
        then: "return the number of pairs of passing cars"
        solution.solution(intArray) == count
        where:
        intArray                || count
        [0,1,0,1,1] as int[]    || 5
    }
}

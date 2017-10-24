package com.apulbere.codility.lesson3.frogjump

import spock.lang.Specification

class SolutionSpec extends Specification {
    def solution = new Solution()

    def "Count minimal number of jumps from position X to Y"() {
        when: "three integers X, Y and D are received"
        then: "return the minimal number of jumps from position X to a position equal to or greater than Y."
            solution.solution(x, y, d) == minimalJumps
        where:
        x   | y     | d     || minimalJumps
        10  | 85    | 30    || 3
        1   | 2     | 1     || 1

    }
}

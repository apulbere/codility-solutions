package com.apulbere.codility.lesson5.minavgtwoslice

import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class SolutionTest extends FunSpec {

  describe("find the starting position of a slice whose average is minimal") {
    it("") {
      assert(Solution.solution(Array(4,2,2,5,1,5,8)) == 1)
    }
  }
}

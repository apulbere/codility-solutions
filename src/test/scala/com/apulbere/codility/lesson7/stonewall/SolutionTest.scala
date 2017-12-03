package com.apulbere.codility.lesson7.stonewall

import org.scalatest.{Matchers, PropSpec}
import org.scalatest.prop.TableDrivenPropertyChecks

class SolutionTest extends PropSpec with TableDrivenPropertyChecks with Matchers {
  val examples = Table(
    ("heights", "stones"),
    (Array(8, 8, 5, 7, 9, 8, 7, 4, 8), 7)
  )

  property("compute the minimum number of blocks needed to build the wall") {
    forAll(examples) { (heights, stones) =>
      Solution.solution(heights) should be(stones)
    }
  }
}

package com.apulbere.codility.lesson9.maxslicesum

import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.{Matchers, PropSpec}

class SolutionTest extends PropSpec with TableDrivenPropertyChecks with Matchers {

  val examples = Table(
    ("arr",                 "max"),
    (Array(3, 2, -6, 4, 0), 5),
    (Array(1, -1),          1),
    (Array(-1, 1),          1)
  )

  property("find the maximum sum of any slice of A") {
    forAll(examples) { (arr, max) =>
      Solution.solution(arr) should be(max)
    }
  }

}

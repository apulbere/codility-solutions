package com.apulbere.codility.lesson6.distinct

import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.{Matchers, PropSpec}

class SolutionTest extends PropSpec with  TableDrivenPropertyChecks with Matchers {
  val examples = Table(
    ("values", "count"),
    (Array(2, 1, 1, 2, 3, 1), 3),
    (Array.empty[Int], 0)
  )

  property("find the number of distinct values in array") {
    forAll(examples) { (values, count) =>
      Solution.solution(values) should be (count)
    }
  }

}

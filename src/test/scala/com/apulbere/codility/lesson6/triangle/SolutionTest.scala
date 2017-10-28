package com.apulbere.codility.lesson6.triangle

import org.scalatest.{Matchers, PropSpec}
import org.scalatest.prop.TableDrivenPropertyChecks

class SolutionTest extends PropSpec with  TableDrivenPropertyChecks with Matchers {
  val examples = Table(
    ("values", "triangle"),
    (Array(10, 2, 5, 1, 8, 20), 1),
    (Array(10, 50, 5, 1), 0),
    (Array(Int.MaxValue, Int.MaxValue, Int.MaxValue), 1),
    (Array.empty[Int], 0)
  )

  property("check if array contains a triangle") {
    forAll(examples) { (values, triangle) =>
      Solution.solution(values) should be(triangle)
    }
  }

}

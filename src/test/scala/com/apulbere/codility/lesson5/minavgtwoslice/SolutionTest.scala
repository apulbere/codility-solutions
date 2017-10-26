package com.apulbere.codility.lesson5.minavgtwoslice

import org.scalatest.{Matchers, PropSpec}
import org.scalatest.prop.TableDrivenPropertyChecks

class SolutionTest extends PropSpec with TableDrivenPropertyChecks with Matchers {
  val examples = Table(
    ("values", "position"),
    (Array(4, 2, 2, 5, 1, 5, 8),  1)
  )

  property("find the starting position of a slice whose average is minimal") {
    forAll(examples) { (values, position) =>
      Solution.solution(values) should be (position)
    }
  }
}

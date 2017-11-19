package com.apulbere.codility.lesson7.brackets

import org.scalatest.{Matchers, PropSpec}
import org.scalatest.prop.TableDrivenPropertyChecks


class SolutionTest extends PropSpec with TableDrivenPropertyChecks with Matchers {
  val examples = Table(
    ("givenString", "properlyNested"),
    ("{[()()]}", 1),
    ("([)()]", 0),
    ("", 1),
    (")(", 0),
    ("{{{", 0)
  )

  property("check if string is properly nested") {
    forAll(examples) { (givenString, properlyNested) =>
      Solution.solution(givenString) should be(properlyNested)
    }
  }
}

package com.apulbere.codility.lesson6.numberofdiscintersections

import org.scalatest.{Matchers, PropSpec}
import org.scalatest.prop.TableDrivenPropertyChecks


class SolutionTest extends PropSpec with TableDrivenPropertyChecks with Matchers {
  val examples = Table(
    ("radiuses", "intersections"),
    (Array(1, 5, 2, 1, 4, 0), 11)
  )

  property("compute the number of intersections in a sequence of discs") {
    forAll(examples) { (radiuses, intersections) =>
      Solution.solution(radiuses) should be(intersections)
    }
  }

}

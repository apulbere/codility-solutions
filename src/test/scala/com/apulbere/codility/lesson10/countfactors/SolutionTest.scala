package com.apulbere.codility.lesson10.countfactors

import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.{Matchers, PropSpec}

class SolutionTest extends PropSpec with TableDrivenPropertyChecks with Matchers {
  val examples = Table(
    ("n", "count"),
    (24, 8),
    (41, 2),
    (16, 5)
  )

  property("count factors of given number n") {
    forAll(examples) { (n, count) =>
      Solution.solution(n) should be(count)
    }
  }

}

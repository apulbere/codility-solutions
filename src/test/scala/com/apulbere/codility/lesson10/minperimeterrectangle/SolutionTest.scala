package com.apulbere.codility.lesson10.minperimeterrectangle

import org.scalatest.{Matchers, PropSpec}
import org.scalatest.prop.TableDrivenPropertyChecks

class SolutionTest extends PropSpec with TableDrivenPropertyChecks with Matchers {
  val examples = Table(
    ("n", "perimeter"),
    (  1, 4),
    (  2, 6),
    (  3, 8),
    (  4, 8),
    ( 10, 14),
    ( 24, 20),
    ( 25, 20),
    ( 30, 22),
    ( 36, 24),
    ( 56, 30),
    (100, 40)
  )

  property("find the minimal perimeter of any rectangle whose area equals N") {
    forAll(examples) { (n, perimeter) =>
      Solution.solution(n) should be(perimeter)
    }
  }

}

package com.apulbere.codility.lesson9.maxprofit

import org.scalatest.{Matchers, PropSpec}
import org.scalatest.prop.TableDrivenPropertyChecks

class SolutionTest extends PropSpec with TableDrivenPropertyChecks with Matchers {
  val examples = Table(
    ("prices", "profit"),
    (Array(23171, 21011, 21123, 21366, 21013, 21367), 356),
    (Array(23171), 0),
    (Array.empty[Int], 0)
  )

  property("compute the maximum possible earning") {
    forAll(examples) { (prices, profit) =>
      Solution.solution(prices) should be(profit)
    }
  }
}

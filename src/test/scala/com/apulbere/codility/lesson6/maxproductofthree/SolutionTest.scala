package com.apulbere.codility.lesson6.maxproductofthree

import org.scalatest.{Matchers, PropSpec}
import org.scalatest.prop.TableDrivenPropertyChecks


class SolutionTest extends PropSpec with  TableDrivenPropertyChecks with Matchers {
  val examples = Table(
    ("values", "product"),
    (Array(-3, 1, 2, -2, 5, 6), 60),
    (Array(-6, -5, -5, 1, 2, 3), 90),
    (Array(-1, -2, -3), -6),
    (Array(-10, -2, -4), -80)
  )

  property("find the maximal product of any triplet") {
    forAll(examples) { (values, product) =>
      Solution.solution(values) should be(product)
    }
  }
}

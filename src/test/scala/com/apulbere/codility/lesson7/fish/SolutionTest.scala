package com.apulbere.codility.lesson7.fish

import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.{Matchers, PropSpec}

class SolutionTest extends PropSpec with TableDrivenPropertyChecks with Matchers {
  val examples = Table(
    ("fish", "direction", "aliveFish"),
    (Array(4, 3, 2, 1, 5), Array(0, 1, 0, 0, 0), 2),
    (Array(4, 3, 2, 9), Array(1, 0, 0, 0), 1)
  )

  property("check the number of fish that are alive alive") {
    forAll(examples) { (fish, direction, aliveFish) =>
      Solution.solution(fish, direction) should be(aliveFish)
    }
  }
}

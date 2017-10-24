package com.apulbere.codility.lesson5.genomicrangequery

import com.apulbere.codility.lesson5.genomicrangequery.Solution.solution
import org.junit.runner.RunWith
import org.scalatest._
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class SolutionTest extends FunSpec {

  describe("Find the minimal nucleotide from a range of sequence DNA") {
    it("returns an array consisting of M integers specifying the consecutive answers to all queries") {
      assert(solution("CAGCCTA", Array(2, 5, 0), Array(4, 5, 6)).sameElements(Array(2, 4, 1)))
    }
  }

}

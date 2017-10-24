package com.apulbere.codility.lesson5.genomicrangequery

object Solution {

  def solution(s: String, p: Array[Int], q: Array[Int]): Array[Int] = {
    val genoms = List(
      new Genom('A', 1, s.length),
      new Genom('C', 2, s.length),
      new Genom('G', 3, s.length)
    )
    val maximumImpact = 4

    for(i <- 0 until s.length) {
      genoms foreach { genom => genom.calculateForIndex(i, s.charAt(i)) }
    }

    val result = Array.ofDim[Int](p.length)
    for(i <- 0 until p.length) {
      result(i) = genoms find { genom => genom.isBetween(p(i), q(i)) } match {
        case None => maximumImpact
        case Some(genom) => genom.impact
      }
    }
    result

  }
}

class Genom(val value: Char, val impact: Int, val genomSize: Int) {
  val genom = Array.ofDim[Int](genomSize + 1)

  def calculateForIndex(index: Int, char: Char): Unit = {
    genom(index + 1) = genom(index) + (if (char == value) 1 else 0)
  }

  def isBetween(from: Int, to: Int): Boolean = {
    genom(to + 1) - genom(from) > 0
  }
}

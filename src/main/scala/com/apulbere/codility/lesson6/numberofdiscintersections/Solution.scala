package com.apulbere.codility.lesson6.numberofdiscintersections


object Solution {

  def solution(radiuses: Array[Int]): Int = {
    val startCounts = new Array[Int](radiuses.length)
    val endCounts = new Array[Int](radiuses.length)

    val last = radiuses.length - 1
    for((radius, i) <- radiuses.zipWithIndex) {
      val start = if (i > radius) i - radius else 0
      val end = if (last - i > radius) i + radius else last
      startCounts(start) += 1
      endCounts(end) += 1
    }

    var activeDiscs = 0
    var intersectionCount = 0
    for((start, end) <- startCounts zip endCounts) {
      if(start > 0) {
        val currentIntersectionCount = activeDiscs * start
        intersectionCount += currentIntersectionCount + start * (start - 1) / 2
        if(10000000 < intersectionCount) return -1
        activeDiscs += start
      }
      activeDiscs -= end
    }
    intersectionCount
  }
}
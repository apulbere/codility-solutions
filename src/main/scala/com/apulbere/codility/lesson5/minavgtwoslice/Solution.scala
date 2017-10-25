package com.apulbere.codility.lesson5.minavgtwoslice

object Solution {

  def solution(values: Array[Int]): Int = {
    var minAvg = 10000.toDouble
    var minPosition = 0

    def avgWithMin(from: Int, sub: Int*): Unit = {
      val avg = (sub.sum + values(from)) / (sub.length + 1.0)
      if(avg < minAvg) {
        minAvg = avg
        minPosition = from
      }
    }

    for(i <- 0 until values.length - 2) {
      avgWithMin(i, values(i + 1))
      avgWithMin(i, values(i + 1), values(i + 2))
    }
    avgWithMin(values.length - 2, values(values.length - 1))

    minPosition
  }
}

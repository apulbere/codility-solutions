package com.apulbere.codility.lesson9.maxslicesum

object Solution {

  def solution(arr: Array[Int]): Int = {
    arr.drop(1).foldLeft((arr(0), arr(0)))(maxPair)._2
  }

  def maxPair(maxPair: (Int, Int), i: Int): (Int, Int) = {
    val maxEnd = math.max(i, maxPair._1 + i)
    val max = math.max(maxEnd, maxPair._2)
    (maxEnd, max)
  }

}

package com.apulbere.codility.lesson6.maxproductofthree


object Solution {
  val MAX = 1000
  val MIN = -MAX

  def solution(intArray: Array[Int]): Int = {
    val maxes = Array.fill(3)(MIN)
    val mins = Array.fill(2)(MAX)

    val compareMax = (a: Int, b: Int) => a >= b
    val compareMin = (a: Int, b: Int) => a <= b

    for(value <- intArray) {
      shiftValues(value, maxes, compareMax)
      shiftValues(value, mins, compareMin)
    }

    Math.max(maxes.product, mins.product * maxes(2))
  }

  def shiftValues(value: Int, productValues: Array[Int], comparator: (Int, Int) => Boolean): Unit = {
    for(i <- (productValues.length - 1) to 0 by -1) {
      if(comparator.apply(value, productValues(i))) {
        for(j <- 0 until i)
          productValues(j) = productValues(j + 1)
        productValues(i) = value
        return
      }
    }
  }
}
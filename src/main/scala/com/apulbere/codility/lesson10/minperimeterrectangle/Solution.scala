package com.apulbere.codility.lesson10.minperimeterrectangle

object Solution {

  def solution(n: Int): Int = {
    val sqrtN = Math.sqrt(n).toInt
    if(sqrtN * sqrtN != n) {
      (1 to sqrtN + 1) //round up for any non-perfect squares
        .filter(n % _ == 0)
        .map(i => 2 * (n / i + i)) //calculate 2nd factor by simple division since know 1st factor and N
        .min
    } else {
      //perfect square root won't be reached inside loop so calculate and set min perimeter
      2 * (sqrtN + sqrtN)
    }
  }

}

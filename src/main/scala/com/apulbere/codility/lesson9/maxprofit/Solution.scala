package com.apulbere.codility.lesson9.maxprofit

import java.lang.Math.{max, min}

object Solution {

  def solution(prices: Array[Int]): Int = {
    prices.foldLeft((prices.headOption.getOrElse(0), 0)) { (tuple, price) =>
      (min(tuple._1, price), max(tuple._2, price - tuple._1))
    }._2
  }
}

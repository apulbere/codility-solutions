package com.apulbere.codility.lesson6.distinct

import scala.util.Sorting.quickSort

object Solution {

  def solution(values: Array[Int]): Int = {
    values.isEmpty match {
      case true => 0
      case _ => {
          quickSort(values)
          1 + (for (i <- 0 until values.length - 1 if (values(i) != values(i + 1))) yield 1).sum
      }
    }
  }

}

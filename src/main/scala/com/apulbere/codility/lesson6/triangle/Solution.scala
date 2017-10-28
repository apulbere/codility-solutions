package com.apulbere.codility.lesson6.triangle

import scala.util.Sorting.quickSort

object Solution {

  def solution(intArray: Array[Int]): Int = {
    intArray.length match {
      case 0 | 1 | 2 => 0
      case _ => {
        quickSort(intArray)
        intArray.sliding(3) find( sub => sub(0) > sub(2) - sub(1) ) match {
          case None => 0
          case _ => 1
        }
      }
    }
  }
}

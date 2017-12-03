package com.apulbere.codility.lesson7.stonewall

import scala.collection.mutable.Stack

object Solution {

  def solution(heights: Array[Int]): Int = {
    val theWall = Stack[Int]()
    var count = 0

    for(height <- heights) {
      while (!theWall.isEmpty && theWall.top >= height) {
        if (theWall.top > height) count += 1
        theWall.pop
      }
      theWall.push(height)
    }
    count += theWall.length
    count
  }
}

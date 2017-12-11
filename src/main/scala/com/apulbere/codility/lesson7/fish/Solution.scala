package com.apulbere.codility.lesson7.fish

import scala.collection.mutable.Stack

object Solution {

  def solution(fish: Array[Int], direction: Array[Int]): Int = {
    val aliveFish = Stack[Fish]()

    for((size, direction) <- fish zip direction) {
      val currentFish = new Fish(size, direction)

      if (aliveFish.isEmpty) {
        aliveFish push currentFish
      } else {
        while (aliveFish.nonEmpty
              && currentFish.direction - aliveFish.top.direction == -1
              && currentFish.canEat(aliveFish.top)
        ) aliveFish.pop

        if (aliveFish.nonEmpty) {
          if(currentFish.direction - aliveFish.top.direction != -1) aliveFish push currentFish
        } else {
          aliveFish push currentFish
        }

      }
    }
    aliveFish length
  }

  class Fish(val size: Int, val direction: Int) {
    def canEat(fish: Fish) = size > fish.size
  }
}

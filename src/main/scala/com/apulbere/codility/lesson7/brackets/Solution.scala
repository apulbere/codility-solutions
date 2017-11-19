package com.apulbere.codility.lesson7.brackets

import scala.collection.mutable.Stack

object Solution {
  val bracketMap = Map('}' -> '{', ')' -> '(', ']' -> '[')

  def solution(bracketString: String): Int = {
    val bracketStack = Stack[Char]()

    for(bracket <- bracketString) {
      val openingBracket = bracketMap.getOrElse(bracket, null)
      if(openingBracket == null) {
        bracketStack.push(bracket)
      } else {
        if(bracketStack.isEmpty || openingBracket != bracketStack.pop())
          return 0
      }
    }
    if(bracketStack.isEmpty) 1 else 0
  }
}

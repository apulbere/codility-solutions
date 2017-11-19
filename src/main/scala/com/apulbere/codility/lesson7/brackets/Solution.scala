package com.apulbere.codility.lesson7.brackets

import scala.collection.mutable.Stack

object Solution {
  val bracketMap = Map('}' -> '{', ')' -> '(', ']' -> '[')

  def solution(bracketString: String): Int = {
    val bracketStack = Stack[Char]()

    for(bracket <- bracketString) {
      bracketMap.get(bracket) match {
        case Some(openingBracket) => {
          if(bracketStack.isEmpty || openingBracket != bracketStack.pop())
            return 0
        }
        case None => bracketStack.push(bracket)
      }
    }
    if(bracketStack.isEmpty) 1 else 0
  }
}

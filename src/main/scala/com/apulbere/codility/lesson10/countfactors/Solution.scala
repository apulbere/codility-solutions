package com.apulbere.codility.lesson10.countfactors

object Solution {
  def solution(n: Int): Int = {
    val nn = Math.sqrt(n)
    Iterator.from(1).takeWhile(_ <= nn).map(check(_, n)).sum
  }

  def check(i: Int, n: Int): Int = {
    val ii = i * i
    if(n % i == 0 && ii != n)
      2
    else if(ii == n)
      1
    else
      0
  }
}

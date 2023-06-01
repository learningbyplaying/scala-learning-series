package com.lbp

object Basics extends App {
  val meaningOfLife: Int = 42

  //meaningOfLife = 43
  val aBoolean = false
  val aString = "I love Scala!"

  val aComposedString = "I" + "Other string"

  val anInterpolatedString = s"The meaning $meaningOfLife"

  // expressions
  val anExpression = 2 + 3

  val ifExpression = if(meaningOfLife > 43) 56 else 99

  val chainedIfExpression = {
    if (meaningOfLife > 41) 56
    else if (meaningOfLife < 0) -2
    else if (meaningOfLife > 98) 78
    else 0
  }
  println(meaningOfLife,chainedIfExpression)

  val aCodeBlock = {

    val aLocalValue = 67
    aLocalValue + 1
  }

  println(aCodeBlock)

  def myFunction(x:Int, y:String): String = {
    y + " " + x
  }

  println(myFunction(1,"test"))

  def factorial(n: Int): Int = {
    if (n <=1) 1
    else n * factorial(n-1)
  }

  println( factorial(3) )


  def myUnitReturningFunction(): = {
    print("Test 2")
  }
}

package com.lbp

object FunctionalProgramming extends App {

  class Person(name: String) {
    def apply(age: Int) =
      println(s"I have aged $age years")
  }

  val bob = new Person("Bob")
  bob.apply(43)
  bob(45)


  val simpleIncrementer = new Function1[Int,Int]{
    override def apply(arg: Int): Int = arg + 1
  }

  val a = simpleIncrementer.apply(23)
  val b = simpleIncrementer(23)

  println(a,b)

  val simpleConcatenator = new Function2[String, String, String] {
    override def apply(arg1: String, arg2: String): String =
      arg1 + arg2
  }

  val c = simpleConcatenator("I love"," Scala")
  print(c ,"\n")

  val simpleConcatenator2 = new Function3[String, String, String, String] {
    override def apply(arg1: String, arg2: String, arg3: String): String =
      arg1 + arg2 + arg3
  }

  val d = simpleConcatenator2("I love", " Scala", "!!!")
  //print("\n",d,"\n")

  print("--",d,"--")
  println("--",d,"--")

  val doubled: Function1[Int, Int] = (x: Int) => 2 * x

  val e = doubled(3)
  println(e,"\n")

  val doubled2: Int => Int = (x: Int) => 2 * x

  val f = doubled2(3)
  println(f, "\n")

  val aMappedList: List[Int] = List(1,2,3).map(x => x + 1)
  println(aMappedList)

  val inputList = List(1,2,3)
  val aFlatMappedList = inputList.flatMap(x => List(x,2*x))
  val aFlatMappedList2 = inputList.map(x => List(x,2*x))

  println(inputList,aFlatMappedList, aFlatMappedList2)

  val aFlatMappedList3 = inputList.flatMap {
    x => List(x,2*x)
  }

  println(aFlatMappedList3)

  val aFilteredList = inputList.filter (x => x <= 2)
  val aFilteredList2 = inputList.filter (_ <= 2)

  println(aFilteredList, aFilteredList2)

  val allPairs =
    inputList
      .flatMap(number => List('a','b','c')
        .map(letter => s"$number-$letter"))

  print(allPairs)


  val alternativePairs = for {
    number <- List(1,2,3)
    letter <- List('a','b','c')
    test <- List('0','1')
  } yield s"$number-$letter-$test"

  println("")
  println(alternativePairs)


  /**
   * Collections
   */

  val aList = List(1,2,3,4,5)
  val firstElement = aList.head
  val rest = aList.tail
  val aPrependedList = 0 :: aList
  val anExtendedList = 0 +: aList :+ 6

  println(aList, firstElement, rest)

  println(aList, aPrependedList, anExtendedList)

  val aSequence: Seq[Int] = Seq(1,2,3)

  println(aSequence)

  val accessedElement = aSequence(0)
  println(accessedElement)

  val aVector = Vector(1,2,3,4,5)
  println(aVector)

  // sets no duplicates
  val aSet = Set(1, 2, 3, 4, 5, 2)
  println(aSet, aSet.contains(7))

  // ranges
  val aRange = 1 to 1000
  val twoByTwo = aRange.map(x => 2 * x).toList

  println(aRange, twoByTwo)

  // tuples
  val aTuple = ("Bon Jovi","Rock",1982)
  println(aTuple._1)

  //maps
  val aPhonebook: Map[String, Int] =
    Map( ("Daniel",66), "Jane" -> 7 )

  println(aPhonebook)
}

package com.lbp

object Contextual {

    val aList =  List(2,1,3,4)

    val anOrderedList = aList.sorted

    //given descendingOrdering: Ordering[Int] = Ordering.fromLessThan(_ > _)
    val descendingOrdering: Ordering[Int] = Ordering.fromLessThan(_ > _)


    trait Combinator[A] {
      def combine(x: A, y: A): A
    }

    def combineAll[A](list: List[A])(using combinator: Combinator[A]): A =
      list.reduce( (a,b) => combinator.combine(a,b))
  
    def main(args: Array[String]): Unit = {
      println(aList)
      println(anOrderedList)
      println(descendingOrdering)
    }
}

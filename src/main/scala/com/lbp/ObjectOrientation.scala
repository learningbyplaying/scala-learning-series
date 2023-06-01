package com.lbp

object ObjectOrientation extends App {

    class Animal {
      val age: Int = 0

      def eat() = println("I'm eating")
    }
    val anAnimal = new Animal

    class Dog(val name: String) extends Animal{

    }

    val aDog = new Dog(name = "Lassie")

    val aDog2 = new Dog("Chuli")

    println(aDog.name, aDog2.name)

    val aDeclaredAnimal: Animal = new Dog("Hachi")

    aDeclaredAnimal.eat()


    abstract class WalkingAnimal {
      val hasLegs = true
      def walk(): Unit
    }


  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  trait Philosopher {
    def ?!(thought: String): Unit
  }

  class Crocodile extends Animal
    with Carnivore
    with Philosopher {
    override def eat(animal: Animal): Unit =
      print("I am eating you\n")
    override def ?!(thought: String): Unit =
      print("I was thinking\n")
  }


  val aCroc = new Crocodile

  aCroc.eat(aDog)
  aCroc eat aDog
  aCroc ?! "What if we could fly?"

  val basicMath = 1+2
  val anotherBasicMath = 1. + (2)

  print(basicMath , anotherBasicMath)


  val dinosaur = new Carnivore {
    override def eat(animal: Animal): Unit =
      println("I am a dinosaur")
  }

  dinosaur.eat(aDog)


  object MySingleton {
    val mySpecialValue = 53278
    def mySpecialMethod():Int = 5327
    def apply(x: Int): Int = x + 1
  }

  MySingleton.mySpecialMethod()
  val a = MySingleton.apply(1)
  val b = MySingleton(1)
  val c = MySingleton.mySpecialMethod()
  print(a,b,c)


}

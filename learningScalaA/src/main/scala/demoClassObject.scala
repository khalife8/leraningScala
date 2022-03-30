// Simple Class and Object demo
// Method with side effect

// access level in scala -
  // public-can access anywhere (By Default),
  // private-can access only in the class it is defined,
  // protected- can access in class it is defined as well as in subclass extending the given class using inheritence (discuss in detail when we study inheritence)

class Car{
  var topClassExtraCost = 0
  private var roadTax = 100

  def cost(basicCost:Int)= basicCost + topClassExtraCost + roadTax

  def checkTax()={
    roadTax = 10 // Unintentional. Done by Mistake
    roadTax
  }

  def printTax = roadTax
}

object demoClassObject {

  def main(args: Array[String]): Unit = {
    println("Hello abc")

    var bmw = new Car
    bmw.topClassExtraCost = 500

//    println("Road Tax is " + bmw.checkTax())

    println("Road Tax is " + bmw.printTax)

    var result = bmw.cost(10000)
    println("Total cost of car is " + result)

  }
}

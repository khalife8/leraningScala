class DemoClass{
  val x = 3 // var <- can change to value of variable, val<- can not change
  val y = 2

  def addNumber() = {
    x + y
  }
  println(s"x = ${x} and y = ${y}")

  val z = addNumber()
  println(s"z = ${z}")
}

object constructorDemo {


  def main(args: Array[String]): Unit = {

    println("Hello  world")

    val demoobject1 = new DemoClass // Creating a object - instance of class - Constructor: Will execute every thing in class
  }

}

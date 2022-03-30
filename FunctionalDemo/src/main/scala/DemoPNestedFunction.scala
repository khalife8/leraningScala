object DemoPNestedFunction {

  def main(args: Array[String]): Unit = {
    val printHello = (msg: String) => println("Hello " + msg)

    printHello("World")
    printHello("India")

  }

  //def printHello(msg: String): Unit ={
    //println("Hello " + msg)
  //}
}

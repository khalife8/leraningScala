object DemoSCarryingFunction {

  def main(args: Array[String]): Unit = {
    val str1 = "Hello"
    val str2 = "World"

    println("str1, str2 : " + printSomething(str1) (str2))
  }
  //def printSomething(str: String) (str1: String): String ={
    //str + " " + str1
  //}

  def printSomething (str1:String)=(str2:String) => str1 + " " + str2

}

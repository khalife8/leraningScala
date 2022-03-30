class CompagnonClass{
  var x = 5

  def getValues()={
    println(s"value of x is: ${x} and value of y is: ${CompagnonDemo.y}")
  }
}


object CompagnonDemo {
  var y = 2.2
  def main(args: Array[String]): Unit = {
    val objectForCompanionDemoClass = new CompagnonClass()
    println(s"Value of x when retrieved from companion object is ${objectForCompanionDemoClass.x}")
    println(s"Value of y when retrieved from companion object is ${y}")

    objectForCompanionDemoClass.getValues()
  }

}

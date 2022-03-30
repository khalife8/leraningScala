// Program 2: Singleton object
object DemoObjectA{ //1st Note: Instead of class, this is object
  val x = 2
  val y = 5.5

  def addValues() = x + y

  println(s"x = ${x} , y = ${y}")


}
object SingletonDemoA {
  def main(args: Array[String]): Unit = {
    //    val demoObjectB1 = new DemoObjectB //2nd Note: IF you uncomment it, it will give error, as can not create object from a object
    println(DemoObjectA.x, DemoObjectA.y) //3rd Note: Access variable as objectName.variableName

    val a = DemoObjectA.addValues() //4th Note: Access method/function as objectName.method
    println(a)

  }
}

// Program 1

class DemoClass(a: Int, b: Double){
  val x = a
  val y = b

  def addValues() = x + y

  println(s"x = ${x} , y = ${y}")


}

object SingletonDemo {

  def main(args: Array[String]): Unit = {
    var demoobject = new DemoClass(5,7.7)
    println(demoobject.x, demoobject.y)
    var result = demoobject.addValues()
    println(result)

    var demoobject1 = new DemoClass(3,2.2)
    println(demoobject1.x, demoobject1.y)
    result = demoobject1.addValues()
    println(result)

    var demoobject2 = new DemoClass(5,7.7)
    println(demoobject2.x, demoobject2.y)
    result = demoobject2.addValues()
    println(result)

    println(demoobject1)
  }

}

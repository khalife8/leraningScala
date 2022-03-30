// Program no 4: Auxiliary constructors

class demoClass3(val a:Int, val b:Double, val c:String){
  val x = a
  var y = b
  val z = c

  println(s"Primary constructor says: x = ${x} and y = ${y} and z = ${z}")

  def addNumber() = {
    x + y
  }
  def this(){
    this(99,88.88,"Hello Scala")
    println("I came into Auxiliary constructor with 0 paramters")
  }
  def this(a:Int){
    this(a,88.88,"Hello Scala")
    println("I came into Auxiliary constructor with 1 paramters")
  }

  def this(a:Int, b:Double){
    this(a,b,"Hello Scala")
    println("I came into Auxiliary constructor with 2 paramters")
  }

  def this(c:String){
    this(6,66.66,c)
    println("I came into Auxiliary constructor with 1 paramter that was c:String")
  }


}


object constructorDemo3 {
  def main(args: Array[String]): Unit = {
    val demoObject1 = new demoClass3(5,7.2,"Hello World!")
    val demoObject2 = new demoClass3()
    val demoObject3 = new demoClass3(7)
    val demoObject4 = new demoClass3(7,2.2)
    val demoObject5 = new demoClass3("Hello Java")

    val demoObject6 = new demoClass3(a=5,b=7.2,c="Hello World!")
  }
}
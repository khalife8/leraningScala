// Program no 3: Default parameters in constructor (Primary constructor)

class demoClass2(val a:Int = 99, val b:Double = 88.88, val c:String = "Hello Scala"){
  val x = a
  var y = b
  val z = c

  def addNumber() = {
    x + y
  }

  println(s"x = ${x} and y = ${y} and z = ${z}")
}


object constructorDemo2 {
  def main(args: Array[String]): Unit = {
    val demoObject1 = new demoClass2(5,7.2,"Hello World!")
    val demoObject2 = new demoClass2()
    val demoObject3 = new demoClass2(25)
    //    val demoObject4 = new demoClass2("Hello") - You need to pass parameter in correct sequence, for out of sequence see next example
    val demoObject5 = new demoClass2(c = "Hello")
    val demoObject6 = new demoClass2(c = "Hello", a = 5, b = 6.6)
    //val demoObject7 = new demoClass2( , , "hello") - can not do
    //val demoObject8 = new demoClass2( a,b , "hello") - can not do, it does not know what is a and b simply, can be done as below
    val demoObject9 = new demoClass2( a=5,b=5.5 , "hello")
  }
}
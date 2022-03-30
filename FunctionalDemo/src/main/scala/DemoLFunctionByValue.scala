object DemoLFunctionByValue {

  def main(args: Array[String]): Unit = {

    println("Main function : " + exec(time()))
  }
  def time(): Long ={
    println("Inside time function")
    return System.nanoTime()
  }
  def exec(t:Long): Long ={
    println("Entering exec function")
    println("time", + t)
    println("exiting from time function")
    t
  }
  // Points to remember
  //1. It will first execute the inside function "time()" and then execute the outside
  // function "exec(13567213222800)"
  //2. Since inside function "time()" got executed first, it calls outside function "exec(13567213222800)"
  // using the value 13567213222800, it is called as "Function by Value"

}

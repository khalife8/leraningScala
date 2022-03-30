object DemoMFunctionByName {

  def main(args: Array[String]): Unit = {

    println("Main function : " + exec(time(), time2()))
  }
  def time(): Long ={
    println("Inside time function")
    return System.nanoTime()
  }
  def time2(): Long ={
    println("Inside time function")
    return System.currentTimeMillis()
  }
  def exec(t: => Long, u: => Long): (Long, Long) ={
    println("Entering exec function")
    println("time", + t)
    println("time2", + u)
    println("exiting from time function")
    (t, u)
  }

  // Points to remember
  //1. It will first execute the OUTSIDE function "exec()" and then execute the INSIDE
  // function "time()" every time t is being referred.
  //2. Since OUTSIDE function "exec()" got executed first, it calls INSIDE function "time()"
  // using the REFERENCED VATIABLE t, it is called as "Function by Name"
}

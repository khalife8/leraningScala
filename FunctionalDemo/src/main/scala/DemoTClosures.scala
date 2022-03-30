// Closures: Variables are defined outside function definition

object DemoTClosures {

  def main(args: Array[String]): Unit = {
    println(multiplier(5))
  }

  var factor = 10
  var multiplier = (x:Int) => x * factor
  // if variable (eg: factor) is defined outside the function body, it is called as Closure

  //var multiplier = (x:Int, factor: Int) => x * factor

  // if variable used inside function body (eg factor) is niether a input parameter
  // nor defined inside function body

  // Note: Below function is not a closure, because factor1 is defined inside the function body
  //def multiplier(x: Int): Int ={
    //x * 10
  //}
}

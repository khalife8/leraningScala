object DemoRNestedFunctions {

  def main(args: Array[String]): Unit = {
    println(factorial(5))
    println(factorial(3))
    println(factorial(0))
  }

  def factorial(x: Int): Int ={
    def fact(n: Int, prevResult: Int): Int ={
      if(n <= 1){
        prevResult
      } else {
        fact(n-1, n * prevResult)
      }
    }
    var z = fact(x, 1)
    z
  }
}

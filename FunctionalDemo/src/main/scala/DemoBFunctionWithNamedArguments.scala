// Functions with Named Arguments

object DemoBFunctionWithNamedArguments {
  def sum(x:Int, y:Int):Int = {
    println("Value of x is " +  x)
    println("Value of y is " +  y)
    return (x + y)

  }

  def main(args: Array[String]): Unit = {
    var z = sum(x = 2, y = 3)
    println(z)
  }
}

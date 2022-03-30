//Read from command line scala.io._

object DemoACommandLine {

  def main(args: Array[String]): Unit = {
    println("Enter your name :")
    var name = scala.io.StdIn.readLine()
    println("Hello " + name)

    println("Enter your phone number :")
    var number = scala.io.StdIn.readLine()
    println("your phone number is " + number)

    println("Hello " + name + ", What is your age ?")
    var age = Console.readLine()
    println("Age is " + age)

    }
}

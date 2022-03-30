import DemoTrySuccessFailure.errorHandlingFunction

import scala.util.control.Exception.catching
object DemoCatching {


  def main(args: Array[String]): Unit = {

    val catchException = catching(classOf[ArithmeticException], classOf[ArrayIndexOutOfBoundsException]).withApply(e => println("Arithmetic exception has occured" + e))
    //val catchException = catching(classOf[ArithmeticException], classOf[ArrayIndexOutOfBoundsException]).withApply(e => errorHandlingFunction(e))
    // above line will call error HandlingFunction from DemoBTrySuccessFailure.scala
    val a = catchException(10/0)
    if(a != ()) {
      println(a)
    }

  }
}

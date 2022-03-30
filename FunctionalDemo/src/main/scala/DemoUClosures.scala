// Even Number or Odd Number
// print Event or Print Odd

object DemoUClosures {

  def main(args: Array[String]): Unit = {
    println(evenOrOdd(isEvent,2))
    println(evenOrOdd(isEvent,3))
    println(evenOrOdd(isEvent,4))
    println(evenOrOdd(isEvent,5))
    println(evenOrOdd(isEvent,6))
  }

  def evenOrOdd(f:Int =>Boolean, x:Int): String ={
    var evenFlag = f(x)
    if(evenFlag){
      "Even Number " + x
    } else {
      "Odd Number " + x
    }
  }


  var div = 2
  var isEvent = (x:Int) => x%div==0

  //var isEvent:(Int) => Boolean = (x) => x%2==0 // If you want to specify return type

  //def isEvent(x : Int): Boolean ={ //Traditional Function Definition
    //x%2==0
  //}
}

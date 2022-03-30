// To Demonstrate Functions

object helloWorld {

  def main(args: Array[String]): Unit = {
    println("Hello World!")
// To comment multiple lines of code, select those lines using mouse and then press" CTRL + /"
//    var result = add(2,5)
//    println("Addition of 2 and 5 is: " + result)

//    var result = addA(2,5)
//    println("Addition of 2 and 5 is: " + result)

//    var result = addB(2,5)
//    println("Addition of 2 and 5 is: " + result)

//    var result = addC(2,5)
//    println("Addition of 2 and 5 is: " + result)

    var result = addD(2,5)
    println("Addition of 2 and 5 is: " + result)
  }

  def add (x:Int, y:Int): Int = {
    var z = x + y
    return z
  }

  def addA (x:Int, y:Int): Int = {
    var z = x + y
    z                                             // Not mandatory to specify return keyword
  }

  def addB (x:Int, y:Int)= {                 // Not mandatory to specify return Type. It is auto interpretted.
    var z = x + y
    z                                             // Not mandatory to specify return keyword
  }

  def addC (x:Int, y:Int):Int= {                 // IF YOU SPECIFY RETURN KEYWORD. MANDATORY TO SPECIFY RETURN TYPE
    var z = x + y
    return z
  }
//Q: If you specify return type, is mandatory to sepecify return keyword? No. Correct answer. Refer to function addA

  def addD (x:Int, y:Int) = x + y
}

//Q? Mandatory to specify RETURN keyword? - NO
//Q? Mandatory to specify return type? - NO. What case it becomes mandatory? When you mention RETURN keyword
//Q? Is it mandatory to give brackets { }?- Single line. eg addD function NOT MANDATORY, multiple lines,EG addA,addB MANDATORY
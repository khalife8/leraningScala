import java.io.FileReader     // import package for reading file
import java.io.FileNotFoundException    // import for exception FileNotFoundException
import java.io.IOException      // import for IOException

object DemoTryCatch {

  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("C:\\learning_path\\Scala\\SourceCode\\exceptionHandlingDemo\\src\\main\\scala\\input.txt")
      val a = 10/0
      val Array1 = new Array(10)
      println(Array1(11))
    } catch {
      case e: FileNotFoundException => {
        println("File is not found")
        // instead of e, you can also write name, eg: ex, zzzz
        // in real world program, you will usually log this error in some error log file
      }
      case e: IOException => {
        print("error while reading the file")
      }
      case e: ArithmeticException => {
        println("Arithmetic exception divide by zero")
      }
      case e : ArrayIndexOutOfBoundsException =>{
        println("Array index out of bound exception occurred")
      }
      case e : Exception =>{
        println("It will catch all unhandled exception")
      }
    }
    finally {
      println("It will be always executed irrespective of exception or not")

    }
  }

}

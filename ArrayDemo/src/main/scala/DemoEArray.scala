// Multi dimensional Arrays
import Array._

object DemoEArray {

  def main(args: Array[String]): Unit = {
    var matrixEg = ofDim[Int](5,5)

    println(matrixEg)
    for (row <- 0 to 4){
      for (col <- 0 to 4){
       // matrixEg(row)(col) = col + 3
        if (row == col){
          matrixEg(row)(col) = 1
        } else {
          matrixEg(row)(col) = 0
        }
      }
    }
    for (row <- 0 to 4) {
      for (column <- 0 to 4) {
        print(matrixEg(row)(column) )
      }
      println(" ")
    }
  }
}

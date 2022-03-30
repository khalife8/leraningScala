import java.io._
object DemoDFileWrite {

  def main(args: Array[String]): Unit = {

    //    Option 1: using printWriter
    val outputFile1 = "C:\\learning_path\\Scala\\SourceCode\\leraningScala\\Sample Files\\outputFile1.txt"
    val outFile1 = new File(outputFile1)  // Step 1: Create instance of File
    val outWriter1 = new PrintWriter(outFile1) // Step 2: Create instance of PrintWriter
    //    Step 3: Write into File
    outWriter1.write("Hello world!!!\n")
    outWriter1.write("Hello world Again!!!\n")
    outWriter1.write("Hello world Again Again!!!\n")
    outWriter1.close()

    outWriter1.close()  // Step 4: Close the File

    println("Error is: " + outWriter1.checkError())

    //    Option 2: using FileWriter
    val outputFile2 = "C:\\learning_path\\Scala\\SourceCode\\leraningScala\\Sample Files\\outputFile2.txt"

    val outFile2 = new File(outputFile2)  // Step 1: Create instance of File
    val outWriter2 = new FileWriter(outFile2) // Step 2: Create instance of FileWriter

    //    Step 3: Write into File
    outWriter2.write("Hello World!!!!!\n")
    outWriter2.write("Hello World Again!!!!!\n")
    outWriter2.write("Hello World Again Again!!!!!\n")

    outWriter2.close()  // Step 4: Close the File

    //    Option 3: using BufferedWriter
    val outputFile3 = "C:\\learning_path\\Scala\\SourceCode\\leraningScala\\Sample Files\\outputFile3.txt"

    val outFile3 = new File(outputFile3)  // Step 1: Create instance of File
    val outWriter3 = new FileWriter(outFile3) // Step 2: Create instance of FileWriter

    val bufferedWriter3 = new BufferedWriter(outWriter3) // Step 2b: Create instance of BufferedWriter

    //    Step 3: Write into File
    bufferedWriter3.write("Hello World!!!!!\n")
    bufferedWriter3.write("Hello World Again!!!!!\n")
    bufferedWriter3.write("Hello World Again Again!!!!!\n")

    bufferedWriter3.flush()
    bufferedWriter3.close()  // Step 4: Close the File

  }

}
// Exception Handling:
//PrintWriter => Error handling using checkError method
//FileWriter + BufferedWriter => Can use try catch block

// Flushing the data
//PrintWriter => Costly/Slow, it flush
//FileWriter + BufferedWriter => Less Costly/Fast, You have to flush manually OR it will be flush when you close it.
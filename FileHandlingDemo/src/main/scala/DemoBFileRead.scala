object DemoBFileRead {

  def main(args: Array[String]): Unit = {
    val samplefile = "C:\\learning_path\\Scala\\SourceCode\\leraningScala\\Sample Files\\sampleData.txt"
    //option 1
    println("============ option1 ===========")
    scala.io.Source.fromFile(samplefile).foreach(x => print(x))
    //option 2
    println("============ option2 ===========")
    //val lines = scala.io.Source.fromFile(samplefile).getLines()
    //lines.foreach(x => println(x))

    scala.io.Source.fromFile(samplefile).getLines().foreach(x => println(x))

  }

}

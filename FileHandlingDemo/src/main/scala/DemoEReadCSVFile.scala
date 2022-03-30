object DemoEReadCSVFile {

  def main(args: Array[String]): Unit = {

    val sampleCSVFile = "C:\\learning_path\\Scala\\SourceCode\\leraningScala\\Sample Files\\sampleCSVFile.csv"
    val lines = scala.io.Source.fromFile(sampleCSVFile).getLines()
    //lines.foreach(x => println(x))
    for (line <- lines){
      if (line != "name,address,age")
      {
        val Array(name:String ,address:String ,age:String) = line.split(',')
        val ageNo = age.toInt
        println("Name is " + name + ", address is " + address + " and age is " + age)
      }
    }
  }

}

import java.io.FileOutputStream
import java.io.ObjectOutputStream

@SerialVersionUID(15L)
case class Person(name: String) extends Serializable

object DemoFserialization extends App{
  val fos = new FileOutputStream("C:\\learning_path\\Scala\\SourceCode\\leraningScala\\Sample Files\\sampleSer.txt")
  val oos = new ObjectOutputStream(fos)

  oos.writeObject(Person("Dijkstra"))
  oos.close
}

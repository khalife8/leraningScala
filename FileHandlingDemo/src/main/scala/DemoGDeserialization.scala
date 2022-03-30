import java.io._

@SerialVersionUID(16L)
case class Person(name: String) extends Serializable

// or fork := true in sbt
class ObjectInputStreamWithCustomClassLoader(
                                              fileInputStream: FileInputStream
                                            ) extends ObjectInputStream(fileInputStream) {
  override def resolveClass(desc: java.io.ObjectStreamClass): Class[_] = {
    Class.forName(desc.getName, false, getClass.getClassLoader)
  }
}

object DemoGDeserialization extends App {
  val fis = new FileInputStream("C:\\learning_path\\Scala\\SourceCode\\leraningScala\\Sample Files\\sampleSer.txt")
  val ois = new ObjectInputStreamWithCustomClassLoader(fis)

  val person = ois.readObject
  ois.close
  println(person)
}
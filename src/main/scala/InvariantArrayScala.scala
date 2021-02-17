class InvariantArrayScala extends App {
  val a: Array[String] = Array("abc")
  val b: Array[Any] = a
  b(0) = 123
}

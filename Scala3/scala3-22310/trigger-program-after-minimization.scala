abstract class A0[T] {
  def func(arg0: A0[String], arg1: T): Unit
}
abstract class A1 extends A0[String] {
  override def func(arg0: A0[Object], arg1: String): Unit = {}
}
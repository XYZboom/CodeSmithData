trait I0 {
  def func0(): Unit
}
trait I1[T] extends I0 {
  override def func0(): Unit = {}
}
trait I2 extends I1[I2], I0 {
}
open class A0 extends I2 {
}
// FILE: A1.java
public abstract class A1 extends A0 {}
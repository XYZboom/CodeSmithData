trait I0[T] {
  def func(): T
}
trait I1 extends I0[Unit] {
}
class A1 extends A0 {
  override def func(): Unit = ???
}
// Java File
// FILE: A0.java
import scala.runtime.BoxedUnit;

public class A0 implements I1 {
  @Override
  public BoxedUnit func() {
    return BoxedUnit.UNIT;
  }
}
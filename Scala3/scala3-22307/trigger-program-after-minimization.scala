trait I0[T0] {
  def func0(arg0: T0): Unit

  def func1(arg0: Object): Unit = {}
}
abstract class A0 extends I1 {
  override def func0(arg0: I1): Unit = {}
}
// Java files
public interface I1 extends I0<I1> {
  public default void func0(I1 arg0) {
    throw new RuntimeException();
  }
}
public final class A1 extends A0 {
  public void func1(Object arg0) {
  }
}
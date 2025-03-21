// FILE: I0.java
public interface I0<T> {
  public default T func(T t) {
    return t;
  }
}
// FILE: I1.java
public interface I1 extends I0<String> {
  @Override
  default String func(String s) {
    return s;
  }
}
// Scala Class
abstract class A0 extends I1 with I0[Object] {
  override def func(s: Object): String = super.func(s)
}
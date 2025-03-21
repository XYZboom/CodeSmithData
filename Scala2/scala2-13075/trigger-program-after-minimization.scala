// Java files
// FILE: I0.java
public interface I0<T0> {
  public abstract void func(T0 arg);
}
// FILE: I1.java
public interface I1<T> extends I0<T> {
  public default void func(T arg) {
  }
}
// Scala Class
open class A0 extends I1[String] {
}
// Java Files
// FILE: A1.java
public final class A1 extends A0 implements I0<String> {
  public void func(String arg) {
  }
}
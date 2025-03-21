// FILE: I0.java
public interface I0<T> {
  public void func(A<String> a, T s);
}
// FILE: I1.java
public interface I1 extends I0<String> {
  public default void func(A<Object> a, String s) {

  }
}
// Scala Classes
class A[T0]
class A0 extends I1 {
}
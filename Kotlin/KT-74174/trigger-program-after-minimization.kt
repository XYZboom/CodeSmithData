// FILE: I0.java
public interface I0<T> {
    public abstract T func(I0<T> arg0, T arg1);
}
// FILE: A0.java
public abstract class A0 implements I0<A0> {
    public A0 func(I0<Object> arg0, A0 arg1) {
        throw new RuntimeException();
    }
}

// FILE: main.kt
public abstract class A1 : A0(), I0<A0>

fun box() = "OK"
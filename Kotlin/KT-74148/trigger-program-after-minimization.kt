// TARGET_BACKEND: JVM
// FILE: A0.java
public abstract class A0<T> {
    public abstract Object func(A0<Object> arg0, T arg1);
}

// FILE: A1.java
public abstract class A1 extends A0<A1> {
    public Object func(A0<A1> arg0, A1 arg1) {
        return null;
    }
}

// FILE: main.kt
class A2: A1()
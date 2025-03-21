// JVM_DEFAULT_MODE: all
// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
// FILE: I0.java
public interface I0 {
    public String func();
}
// FILE: I1.java
public interface I1<T> extends I0 {
    @Override
    default String func() {
        return null;
    }
}
// FILE: A0.java
public class A0 implements I0 {
    @Override
    public final String func() {
        return "OK";
    }
}
// FILE: A1.java
public class A1 extends A0 implements I1<Object> {
}
// FILE: main.kt
abstract class A2: A1(), I1<Any?>
class A3: A2()
fun box(): String {
    return A3().func()
}
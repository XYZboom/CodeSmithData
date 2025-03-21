// A.java

public interface A<T> {
    public T func();
}
// B.java

public interface B extends A<String> {
    @Override
    default String func() {
        return "I1";
    }
}
// C.groovy

public class C implements A<String>, B {
}
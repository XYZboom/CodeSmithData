public interface I<T> {
    public abstract void func(I<Object> arg1);
}

public abstract class A extends Object implements I<Object> {
    public final void func(I<String> arg1) {
    }
}
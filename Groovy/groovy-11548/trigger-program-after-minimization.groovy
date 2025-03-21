class A {
    final public void func() {
    }
}
interface I0 {
    public default void func() {
    }
}
class B extends A implements I0 {
}
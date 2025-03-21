interface I<T0> {
    abstract T0 func()
}
abstract class A {
    final String func() {
        return "A"
    }
}
class B extends A implements I<String> {}
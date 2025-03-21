// JVM_DEFAULT_MODE: all
// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
// FILE: I0.kt
interface I0<T0, T1> {
    fun func(t1: T0)
    fun func1(): T1
}
// FILE: A0.kt
open class A0<T2>: I0<T2, Nothing> {
    override fun func(t1: T2) {

    }
    override fun func1(): Nothing = throw UnsupportedOperationException()
}

// FILE: A1.java
class A1 extends A0<String> {

}
// FILE: main.kt
fun box(): String {
    return "OK"
}
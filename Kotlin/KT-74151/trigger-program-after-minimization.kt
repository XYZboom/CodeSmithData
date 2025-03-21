// Kotlin Classes
interface I0 {
    fun func(arg0: ArrayList<Any>)
}

interface I1: I0 {
    override fun func(arg0: ArrayList<Any>) {
        println("I1")
    }
}
abstract class A1: I0 {
    override fun func(arg0: ArrayList<Any>) {
        println("A1")
    }
}

class A3: A2<Any>(), I1, I0 // could not compile. MANY_IMPL_MEMBER_NOT_IMPLEMENTED
// Java Class
public class A2<T> extends A1 implements I1 {}
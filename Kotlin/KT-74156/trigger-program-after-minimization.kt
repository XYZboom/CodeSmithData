interface I0 {
    fun func(): String
}
abstract class A0: I0 {
    override fun func(): String {
        return "Fail"
    }
}
interface I1: I0 {
    override fun func(): String {
        return "Fail"
    }
}
abstract class A1: A0(), I1
class A2: A1() {
    override fun func(): String {
        return "OK"
    }
}
fun box() = A2().func()
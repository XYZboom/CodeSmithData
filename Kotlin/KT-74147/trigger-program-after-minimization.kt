interface I0
interface I1<T0>: I0
interface I2: I1<I0>
class A2: I2, I0, I1<A2>
fun box() = "OK"
This bug is found when manual minimizing.
In the process of minimization, a more primitive program is like this:
```scala 3
trait I0[T] {
}
trait I1 extends I0[Any] {
}
trait I2 extends I0[String], I1 {
}
```
The compiler accept the invalid program. 
We were quite puzzled, so we checked the bytecode using `javap`. 
The output of `javap I2`:
```text
Compiled from "A1.scala"
public interface I2 extends I1 {
}
```
The output of `javap I1`:
```text
Compiled from "A1.scala"
public interface I1 extends I0<java.lang.Object> {
}
```
It seems that the compiler simply ignored the inherited grandfather interface.
We remove the type parameter in `I0`, and check the bytecode again.
```scala 3
trait I0 {
}
trait I1 extends I0 {
}
trait I2 extends I0, I1 {
}
```
The output of `javap I2`:
```text
Compiled from "A1.scala"
public interface I2 extends I1 {
}
```
Still no `I0`. As we cannot do any minimization, we reported the bug.
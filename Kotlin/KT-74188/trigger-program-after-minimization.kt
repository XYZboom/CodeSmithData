// FILE: A.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class A implements I {
    @Override
    public @NotNull String func(@Nullable Void a) {
        return "OK";
    }
}
// FILE: main.kt
interface I {
    fun func(a: Nothing?): String
}
class A1: A()
fun box() = A1().func(null)
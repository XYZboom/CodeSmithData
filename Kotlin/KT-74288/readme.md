This bug is found when manual minimizing.
In the process of minimization, a more primitive program is like this:

```kotlin
// Kotlin Classes
class A0<T> {
    fun func(): T = TODO()
}

abstract class A1 {
    abstract fun func(): A0<Any>
}

open class A2: A1() {
    final override fun func(): A0<Any> = TODO()
}
```

```java
// Java Class
class B extends A2 {
}
```

We change the generic parameter `T` of `A0` to covariant and make `A2::func` returns `A0<String>`, like this:

```kotlin
// Kotlin Classes
class A0<out T> {
    fun func(): T = TODO()
}

abstract class A1 {
    abstract fun func(): A0<Any>
}

open class A2: A1() {
    final override fun func(): A0<String> = TODO()
}
```

```java
// Java Class
class B extends A2 {
}
```

Java compiler reject the program due to lack of covariant:

```text
B.java:1: error: func() in A2 cannot override func() in A1
public class B extends A2 {}
       ^
  return type A0<String> is not compatible with A0<Object>
1 error
```

Actually there has a workaround in Kotlin using `@JvmWildcard`.
See at [KT-74288](https://youtrack.jetbrains.com/issue/KT-74288)
and [KT-11552](https://youtrack.jetbrains.com/issue/KT-11552)
This bug is found when manual minimizing.
Actually, it is the translation of [KT-74288](https://youtrack.jetbrains.com/issue/KT-74288) into Scala3 version.
In [KT-74288](https://youtrack.jetbrains.com/issue/KT-74288), we can use `@JvmWildcard` as a workaround.
But no such thing like `@JvmWildcard` in Scala3, so we reported this bug.
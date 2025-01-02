// JVM_DEFAULT_MODE: all
// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
// FILE: GvOQvc3G.kt
public abstract class GvOQvc3G<T0, T1> : Any() {
    abstract open fun vqem(rjV: T1, hAr8Y9: GvOQvc3G<T1, T0>?): Unit
}

// FILE: WAiv.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class WAiv extends Object  {
    public /*@NotNull*/ void duKrtt(/*@Nullable*/ Object ylBf) {
        throw new RuntimeException();
    }
    public final @Nullable GvOQvc3G<Object, Void> rCwv(@NotNull GvOQvc3G<@NotNull Void, @NotNull Void> dLwrree, @Nullable GvOQvc3G<Void, Void> yXJ) {
        throw new RuntimeException();
    }
    public final @NotNull GvOQvc3G<@NotNull Void, @NotNull WAiv> rje(@NotNull GvOQvc3G<@NotNull WAiv, @NotNull Void> bD0IWK, @NotNull Object c2sKQWjj, @NotNull GvOQvc3G<@NotNull Object, @NotNull Void> co514UjW) {
        throw new RuntimeException();
    }
}

// FILE: RVI.kt
public class RVI : GvOQvc3G<Any, RVI>() {
    override open fun vqem(rjV: RVI, hAr8Y9: GvOQvc3G<RVI, Any>?): Unit {
        throw RuntimeException()
    }
    val vnB: Nothing? = TODO()
}

// FILE: IExm7.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public class IExm7 extends GvOQvc3G<RVI, WAiv>  {
    public @NotNull GvOQvc3G<@NotNull RVI, @NotNull Object> rusy6Yut() {
        throw new RuntimeException();
    }
    public /*@NotNull*/ void vqem(/*@NotNull*/ WAiv rjV, /*@Nullable*/ GvOQvc3G<WAiv, RVI> hAr8Y9) {
        throw new RuntimeException();
    }
    public final /*@NotNull*/ RVI getEhVqaf() {
        throw new RuntimeException();
    }
    public final /*@NotNull*/ void setEhVqaf(/*@NotNull*/ RVI value) {
        throw new RuntimeException();
    }
}

// FILE: G4MNbeH.kt
public open class G4MNbeH<T2, T3, T4> : GvOQvc3G<Nothing, T2>() {
    fun wS1VT(dqI: WAiv): WAiv {
        throw RuntimeException()
    }
    fun kuQ3Dtp(): Any {
        throw RuntimeException()
    }
    override open fun vqem(rjV: T2, hAr8Y9: GvOQvc3G<T2, Nothing>?): Unit {
        throw RuntimeException()
    }
}

// FILE: EXcy.kt
public open class EXcy<T5, T6> : G4MNbeH<RVI, T5, WAiv>() {
    fun uWSf69kY(zH1nta48: WAiv, zvHuXMd: WAiv?, iCv8D4E: EXcy<WAiv, Any>): RVI? {
        throw RuntimeException()
    }
    fun l4qc5(cKQ: T5): T5? {
        throw RuntimeException()
    }
    // stub
    /*
    override fun wS1VT(dqI: WAiv): WAiv {
        throw RuntimeException()
    }
    */
    // stub
    /*
    override fun kuQ3Dtp(): Any {
        throw RuntimeException()
    }
    */
    // stub
    /*
    override open fun vqem(rjV: RVI, hAr8Y9: GvOQvc3G<RVI, Nothing>?): Unit {
        throw RuntimeException()
    }
    */
    var k7l24Ao: T6 = TODO()
}

// FILE: HeRgY.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public abstract class HeRgY extends G4MNbeH<Void, WAiv, RVI>  {
    public final @NotNull GvOQvc3G<@NotNull Void, @NotNull WAiv> nAAFUm() {
        throw new RuntimeException();
    }
    public /*@Nullable*/ RVI aSbBcG(/*@NotNull*/ RVI j3aro, /*@NotNull*/ HeRgY eXUa, /*@NotNull*/ Object oZW9qc) {
        throw new RuntimeException();
    }
    // stub
    /*
    public final @NotNull WAiv wS1VT(@NotNull WAiv dqI) {
        throw new RuntimeException();
    }
    */
    // stub
    /*
    public final @NotNull Object kuQ3Dtp() {
        throw new RuntimeException();
    }
    */
    public final /*@NotNull*/ void vqem(/*@NotNull*/ Void rjV, /*@Nullable*/ GvOQvc3G<Void, Void> hAr8Y9) {
        throw new RuntimeException();
    }
}

// FILE: JavaTopLevelContainer.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class JavaTopLevelContainer {
    public static /*@Nullable*/ Object getJknX1() {
        throw new RuntimeException();
    }
    public static /*@Nullable*/ Void getR1qe6() {
        throw new RuntimeException();
    }
    public static /*@Nullable*/ GvOQvc3G<RVI, IExm7> getR8R() {
        throw new RuntimeException();
    }
}
// FILE: main.kt
fun epGVL(b4bZjP3A: Nothing?, eu3vPpbB: WAiv?): Any? {
    throw RuntimeException()
}
val fni: Unit? get() = TODO()
val tcAL: Nothing? get() = TODO()

fun box(): String {
	return "OK"
}
fun main(args: Array<String>) {
}
// FILE: NotNull.java
package org.jetbrains.annotations;

import java.lang.annotation.*;

// org.jetbrains.annotations used in the compiler is version 13, whose @NotNull does not support the TYPE_USE target (version 15 does).
// We're using our own @org.jetbrains.annotations.NotNull for testing purposes.
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
public @interface NotNull {
}
// FILE: Nullable.java
package org.jetbrains.annotations;

import java.lang.annotation.*;

// org.jetbrains.annotations used in the compiler is version 13, whose @Nullable does not support the TYPE_USE target (version 15 does).
// We're using our own @org.jetbrains.annotations.Nullable for testing purposes.
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
public @interface Nullable {
}

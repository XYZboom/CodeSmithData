// JVM_DEFAULT_MODE: all
// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
// FILE: YCSqg.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class YCSqg extends Object  {
    public /*@NotNull*/ Object getY10s() {
        throw new RuntimeException();
    }
    public /*@NotNull*/ void setY10s(/*@NotNull*/ Object value) {
        throw new RuntimeException();
    }
}

// FILE: QicZdx.kt
public interface QicZdx<T0> {
    abstract open fun uzR(oIa09F: T0): YCSqg?
}

// FILE: Ifn.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface Ifn</*@NotNull*/ T1, /*@NotNull*/ T2, /*@NotNull*/ T3> extends QicZdx<T3> {
    public abstract /*@NotNull*/ T3 nFoZhkTY(/*@NotNull*/ T3 tSoKdzR, /*@NotNull*/ T1 ibqpP);
    public abstract /*@Nullable*/ T3 pwu683(/*@NotNull*/ T2 dToyS, /*@Nullable*/ T3 nHh);
    public default @Nullable YCSqg uzR(@NotNull T3 oIa09F) {
        throw new RuntimeException();
    }
}

// FILE: Ikg.kt
public interface Ikg<T4, T5, T6> : Ifn<Any, Any, T5>, QicZdx<T5> {
    abstract open fun yh9(): T5?
    abstract open fun ad71lO(tNYjS: YCSqg, xNEUrs: Ikg<T6, T5, Any>): T5?
    abstract open fun q55Up6(wKr: Ikg<YCSqg, T5, T6>?, eLC64: Ikg<YCSqg, Any, T6>, eJLl: Ikg<YCSqg, Any, T4>): YCSqg
    override open fun nFoZhkTY(tSoKdzR: T5, ibqpP: Any): T5 {
        throw RuntimeException()
    }
    override open fun pwu683(dToyS: Any, nHh: T5?): T5? {
        throw RuntimeException()
    }
    override open fun uzR(oIa09F: T5): YCSqg? {
        throw RuntimeException()
    }
}

// FILE: BqKa.kt
public open class BqKa : Any() {
    fun z87VCMoT(): Any {
        throw RuntimeException()
    }
    fun exiU4I1e(eTidXfT: Ifn<YCSqg, Any, BqKa>?, h9zdevef: YCSqg): Unit? {
        throw RuntimeException()
    }
    fun e5X(mPQkds: QicZdx<BqKa>?, isYQEx: QicZdx<BqKa>, tw7piwku: QicZdx<BqKa>?): Ikg<BqKa, Any, YCSqg> {
        throw RuntimeException()
    }
}

// FILE: S3S.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public abstract class S3S extends BqKa implements Ikg<BqKa, BqKa, Void>, QicZdx<BqKa> {
    public abstract @NotNull S3S wKOCg4(@NotNull YCSqg cQVStMd);
    public abstract /*@Nullable*/ void yql5y(/*@Nullable*/ QicZdx<YCSqg> dR8tao, /*@NotNull*/ Ikg</*@NotNull*/ S3S, /*@NotNull*/ BqKa, /*@NotNull*/ Void> jjmJ9, /*@NotNull*/ BqKa bdXj);
    public final /*@Nullable*/ BqKa yh9() {
        throw new RuntimeException();
    }
    public final /*@Nullable*/ BqKa ad71lO(/*@NotNull*/ YCSqg tNYjS, /*@NotNull*/ Ikg</*@NotNull*/ Void, /*@NotNull*/ BqKa, /*@NotNull*/ Object> xNEUrs) {
        throw new RuntimeException();
    }
    public @NotNull YCSqg q55Up6(@Nullable Ikg<YCSqg, BqKa, Void> wKr, @NotNull Ikg<@NotNull YCSqg, @NotNull Object, @NotNull Void> eLC64, @NotNull Ikg<@NotNull YCSqg, @NotNull Object, @NotNull BqKa> eJLl) {
        throw new RuntimeException();
    }
    // stub
    /*
    public final @NotNull Object z87VCMoT() {
        throw new RuntimeException();
    }
    */
    // stub
    /*
    public final @Nullable void exiU4I1e(@Nullable Ifn<YCSqg, Object, BqKa> eTidXfT, @NotNull YCSqg h9zdevef) {
        throw new RuntimeException();
    }
    */
    // stub
    /*
    public final @NotNull Ikg<@NotNull BqKa, @NotNull Object, @NotNull YCSqg> e5X(@Nullable QicZdx<BqKa> mPQkds, @NotNull QicZdx<@NotNull BqKa> isYQEx, @Nullable QicZdx<BqKa> tw7piwku) {
        throw new RuntimeException();
    }
    */
    // stub
    /*
    public @NotNull BqKa nFoZhkTY(@NotNull BqKa tSoKdzR, @NotNull Object ibqpP) {
        throw new RuntimeException();
    }
    */
    public abstract /*@Nullable*/ BqKa pwu683(/*@NotNull*/ Object dToyS, /*@Nullable*/ BqKa nHh);
    public final /*@Nullable*/ YCSqg uzR(/*@NotNull*/ BqKa oIa09F) {
        throw new RuntimeException();
    }
    public /*@Nullable*/ S3S getJZ0QtrY() {
        throw new RuntimeException();
    }
    public /*@NotNull*/ void setJZ0QtrY(/*@Nullable*/ S3S value) {
        throw new RuntimeException();
    }
}

// FILE: GSMRX.kt
public abstract class GSMRX<T7, T8, T9> : BqKa(), Ifn<Nothing, T7, S3S>, QicZdx<S3S> {
    abstract open fun b32a2Xld(): BqKa
    abstract open fun l9Tyyy(): Ikg<Nothing, T7, S3S>
    override fun nFoZhkTY(tSoKdzR: S3S, ibqpP: Nothing): S3S {
        throw RuntimeException()
    }
    override open fun pwu683(dToyS: T7, nHh: S3S?): S3S? {
        throw RuntimeException()
    }
    // stub
    /*
    override fun z87VCMoT(): Any {
        throw RuntimeException()
    }
    */
    // stub
    /*
    override fun exiU4I1e(eTidXfT: Ifn<YCSqg, Any, BqKa>?, h9zdevef: YCSqg): Unit? {
        throw RuntimeException()
    }
    */
    // stub
    /*
    override fun e5X(mPQkds: QicZdx<BqKa>?, isYQEx: QicZdx<BqKa>, tw7piwku: QicZdx<BqKa>?): Ikg<BqKa, Any, YCSqg> {
        throw RuntimeException()
    }
    */
    abstract override open fun uzR(oIa09F: S3S): YCSqg?
}

// FILE: JavaTopLevelContainer.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class JavaTopLevelContainer {
    public static @NotNull Object jApT(@Nullable Void wrea, @Nullable Void cJ4vK1, @Nullable Object pv76k) {
        throw new RuntimeException();
    }
    public static @Nullable Ifn<YCSqg, Void, YCSqg> aUVQ(@NotNull Ifn<@NotNull YCSqg, @NotNull Void, @NotNull YCSqg> eiK9n2A, @NotNull Object eGBZ, @NotNull Object xkxvK) {
        throw new RuntimeException();
    }
    public static @NotNull Ikg<@NotNull YCSqg, @NotNull BqKa, @NotNull YCSqg> tk0yUe(@Nullable BqKa wUoCLYu, @NotNull Ikg<@NotNull S3S, @NotNull YCSqg, @NotNull YCSqg> qbjdvnz) {
        throw new RuntimeException();
    }
    public static /*@Nullable*/ Object d2VRF(/*@Nullable*/ S3S nReYZcb, /*@NotNull*/ YCSqg tFKC, /*@NotNull*/ Ikg</*@NotNull*/ Object, /*@NotNull*/ S3S, /*@NotNull*/ YCSqg> p58u) {
        throw new RuntimeException();
    }
    public static @Nullable Object getEXdfn16Y() {
        throw new RuntimeException();
    }
    public static @NotNull S3S getW3J0koJv() {
        throw new RuntimeException();
    }
}
// FILE: main.kt
fun no9t(cu6Niy0g: QicZdx<Nothing>?, tk5O: Ifn<Nothing, Nothing, YCSqg>?, dVB: YCSqg?): Ifn<YCSqg, Any, Any>? {
    throw RuntimeException()
}

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

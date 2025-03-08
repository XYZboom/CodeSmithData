// JVM_DEFAULT_MODE: all
// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
// FILE: R0t.groovy
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface R0t</*@NotNull*/ T0, /*@NotNull*/ T1, /*@NotNull*/ T2> {
    public abstract /*@NotNull*/ T0 pgCNM1Od(/*@NotNull*/ T0 wJr2wR, /*@NotNull*/ T2 m4EP);
    public abstract /*@NotNull*/ T1 nPoV9i(/*@Nullable*/ T1 c9WxDrX, /*@Nullable*/ T2 eTZcxq4M, /*@NotNull*/ R0t</*@NotNull*/ T0, /*@NotNull*/ Object, /*@NotNull*/ T2> ozBsy);
    public abstract /*@NotNull*/ T0 qKYzRA();
}

// FILE: Le5XK.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public abstract class Le5XK extends Object implements R0t<Void, Object, Object> {
    public final /*@NotNull*/ Le5XK cXVH8() {
        throw new RuntimeException();
    }
    public /*@NotNull*/ Void pgCNM1Od(/*@NotNull*/ Void wJr2wR, /*@NotNull*/ Object m4EP) {
        throw new RuntimeException();
    }
    public final /*@NotNull*/ Object nPoV9i(/*@Nullable*/ Object c9WxDrX, /*@Nullable*/ Object eTZcxq4M, /*@NotNull*/ R0t</*@NotNull*/ Void, /*@NotNull*/ Object, /*@NotNull*/ Object> ozBsy) {
        throw new RuntimeException();
    }
    public final /*@NotNull*/ Void qKYzRA() {
        throw new RuntimeException();
    }
}

// FILE: YoGf3a.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface YoGf3a</*@NotNull*/ T3> extends R0t<Void, Void, T3> {
    public abstract /*@NotNull*/ Object iqsBo(/*@NotNull*/ R0t</*@NotNull*/ Void, /*@NotNull*/ Le5XK, /*@NotNull*/ Object> jLH, /*@NotNull*/ Object vJLxl, /*@Nullable*/ Object egX);
    public default /*@NotNull*/ Void pgCNM1Od(/*@NotNull*/ Void wJr2wR, /*@NotNull*/ T3 m4EP) {
        throw new RuntimeException();
    }
    public default /*@NotNull*/ Void nPoV9i(/*@Nullable*/ Void c9WxDrX, /*@Nullable*/ T3 eTZcxq4M, /*@NotNull*/ R0t</*@NotNull*/ Void, /*@NotNull*/ Object, /*@NotNull*/ T3> ozBsy) {
        throw new RuntimeException();
    }
    public default /*@NotNull*/ Void qKYzRA() {
        throw new RuntimeException();
    }
}

// FILE: PMAM.groovy
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public abstract class PMAM</*@NotNull*/ T4> extends Le5XK implements R0t<Void, Object, Object> {
    public abstract /*@NotNull*/ Le5XK lUb(/*@NotNull*/ Le5XK zM16we5, /*@Nullable*/ Object aSy86, /*@NotNull*/ Le5XK mubecsN);
    public abstract /*@NotNull*/ T4 l88OFTu(/*@NotNull*/ PMAM</*@NotNull*/ T4> jo3q);
    public abstract /*@NotNull*/ Le5XK mRq5Xe(/*@NotNull*/ Object u8A);
    // stub
    /*
    public final @NotNull Object nPoV9i(@Nullable Object c9WxDrX, @Nullable Object eTZcxq4M, @NotNull R0t<@NotNull Void, @NotNull Object, @NotNull Object> ozBsy) {
        throw new RuntimeException();
    }
    */
    // stub
    /*
    public final @NotNull Void qKYzRA() {
        throw new RuntimeException();
    }
    */
    // stub
    /*
    public final @NotNull Le5XK cXVH8() {
        throw new RuntimeException();
    }
    */
    public abstract /*@NotNull*/ Void pgCNM1Od(/*@NotNull*/ Void wJr2wR, /*@NotNull*/ Object m4EP);
}

// FILE: JavaTopLevelContainer.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class JavaTopLevelContainer {
    public static /*@Nullable*/ Object uZ08wzEj(/*@Nullable*/ R0t<Void, Void, Void> dwhnbKw, /*@NotNull*/ R0t</*@NotNull*/ Object, /*@NotNull*/ Void, /*@NotNull*/ Void> lJv5iQ) {
        throw new RuntimeException();
    }
    public static /*@NotNull*/ void ugv7(/*@Nullable*/ R0t<Le5XK, Void, Void> i1w, /*@Nullable*/ Le5XK cF3) {
        throw new RuntimeException();
    }
    public static /*@NotNull*/ Object getRSqyZzI() {
        throw new RuntimeException();
    }
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

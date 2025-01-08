// JVM_DEFAULT_MODE: all
// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
// FILE: H44h.groovy
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class H44h extends Object  {
    public /*@Nullable*/ H44h oPYggad(/*@NotNull*/ Object egkFLNB7) {
        throw new RuntimeException();
    }
    public final /*@Nullable*/ H44h rsV0y(/*@NotNull*/ Object tyfh, /*@NotNull*/ H44h vJSWq8) {
        throw new RuntimeException();
    }
    public final /*@Nullable*/ Object vZmb2y() {
        throw new RuntimeException();
    }
}

// FILE: SciaJik2.groovy
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface SciaJik2</*@NotNull*/ T0, /*@NotNull*/ T1, /*@NotNull*/ T2> {
    public abstract /*@Nullable*/ T2 uCYsQ4();
    public abstract /*@NotNull*/ T2 hWr();
}

// FILE: BfpSti9g.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class BfpSti9g extends Object implements SciaJik2<BfpSti9g, Object, Void> {
    public final /*@NotNull*/ Object q0j(/*@NotNull*/ SciaJik2</*@NotNull*/ BfpSti9g, /*@NotNull*/ BfpSti9g, /*@NotNull*/ Object> bCUuNjAF, /*@NotNull*/ BfpSti9g mFMpFpJ) {
        throw new RuntimeException();
    }
    public /*@Nullable*/ SciaJik2<H44h, Void, Void> vrC(/*@Nullable*/ Object h3n3I, /*@NotNull*/ H44h aVK, /*@Nullable*/ SciaJik2<Object, H44h, Void> iiV) {
        throw new RuntimeException();
    }
    public /*@Nullable*/ Void uCYsQ4() {
        throw new RuntimeException();
    }
    public final /*@NotNull*/ Void hWr() {
        throw new RuntimeException();
    }
}

// FILE: IYE.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public class IYE extends Object implements SciaJik2<Object, H44h, Object> {
    public /*@NotNull*/ Object lLhB93() {
        throw new RuntimeException();
    }
    public final /*@Nullable*/ Object uCYsQ4() {
        throw new RuntimeException();
    }
    public /*@NotNull*/ Object hWr() {
        throw new RuntimeException();
    }
}

// FILE: CXnH4.groovy
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public abstract class CXnH4 extends Object implements SciaJik2<Object, Void, CXnH4> {
    public abstract /*@NotNull*/ CXnH4 z3a846NR(/*@Nullable*/ CXnH4 oMi, /*@Nullable*/ IYE wNXv7LT, /*@Nullable*/ H44h xYhknm3N);
    public abstract /*@NotNull*/ H44h ca5oT(/*@Nullable*/ CXnH4 c5Jcdhr, /*@NotNull*/ SciaJik2</*@NotNull*/ BfpSti9g, /*@NotNull*/ BfpSti9g, /*@NotNull*/ Void> xkzG, /*@NotNull*/ BfpSti9g dr5A5H3I);
    public /*@Nullable*/ CXnH4 uCYsQ4() {
        throw new RuntimeException();
    }
    public final /*@NotNull*/ CXnH4 hWr() {
        throw new RuntimeException();
    }
}

// FILE: EtZoGh5.groovy
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class EtZoGh5</*@NotNull*/ T3> extends CXnH4 implements SciaJik2<Object, Void, CXnH4> {
    public final /*@NotNull*/ void tPMH(/*@Nullable*/ H44h wBckb7P1) {
        throw new RuntimeException();
    }
    public /*@NotNull*/ CXnH4 z3a846NR(/*@Nullable*/ CXnH4 oMi, /*@Nullable*/ IYE wNXv7LT, /*@Nullable*/ H44h xYhknm3N) {
        throw new RuntimeException();
    }
    public /*@NotNull*/ H44h ca5oT(/*@Nullable*/ CXnH4 c5Jcdhr, /*@NotNull*/ SciaJik2</*@NotNull*/ BfpSti9g, /*@NotNull*/ BfpSti9g, /*@NotNull*/ Void> xkzG, /*@NotNull*/ BfpSti9g dr5A5H3I) {
        throw new RuntimeException();
    }
    // stub
    /*
    public final @NotNull CXnH4 hWr() {
        throw new RuntimeException();
    }
    */
    // stub
    /*
    public @Nullable CXnH4 uCYsQ4() {
        throw new RuntimeException();
    }
    */
}

// FILE: Dn0abfkK.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public abstract class Dn0abfkK extends Object implements SciaJik2<CXnH4, H44h, Dn0abfkK> {
    public final /*@Nullable*/ CXnH4 f03nvUIh(/*@NotNull*/ CXnH4 u5DdCS, /*@Nullable*/ Object fe68Yx, /*@NotNull*/ BfpSti9g rPjK) {
        throw new RuntimeException();
    }
    public /*@Nullable*/ BfpSti9g du6V(/*@NotNull*/ EtZoGh5</*@NotNull*/ Dn0abfkK> rInnfIG, /*@Nullable*/ IYE hHVAi, /*@NotNull*/ BfpSti9g zNG1) {
        throw new RuntimeException();
    }
    public /*@Nullable*/ Dn0abfkK uCYsQ4() {
        throw new RuntimeException();
    }
    public /*@NotNull*/ Dn0abfkK hWr() {
        throw new RuntimeException();
    }
}

// FILE: JavaTopLevelContainer.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class JavaTopLevelContainer {
    public static /*@NotNull*/ H44h ecFPgK(/*@NotNull*/ IYE vc9L) {
        throw new RuntimeException();
    }
    public static /*@Nullable*/ H44h getDtwL() {
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

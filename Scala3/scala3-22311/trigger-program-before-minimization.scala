// JVM_DEFAULT_MODE: all
// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
// FILE: E7Ck.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public abstract class E7Ck</*@NotNull*/ T0, /*@NotNull*/ T1> extends Object  {
    public final @NotNull Object bBNg(@NotNull T0 chg7beR) {
        throw new RuntimeException();
    }
    public abstract /*@Nullable*/ void olI5(/*@Nullable*/ T0 ngxz);
    public abstract /*@NotNull*/ void eh29aRnA();
}

// FILE: CTn9d.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface CTn9d</*@NotNull*/ T2, /*@NotNull*/ T3> {
    public abstract /*@Nullable*/ T2 zWaWDyu();
    public abstract /*@NotNull*/ void zS5(/*@Nullable*/ Object aZXZsl9, /*@NotNull*/ Object cARDm9);
}

// FILE: Zgz55.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public class Zgz55</*@NotNull*/ T4, /*@NotNull*/ T5> extends Object implements CTn9d<T4, Object> {
    public /*@Nullable*/ Object ktnTsVsZ(/*@Nullable*/ Zgz55<Object, T4> kzwZt) {
        throw new RuntimeException();
    }
    public /*@Nullable*/ T4 zWaWDyu() {
        throw new RuntimeException();
    }
    public /*@NotNull*/ void zS5(/*@Nullable*/ Object aZXZsl9, /*@NotNull*/ Object cARDm9) {
        throw new RuntimeException();
    }
}

// FILE: IOAB.scala
abstract class IOAB extends Object with CTn9d[Object, Void] {
  def dniWF5B(eC5rv: Zgz55[IOAB, Void], nEIOokC9: E7Ck[Void, Object]): Unit
  override def zWaWDyu(): Object = 
    ???
  override def zS5(aZXZsl9: Object, cARDm9: Object): Unit = 
    ???
}

// FILE: J5xFb4.scala
class J5xFb4 extends IOAB with CTn9d[Object, Void] {
  def ipts6q(ah7cT0D: Object, w6tJjJm: CTn9d[Void, J5xFb4]): CTn9d[IOAB, Void] = 
    ???
  def bJt0RZR(xYXeRCD: Zgz55[IOAB, Void], yTDj: CTn9d[Void, IOAB], eEUZzF3: J5xFb4): CTn9d[Void, IOAB] = 
    ???
  override def dniWF5B(eC5rv: Zgz55[IOAB, Void], nEIOokC9: E7Ck[Void, Object]): Unit = 
    ???
  // stub
  /*
  override def zS5(aZXZsl9: Object, cARDm9: Object): Unit = 
    ???
  */
  // stub
  /*
  override def zWaWDyu(): Object = 
    ???
  */
}

// FILE: NgpvT.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public abstract class NgpvT extends IOAB  {
    public abstract /*@NotNull*/ CTn9d</*@NotNull*/ J5xFb4, /*@NotNull*/ Void> vUI(/*@NotNull*/ CTn9d</*@NotNull*/ IOAB, /*@NotNull*/ Void> eOz4, /*@NotNull*/ J5xFb4 ti04VTXs);
    public @NotNull void dniWF5B(@NotNull Zgz55<@NotNull IOAB, @NotNull Void> eC5rv, @NotNull E7Ck<@NotNull Void, @NotNull Object> nEIOokC9) {
        throw new RuntimeException();
    }
    // stub
    /*
    public final @NotNull void zS5(@Nullable Object aZXZsl9, @NotNull Object cARDm9) {
        throw new RuntimeException();
    }
    */
    // stub
    /*
    public @Nullable Object zWaWDyu() {
        throw new RuntimeException();
    }
    */
}

// FILE: LWgS.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public class LWgS extends IOAB  {
    public final @NotNull void ndApNm(@Nullable Object nXyP59, @NotNull Zgz55<@NotNull NgpvT, @NotNull Object> rq7L, @Nullable IOAB v9eDdqv) {
        throw new RuntimeException();
    }
    public final @NotNull void phKLj(@NotNull IOAB ccdp3ixD) {
        throw new RuntimeException();
    }
    public @NotNull void dniWF5B(@NotNull Zgz55<@NotNull IOAB, @NotNull Void> eC5rv, @NotNull E7Ck<@NotNull Void, @NotNull Object> nEIOokC9) {
        throw new RuntimeException();
    }
    // stub
    /*
    public final @NotNull void zS5(@Nullable Object aZXZsl9, @NotNull Object cARDm9) {
        throw new RuntimeException();
    }
    */
    // stub
    /*
    public @Nullable Object zWaWDyu() {
        throw new RuntimeException();
    }
    */
}

// FILE: GH1n4.scala
abstract class GH1n4[T6, T7, T8] extends IOAB with CTn9d[Object, T6] {
  def vJWUDfP(mMIc: GH1n4[J5xFb4, T6, J5xFb4], b1mMU: NgpvT): CTn9d[Object, T6] = 
    ???
  override def dniWF5B(eC5rv: Zgz55[IOAB, Void], nEIOokC9: E7Ck[Void, Object]): Unit = 
    ???
  // stub
  /*
  override def zS5(aZXZsl9: Object, cARDm9: Object): Unit = 
    ???
  */
  // stub
  /*
  override def zWaWDyu(): Object = 
    ???
  */
}

// FILE: JavaTopLevelContainer.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class JavaTopLevelContainer {
    public static /*@Nullable*/ void vnA(/*@NotNull*/ Object naWMV, /*@NotNull*/ Object myTKO424) {
        throw new RuntimeException();
    }
    public static @Nullable CTn9d<Object, Object> bIIzj() {
        throw new RuntimeException();
    }
    public static @NotNull void e3G() {
        throw new RuntimeException();
    }
    public static /*@Nullable*/ void a0bPskx(/*@Nullable*/ NgpvT jX7Q0, /*@NotNull*/ GH1n4</*@NotNull*/ Void, /*@NotNull*/ Void, /*@NotNull*/ NgpvT> biMthr9L) {
        throw new RuntimeException();
    }
    public static /*@Nullable*/ J5xFb4 getMaTZI() {
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

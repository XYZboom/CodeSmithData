// JVM_DEFAULT_MODE: all
// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
// FILE: TQoikrEe.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface TQoikrEe</*@NotNull*/ T0> {
    public abstract @NotNull T0 f221HJ(@NotNull Object r80);
    public abstract /*@Nullable*/ void djw(/*@NotNull*/ T0 xXjXr4, /*@NotNull*/ TQoikrEe</*@NotNull*/ Void> kKZ2H, /*@Nullable*/ Object tk4JhAC);
}

// FILE: LOq.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public abstract class LOq extends Object  {
    public final /*@Nullable*/ LOq bCZMZY(/*@Nullable*/ LOq magp4) {
        throw new RuntimeException();
    }
}

// FILE: Knsp.scala
class Knsp extends LOq with TQoikrEe[LOq] {
  def xIiCGz2V(cWiomZJ7: TQoikrEe[Void], tfD: Object, mZBo: Knsp): LOq = 
    ???
  def pv9Wg(): Object = 
    ???
  override def f221HJ(r80: Object): LOq = 
    ???
  override def djw(xXjXr4: LOq, kKZ2H: TQoikrEe[Void], tk4JhAC: Object): Unit = 
    ???
  // stub
  /*
  override def bCZMZY(magp4: LOq): LOq = 
    ???
  */
}

// FILE: FJF1.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface FJF1 extends TQoikrEe<FJF1> {
    public abstract /*@NotNull*/ FJF1 hhzb(/*@Nullable*/ Knsp q8d);
    public default /*@NotNull*/ FJF1 f221HJ(/*@NotNull*/ Object r80) {
        throw new RuntimeException();
    }
    public default @Nullable void djw(@NotNull FJF1 xXjXr4, @NotNull TQoikrEe<@NotNull Knsp> kKZ2H, @Nullable Object tk4JhAC) {
        throw new RuntimeException();
    }
}

// FILE: Dhe9.scala
trait Dhe9[T1, T2, T3] {
  def o6f8(yGgDgV1v: Knsp, ujgyMl1J: Dhe9[Object, LOq, T3], j5Rec1sp: Dhe9[Void, T3, LOq]): LOq
  def nAJlq7At(h1sTU: FJF1): T1
}

// FILE: L3q.scala
open class L3q[T4, T5] extends Object with FJF1 with Dhe9[T4, T5, Void] with TQoikrEe[FJF1] {
  def uy8uFCoG(): FJF1 = 
    ???
  override def hhzb(q8d: Knsp): FJF1 = 
    ???
  override def o6f8(yGgDgV1v: Knsp, ujgyMl1J: Dhe9[Object, LOq, Void], j5Rec1sp: Dhe9[Void, Void, LOq]): LOq = 
    ???
  override def nAJlq7At(h1sTU: FJF1): T4 = 
    ???
  // stub
  /*
  override def f221HJ(r80: Object): FJF1 = 
    ???
  */
  // stub
  /*
  override def djw(xXjXr4: FJF1, kKZ2H: TQoikrEe[Void], tk4JhAC: Object): Unit = 
    ???
  */
}

// FILE: R5bDsaQ.scala
trait R5bDsaQ[T6, T7] {
  def kFmLM(): L3q[Knsp, Void]
}

// FILE: JavaTopLevelContainer.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class JavaTopLevelContainer {
    public static /*@NotNull*/ Object aEyOt1d1(/*@NotNull*/ Object zvJlNQCx) {
        throw new RuntimeException();
    }
    public static /*@Nullable*/ Object getPwt() {
        throw new RuntimeException();
    }
    public static /*@NotNull*/ TQoikrEe</*@NotNull*/ Void> getToG() {
        throw new RuntimeException();
    }
    public static @NotNull void getZJd() {
        throw new RuntimeException();
    }
    public static @NotNull void getIzAxEKx1() {
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

// JVM_DEFAULT_MODE: all
// TARGET_BACKEND: JVM
// JVM_TARGET: 1.8
// FILE: SQOQCc.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface SQOQCc</*@NotNull*/ T0> {
    public abstract @Nullable Object nrm(@NotNull T0 fwH);
    public abstract /*@Nullable*/ Object mz2L(/*@Nullable*/ T0 xTP, /*@NotNull*/ SQOQCc</*@NotNull*/ Object> jjwrKg1);
}

// FILE: EQr6wY.scala
open class EQr6wY extends Object {
  def c38u(bLkh: SQOQCc[Object], rpV7y: EQr6wY): Object = 
    ???
}

// FILE: IHi.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class IHi extends EQr6wY implements SQOQCc<Object> {
    public @NotNull void wIByin(@NotNull Object p1s, @Nullable IHi yINDq48a) {
        throw new RuntimeException();
    }
    public final /*@Nullable*/ Object nrm(/*@NotNull*/ Object fwH) {
        throw new RuntimeException();
    }
    public final /*@Nullable*/ Object mz2L(/*@Nullable*/ Object xTP, /*@NotNull*/ SQOQCc</*@NotNull*/ Object> jjwrKg1) {
        throw new RuntimeException();
    }
    // stub
    /*
    public @Nullable Object c38u(@NotNull SQOQCc<@NotNull Object> bLkh, @NotNull EQr6wY rpV7y) {
        throw new RuntimeException();
    }
    */
}

// FILE: Qo0st.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public interface Qo0st</*@NotNull*/ T1, /*@NotNull*/ T2> extends SQOQCc<T2> {
    public abstract /*@Nullable*/ T1 u2tpVE5D(/*@Nullable*/ T2 m3axO0g);
    public default /*@Nullable*/ Object nrm(/*@NotNull*/ T2 fwH) {
        throw new RuntimeException();
    }
    public default @Nullable Object mz2L(@Nullable T2 xTP, @NotNull SQOQCc<@NotNull Object> jjwrKg1) {
        throw new RuntimeException();
    }
}

// FILE: CcbKi.scala
open class CcbKi[T3] extends Object with Qo0st[Void, Void] with SQOQCc[Void] {
  def pdWQTA6(wqpvjz: SQOQCc[Object], t42n2n: Object): Object = 
    ???
  def f7OCjk(fPCU7ILW: Qo0st[Void, EQr6wY], dPs6mrS2: Qo0st[T3, IHi]): EQr6wY = 
    ???
  def mlmXqs(cJtR: SQOQCc[IHi], js8: IHi): EQr6wY = 
    ???
  override def u2tpVE5D(m3axO0g: Void): Void = 
    ???
  // stub
  /*
  override def nrm(fwH: Void): Object = 
    ???
  */
  // stub
  /*
  override def mz2L(xTP: Void, jjwrKg1: SQOQCc[Object]): Object = 
    ???
  */
}

// FILE: U3Iel.scala
class U3Iel[T4, T5, T6] extends Object with SQOQCc[Object] {
  def lg2hxy(fb8: Object): CcbKi[T6] = 
    ???
  def b9w(ajy15F: T6): T4 = 
    ???
  def fqA(): Unit = 
    ???
  override def nrm(fwH: Object): Object = 
    ???
  override def mz2L(xTP: Object, jjwrKg1: SQOQCc[Object]): Object = 
    ???
}

// FILE: ZMIKZtw.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class ZMIKZtw extends CcbKi<Void> implements SQOQCc<Void> {
    public final /*@NotNull*/ Object bLYctuE(/*@NotNull*/ SQOQCc</*@NotNull*/ Object> ujJ74r, /*@NotNull*/ CcbKi</*@NotNull*/ EQr6wY> wPx) {
        throw new RuntimeException();
    }
    public @Nullable Object nrm(@NotNull Void fwH) {
        throw new RuntimeException();
    }
    public /*@Nullable*/ Object mz2L(/*@Nullable*/ Void xTP, /*@NotNull*/ SQOQCc</*@NotNull*/ Object> jjwrKg1) {
        throw new RuntimeException();
    }
    // stub
    /*
    public final @NotNull EQr6wY f7OCjk(@NotNull Qo0st<@NotNull Void, @NotNull EQr6wY> fPCU7ILW, @Nullable Qo0st<Void, IHi> dPs6mrS2) {
        throw new RuntimeException();
    }
    */
    // stub
    /*
    public final @NotNull EQr6wY mlmXqs(@Nullable SQOQCc<IHi> cJtR, @NotNull IHi js8) {
        throw new RuntimeException();
    }
    */
    // stub
    /*
    public final @Nullable Void u2tpVE5D(@Nullable Void m3axO0g) {
        throw new RuntimeException();
    }
    */
    // stub
    /*
    public @NotNull Object pdWQTA6(@NotNull SQOQCc<@NotNull Object> wqpvjz, @NotNull Object t42n2n) {
        throw new RuntimeException();
    }
    */
}

// FILE: JavaTopLevelContainer.java
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
public final class JavaTopLevelContainer {
    public static @Nullable Qo0st<EQr6wY, Object> uQXI(@NotNull CcbKi<@NotNull IHi> dhZT, @Nullable Qo0st<Void, EQr6wY> u6wcp) {
        throw new RuntimeException();
    }
    public static @Nullable ZMIKZtw dClg(@NotNull ZMIKZtw bJdj, @Nullable ZMIKZtw u2k) {
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

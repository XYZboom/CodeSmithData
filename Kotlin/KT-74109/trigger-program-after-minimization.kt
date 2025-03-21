// JVM_DEFAULT_MODE: all
// TARGET_BACKEND: JVM
// WITH_JDK
// JVM_TARGET: 1.8
// FILE: ITop.java
public interface ITop {
	public default void func() {}
}
// FILE: ISecondary.java
public interface ISecondary extends ITop {
	public default void func() {
	}
}
// FILE: IChild.java
public interface IChild extends ISecondary, ITop {
}
// FILE: GrandParent.java
public class GrandParent implements ITop {
	public final void func() {
	}
}
// FILE: Parent.java
public class Parent extends GrandParent implements ISecondary {
}

// FILE: main.kt
abstract class Child : Parent(), IChild
fun box(): String {
	return "OK"
}
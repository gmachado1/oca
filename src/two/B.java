package one;

class A{
	protected int j=12;
}
package two;

import one.*;

public class B extends A{
	public static void main(String args[]) {
		A a = new A();
	}
}

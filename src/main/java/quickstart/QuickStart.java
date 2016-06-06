package quickstart;

import java.util.function.BinaryOperator;

import jsweet.lang.Array;

/**
 * This example uses a Java map to store and display complementary colors. It
 * demonstrates that Java APIs and JavaScript APIs can be used together to build
 * programs.
 */
public class QuickStart {

	public static void main(String[] args) {
		new WrongOverloadConstructorWithVarargs<Double>().test(2);
		new WrongOverloadConstructorWithVarargs<Double>(2, (a, b) -> a + b, (a, b) -> a - b).test(2, (a, b) -> a + b,
				(a, b) -> a - b);
		// same but without varargs
		new WrongOverloadConstructorWithVarargs<Double>(2).test(2);
		// $export("trace", trace);
		System.out.println(WrongOverloadConstructorWithVarargs.trace);
	}

	public static class WrongOverloadConstructorWithVarargs<T> {

		static Array<String> trace = new Array<>();

		public WrongOverloadConstructorWithVarargs() {
		}

		@SafeVarargs
		public WrongOverloadConstructorWithVarargs(int defaultLevel, BinaryOperator<T>... precedence) {
			this(null, defaultLevel, precedence);
			trace.push("c2");
		}

		@SafeVarargs
		private WrongOverloadConstructorWithVarargs(WrongOverloadConstructorWithVarargs<T> parent, int defaultLevel,
				BinaryOperator<T>... precedence) {
			trace.push("c1");
		}

		@SafeVarargs
		public final void test(int defaultLevel, BinaryOperator<T>... precedence) {
			test(null, defaultLevel, precedence);
			trace.push("t2");
		}

		private void test(WrongOverloadConstructorWithVarargs<T> parent, int defaultLevel,
				@SuppressWarnings("unchecked") BinaryOperator<T>... precedence) {
			trace.push("t1");
		}

	}

}

package lesson6.slidecodes;

public class OuterStaticDemo {
	private String s = "hello";
	public OuterStaticDemo() {
		//access static methods in the usual way
		MyStaticNestedClass.myStaticMethod();
		
		//access instance methods in the usual way too
		//except that now private methods are also accessible
		MyStaticNestedClass cl = new MyStaticNestedClass();
		cl.myOtherMethod();		
		
		//as with inner classes, private instance vbles are accessible 
		int y = cl.x;		
		int y1 = MyStaticNestedClass.k;
	}
	// Static inner class can have static and non-static methods
	static class MyStaticNestedClass {
		private int x = 0;
		private static int k = 10;
		static void myStaticMethod() {
		//	String t = s; //compiler error -- no access
			System.out.println(k);
		}
		void myOtherMethod() {
			// Cannot make a static reference to the non-static field s
//			String t = s;
//			System.out.println(s);
					
		}
	}
}

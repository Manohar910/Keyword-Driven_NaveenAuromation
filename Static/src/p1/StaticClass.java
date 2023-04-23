package p1;

public class StaticClass {
	private static String str = "Java";

	public static class StaticDemo {
		public void show() {
			System.out.println("show");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticClass.StaticDemo ob = new StaticClass.StaticDemo();
		ob.show();
	}
}

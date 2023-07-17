package test.org;

public class StaticVariable {
	static int a;
	private void sub() {
System.out.println("dont consider it");
	}
	private void add() {
		a=10;
		System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println("Before Initialisation:"+a);
		StaticVariable q = new StaticVariable();
		q.add();
		System.out.println("After Initialisation:"+a);
		StaticVariable q1 = new StaticVariable();
		q1.add();
		a=100;
		System.out.println(a);
		a=200;
		System.out.println(a);
	}
	

}

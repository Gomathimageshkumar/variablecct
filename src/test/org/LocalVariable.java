package test.org;

public class LocalVariable {
	private void add() {
		int a =10;
		System.out.println("Inside method:"+a);
	}
	public static void main(String[] args) {
		int a = 100;
		System.out.println("Inside Main:"+a);
		LocalVariable c = new LocalVariable();
		c.add();
		
	}

}

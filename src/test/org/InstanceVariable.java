package test.org;

public class InstanceVariable {
	public int a;
	private void add() {
		a=10;
		System.out.println(a);
	}
	public static void main(String[] args) {
		InstanceVariable q =new InstanceVariable();
		System.out.println("Before Initialisation:"+q.a);
		q.add();
		System.out.println("After Initialisation:"+q.a);
		InstanceVariable q1 =new InstanceVariable();
		System.out.println("Before Initialisation:"+q1.a);
		q1.add();
		System.out.println("After Initialisation:"+q1.a);
	}
	}


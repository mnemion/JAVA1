package sec04.exam02;

public class Child extends Parent {
	private String name;
	
	public Child() {
		//super 숨음.
		this("홍길동");
		System.out.println("Chidl() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}

package sec02.exam01;

import sec02.exam01.A.C;

public class Main {

	public static void main(String[] args) {
		
		//인스턴스 멤버 클래스 객체 생성
		A a = new A();
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
		
		a.method();
	}

}

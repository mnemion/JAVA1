package sec02.exam05;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
//		parent.field2 = "data2";
//		parent.method3(); 얘도 사용할 수 없음
		
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
	}

}

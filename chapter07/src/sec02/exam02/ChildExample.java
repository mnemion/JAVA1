package sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		Parent parent = child;
		
		parent.method1();
		
//		부모 클래스에는 이미 타입 변환이 이루어져서 사용할 수 없음. 원래는 사용할 수 있음
	}

}

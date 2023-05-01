package sec01.exam02;

public class VariableScopeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
			System.out.println(v2);
		}
		//int v3 = v1 + v2;
		//v2가 안되는 이유는 가로밖을 벗어났기 때문이다. 범위 내에 있어야 함
	}

}

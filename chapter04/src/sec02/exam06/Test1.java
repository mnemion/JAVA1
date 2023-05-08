package sec02.exam06;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int i = 0;
		while (i<10) { //tot = 0, i = 0
			i++;       //i = 0 (1)			   
			total+=i;
			System.out.print(i);
			if(i!=10) {
				System.out.print("+");
			}
		}
		System.out.println("=" + total);
	}

}

package sec02.exam04;

public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi texi = new Taxi();
		
		driver.drive(bus);
		Vehicle vehicle = bus; //저장타입 변환;
	}

}

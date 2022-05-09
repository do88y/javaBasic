package javaClass;

public class DriverEx1 {

	public static void main(String[] args) {
		Driver chulsu=new Driver();
		Taxi taxi=new Taxi();
		Truck truck=new Truck();
		Bus bus=new Bus();
						
		chulsu.Drive(taxi);  // 오버라이딩 되어서 차량이 아니라 택시로 찍힘
		chulsu.Drive(truck);
		chulsu.Drive(bus);
		
	}

}

package javaClass;

public class DriverEx1 {

	public static void main(String[] args) {
		Driver chulsu=new Driver();
		Taxi taxi=new Taxi();
		Truck truck=new Truck();
		Bus bus=new Bus();
						
		chulsu.Drive(taxi);  // �������̵� �Ǿ ������ �ƴ϶� �ý÷� ����
		chulsu.Drive(truck);
		chulsu.Drive(bus);
		
	}

}

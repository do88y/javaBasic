package javaClass;
// 자동차 클래스
public class Car {
	// 필드
	Tire frontLeftTire= new Tire("앞왼쪽", 7);
	Tire frontRightTire=new Tire("앞오른쪽", 3);
	Tire backLeftTire=new Tire("뒤왼쪽", 5);
	Tire backRightTire=new Tire("뒤오른쪽", 4);
	
	//메서드
	int run() {
		System.out.println("자동차가 달립니다. 씽씽~~");
		if(frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if(frontRightTire.roll() == false) {
			stop();  
			return 2;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if(backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;  // 펑크 안 나면 0을 리턴
	}
			
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}

package javaClass;

public class CarEx1 {

	public static void main(String[] args) {
		Car csMyCar=new Car();
		for(int i=1; i<=10; i++) {
			int problemLocation=csMyCar.run();  // problemLocation이라는 변수에 csMyCar.run()에서 얻은 값을 넣어준다.
			
			
			switch(problemLocation) {
			case 1:
				csMyCar.frontLeftTire=new KumhoTire("앞왼쪽", 15);  // 이게 다형성 예시->frontLeftTire가 금호타이어의 메서드를 수행한다. 
				System.out.println("앞 왼쪽 금호타이어로 교체");
				break;
			case 2:
				csMyCar.frontRightTire=new HankookTire("앞오른쪽", 10);
				System.out.println("앞 오른쪽 한국타이어로 교체");
				break;
			case 3:
				csMyCar.backLeftTire=new HankookTire("뒤왼쪽", 13);
				System.out.println("뒤 왼쪽 한국타이어로 교체");
				break;
			case 4:
				csMyCar.backRightTire=new KumhoTire("뒤오른쪽", 12);
				System.out.println("뒤 오른쪽 금호타이어로 교체");
				break;
			}  // switch
			System.out.println("----------------------");
		}
	
	}

}

package javaClass;

public class CarEx1 {

	public static void main(String[] args) {
		Car csMyCar=new Car();
		for(int i=1; i<=10; i++) {
			int problemLocation=csMyCar.run();  // problemLocation�̶�� ������ csMyCar.run()���� ���� ���� �־��ش�.
			
			
			switch(problemLocation) {
			case 1:
				csMyCar.frontLeftTire=new KumhoTire("�տ���", 15);  // �̰� ������ ����->frontLeftTire�� ��ȣŸ�̾��� �޼��带 �����Ѵ�. 
				System.out.println("�� ���� ��ȣŸ�̾�� ��ü");
				break;
			case 2:
				csMyCar.frontRightTire=new HankookTire("�տ�����", 10);
				System.out.println("�� ������ �ѱ�Ÿ�̾�� ��ü");
				break;
			case 3:
				csMyCar.backLeftTire=new HankookTire("�ڿ���", 13);
				System.out.println("�� ���� �ѱ�Ÿ�̾�� ��ü");
				break;
			case 4:
				csMyCar.backRightTire=new KumhoTire("�ڿ�����", 12);
				System.out.println("�� ������ ��ȣŸ�̾�� ��ü");
				break;
			}  // switch
			System.out.println("----------------------");
		}
	
	}

}

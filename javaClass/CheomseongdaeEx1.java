package javaClass;

public class CheomseongdaeEx1 {

	public static void main(String[] args) {
		Cheomseongdae cheom1=Cheomseongdae.getInstance();
		Cheomseongdae cheom2=Cheomseongdae.getInstance();
		if(cheom1 == cheom2) {
			System.out.println("���� ÷���� ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� ÷���� ��ü�Դϴ�.");
		}
		cheom1.history();
		cheom2.history();
	}

}

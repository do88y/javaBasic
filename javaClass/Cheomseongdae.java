package javaClass;
// ÷���� Ŭ����(singleton)
public class Cheomseongdae {
	// ���� �ʵ�
	private static Cheomseongdae cheom=new Cheomseongdae();
	
	// ������
	private Cheomseongdae() {
		
	}
	
	// ���� �޼���
	static Cheomseongdae getInstance() {  // getInstance�� �޼ҵ�
		return cheom;
	}
	
	void history() {
		System.out.println("���翡�� ���� ������ ������");
	}
}

package javaClass;

public class PhysicalInfoEx1 {

	public static void main(String[] args) {
		PhysicalInfo younghee=new PhysicalInfo("�̿���", 10, 135.5f, 38.0f);
		printPhysicalInfo(younghee);
		younghee.update(11, 145.0f, 48.5f);
		printPhysicalInfo(younghee);
		younghee.update(12, 157.0f);  // �����԰� ������ ���� ���, ���� ���� ��� ������ ���� ������ ���־�� �ϴµ�
		printPhysicalInfo(younghee);
		younghee.update(13);  // ������ ���缭 ���̸� ���� ���

	}  // main
	
	public static void printPhysicalInfo(PhysicalInfo obj) {  // ������ ���� �ʰ� �� ���� print �ϴ� ��
		System.out.println("�̸� : " + obj.name);
		System.out.println("���� : " + obj.age);
		System.out.println("Ű : " + obj.height);
		System.out.println("������ : " + obj.weight);
		System.out.println("-------------");
	}

}

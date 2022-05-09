package javaClass;

public class Tire {
	// �ʵ�
	public int maxRotation;  // Ÿ�̾� ����
	public int accumulatedRotation;  // ����ȸ����
	public String location;
	
	// ������
	public Tire(String location, int maxRotation) {  // ����ȸ������ ���������� �̿��� �����ϰ� �޼ҵ�� �Է��� �� �����Ŷ� �����ڿ� �߰� �� �ص� ��.
		this.location=location;
		this.maxRotation=maxRotation;
	}
	
	// �޼���
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " Ÿ�̾��� ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;  // ���� ��� ��
		}else {
			System.out.println("***" + location + " Ÿ�̾� ��ũ ***");
			return false;  // ���� ����
		}
	}

}

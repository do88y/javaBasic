package javaClass;

public class DokdoAccount extends Account {
	// �ʵ�
	int point;  // ��� ����Ʈ

	// ������
	public DokdoAccount(String accountNo, String ownerName, int balance, int point) {
		super(accountNo, ownerName, balance);  // �θ� �����ڿ��� ȣ��
		this.point=point;
	}
	// �޼���
	@Override
	void deposit(int amount) {
		super.deposit(amount);  // �θ� �޼��� ȣ�� �� ���� ��
		point+=(int)(amount*0.001);
	}
	
}

package javaClass;

public class AccountEx2 {

	public static void main(String[] args) {
		Account younghee=new Account("333-888-9999", "�̿���", 100);
		Account chanho=new Account("777-222-4444", "����ȣ", 0);
		System.out.println(younghee.BANKNAME);  // ���� �ʵ�� ��ü�� �������� �ʾƵ� ���� Ŭ�������� ���� �����ϴ�.
		younghee.deposit(50000);
		chanho.deposit(30000);
		younghee.deposit(30000);
		try {
			chanho.withdraw(12000);
			printAccount(younghee);
			printAccount(chanho);// ����� ������ ������ �ִ� ��
			printAccount(new Account("999-777-4111","�̿�ǥ",500000));  // �͸�->���� ���� ��� �̸� ���� ���� ���� ex.��������
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}// main
	
	// ���� ���� ��� �޼���-> �̰� ��¸� ���ִ� ��
	static void printAccount(Account obj) {
		System.out.println("���¹�ȣ:" + obj.accountNo);
		System.out.println("������ �̸�:" + obj.ownerName);  // ������ �̸� ĭ�� ���¹�ȣ�� ��µƾ��µ� Ŭ���� ������ ���� ������ ownerName�� ���� �� ���� accountNo�� �� �־���.
		System.out.println("�ܾ�:" + obj.balance);
		System.out.println("-------------------");
	}

}

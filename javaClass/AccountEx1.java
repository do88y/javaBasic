package javaClass;

public class AccountEx1 {

	public static void main(String[] args) {
		/*Account chulsu;  // Account��� ��ü�� ������ ��
		chulsu=new Account();*/  // new�� �����ϰڴٴ� ��-> �ν��Ͻ� ��ü ����
		// ������ Ŭ���������� �ʵ��� �θ���.
		/*Account chulsu=new Account();  // ->����Ʈ ������ ������ ��������. . ����� �� ��ȣ�� ������ �޼ҵ��, �׳� ������ �ʵ�
		chulsu.accountNo="111-222-5555";
		chulsu.ownerName="��ö��";
		chulsu.balance=1000;*/
		Account chulsu=new Account("111-222-5555", "��ö��", 1000);  // �� ���� �����ϴ� �ڵ�
		Account gildong=new Account();
		gildong.accountNo="111-333-7777";
		gildong.ownerName="ȫ�浿";
		gildong.balance=0;  // �� ����
		chulsu.deposit(5000);
		gildong.deposit(30000);
		chulsu.deposit(20000);
		try {
			int amount=gildong.withdraw(70000);  // withdraw
			System.out.println("ã�� �ݾ�: " + amount);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("�ܾ�: " + gildong.balance);

	}

}

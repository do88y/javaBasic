package javaClass;

public class PolymorphismEx1 {
	
	public static void main(String[] args) {
		Account chulsu1=new Account();
		CheckingAccount gildong1=new CheckingAccount();
		CreditLineAccount chanho1=new CreditLineAccount();
		
		// �������� ��
		Account chulsu=new CheckingAccount();  // ������ Account �޼��常 ��� ���������� �޼���� �������̵� �� �� �̿��� �� �ִ�.
		Account gildong=new CreditLineAccount();  // ���� �ν��Ͻ� ��ü�� Account�� �ڵ� ����ȯ ��
		Account chanho=new DokdoAccount(null, null, 0, 0);
		CheckingAccount younghee=(CheckingAccount)chulsu1;  // CheckingAccount�� ��������ȯ ������
	}

}

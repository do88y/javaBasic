package javaClass;
// ���̳ʽ� ����
public class CreditLineAccount extends Account {

	// �ʵ�
	int creditLine;  // ���̳ʽ� �ѵ�

	// �Ļ���
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine=creditLine;
	}
	
	public CreditLineAccount() {
		// TODO Auto-generated constructor stub
	}
	
	// �޼��� �������̵�(������)-> �θ� ����� �޼��带 ���ľ��� ��
	@Override  // ������̼�
	int withdraw(int amount) throws Exception {
		if((balance+creditLine) < amount) {
			throw new Exception("������ �Ұ����մϴ�.");
		}
		balance-=amount;
		return amount;
	}
}

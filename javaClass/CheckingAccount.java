package javaClass;
// üũī�� Ŭ����
// �⺻���ΰ� Account Ŭ�������� ��ӹް� ������ �κ��� ���� �����.
public class CheckingAccount extends Account {  // extends�� ����̶�� ��� Account�� �θ�Ŭ���� CheckingAccount�� �ڽ�Ŭ����
	// �ʵ�
	String cardNo;  // ī���ȣ
	
	//������
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);  // super��� ��ɾ �θ� �����ڿ��� ȣ���ϴ� ��
		this.cardNo=cardNo;
	}
	
	//����Ʈ ������
	public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}
	
	// üũī��� �����Ѵ� - �޼���
	int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo)) {
			throw new Exception("ī���ȣ�� ��ġ���� �ʽ��ϴ�.");
		}
		return withdraw(amount);  // ���⼭ �θ�Ŭ������ ���� �ܾ��� Ȯ���� �ű� ������ �ܾ��� ���⼭ Ȯ�� �� �ص� ��
	}

}

package javaClass;
// ���� ���� Ŭ����(����)
public class Account {  // Ŭ���� ���� �빮�ڷ� ����
	
	// �ʵ�
	static final String BANKNAME="��������";  // ���-> �ٲ��� ���ϰ� �Ϸ��� final ���� ��, �̸� ���� �빮�ڷ�
	String accountNo;  // �ν��Ͻ� �ʵ�-> ö���� ����� ö�� ����, ���� ����� ���������� ����. ���¹�ȣ-> ��Ʈ������ ������ ������ ���ڿ��̾
	String ownerName;  // ������ �̸�
	int balance;  // �ܾ�-> int�� ���� �� ������ ���� �������̶�
	
	// ������-> ��ü�� �ʱ�ȭ�� ���
	public Account(String accountNo, String ownerName, int balance) {  // �����ڴ� �̸��� �ִ°� �ƴ϶� class �̸��� �����ϴ�. ctrl+space ������ ���.
		this.accountNo=accountNo;  // �Ű����� �̸��� �ʵ� �̸��� ���� ��쿡�� this�� �Ἥ �����Ѵ�.
		this.ownerName=ownerName;
		this.balance=balance;  // �Ű������� ���� ���� �ʵ忡 �־��ִ� ��
	}
	// ����Ʈ ������-> ����Ʈ �����ڿ��� �� �������� ������ �� ���Ŀ� ������ ����� ������ �ߴµ� �׷� ��� ����Ʈ �����ڸ� ctrl+space ������ ����Ʈ �����ڰ� �����
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	// �����Ѵ�. -�޼���
	void deposit(int amount) {  // void->return���� ����. ����ִ�. ()->�Ű�����. �ܺο��� ���޵Ǵ� ���� �޴´�.
		balance+=amount;
	}
	//�����Ѵ�. -�޼���
	int withdraw(int amount) throws Exception {  // �޼��� �տ� Ÿ���� ������ �������� ������� �Ѵ�. ������ Exception ���->throws Exception �߰�
		if(balance < amount) {
			throw new Exception("�ܾ��� �����մϴ�.");  // 0�� �ƴ϶� Exception�� �̿��� �ܾ��� �����մϴ� ��� ������ ����� ��
//			return 0;  // �ܾ��� ����ݾ׺��� ������ 0�� �����Ѵ�. �ܾ��� �����ϸ� 0�̶�� ����
		}
		balance-=amount;  // 
		return amount;
	}
}  // ����(���赵) �ϼ��� �� -> �ν��Ͻ�(��ü) ������ ��

package classConfirm;

public class Account19 {
	// �ν��Ͻ� �ʵ�
	private int balance;  // private static���� �����ϸ� �� �ؿ� this�� �ƴ϶� Account.balance ����
	// ���
	static final int MIN_BALANCE=0;
	static final int MAX_BALANCE=1000000;
	
	
	public int getBalance() {
		return balance;
		
	}
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
			
		}
	}
	
	
	
}

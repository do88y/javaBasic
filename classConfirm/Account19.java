package classConfirm;

public class Account19 {
	// 인스턴스 필드
	private int balance;  // private static으로 설정하면 맨 밑에 this가 아니라 Account.balance 가능
	// 상수
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

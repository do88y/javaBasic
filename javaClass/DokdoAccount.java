package javaClass;

public class DokdoAccount extends Account {
	// 필드
	int point;  // 기금 포인트

	// 생성자
	public DokdoAccount(String accountNo, String ownerName, int balance, int point) {
		super(accountNo, ownerName, balance);  // 부모 생성자에서 호출
		this.point=point;
	}
	// 메서드
	@Override
	void deposit(int amount) {
		super.deposit(amount);  // 부모 메서드 호출 할 때도 씀
		point+=(int)(amount*0.001);
	}
	
}

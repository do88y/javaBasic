package javaClass;
// 마이너스 통장
public class CreditLineAccount extends Account {

	// 필드
	int creditLine;  // 마이너스 한도

	// 셍상자
	public CreditLineAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine=creditLine;
	}
	
	public CreditLineAccount() {
		// TODO Auto-generated constructor stub
	}
	
	// 메서드 오버라이딩(재정의)-> 부모가 상속한 메서드를 고쳐쓰는 것
	@Override  // 어노테이션
	int withdraw(int amount) throws Exception {
		if((balance+creditLine) < amount) {
			throw new Exception("인출이 불가능합니다.");
		}
		balance-=amount;
		return amount;
	}
}

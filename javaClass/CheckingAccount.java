package javaClass;
// 체크카드 클래스
// 기본적인건 Account 클래스에서 상속받고 부족한 부분은 새로 만든다.
public class CheckingAccount extends Account {  // extends가 상속이라는 명령 Account가 부모클래스 CheckingAccount가 자식클래스
	// 필드
	String cardNo;  // 카드번호
	
	//생성자
	public CheckingAccount(String accountNo, String ownerName, int balance, String cardNo) {
		super(accountNo, ownerName, balance);  // super라는 명령어가 부모 생성자에서 호출하는 것
		this.cardNo=cardNo;
	}
	
	//디폴트 생성자
	public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}
	
	// 체크카드로 지불한다 - 메서드
	int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo)) {
			throw new Exception("카드번호가 일치하지 않습니다.");
		}
		return withdraw(amount);  // 여기서 부모클래스에 가서 잔액을 확인할 거기 때문에 잔액은 여기서 확인 안 해도 됨
	}

}

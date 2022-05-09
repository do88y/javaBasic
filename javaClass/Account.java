package javaClass;
// 은행 계좌 클래스(통장)
public class Account {  // 클래스 명은 대문자로 시작
	
	// 필드
	static final String BANKNAME="신한은행";  // 상수-> 바꾸지 못하게 하려고 final 붙인 것, 이름 전부 대문자로
	String accountNo;  // 인스턴스 필드-> 철수가 만들면 철수 정보, 영희가 만들면 영희정보가 들어간다. 계좌번호-> 스트링으로 설정한 이유는 문자열이어서
	String ownerName;  // 예금주 이름
	int balance;  // 잔액-> int로 설정 한 이유는 돈은 정수값이라서
	
	// 생성자-> 객체의 초기화를 담당
	public Account(String accountNo, String ownerName, int balance) {  // 생성자는 이름을 주는게 아니라 class 이름과 동일하다. ctrl+space 누르면 뜬다.
		this.accountNo=accountNo;  // 매개변수 이름이 필드 이름과 같은 경우에는 this를 써서 구분한다.
		this.ownerName=ownerName;
		this.balance=balance;  // 매개변수에 받은 값을 필드에 넣어주는 것
	}
	// 디폴트 생성자-> 디폴트 생성자였을 때 만들어줬기 때문에 그 이후에 생성자 만들면 에러가 뜨는데 그런 경우 디폴트 생성자를 ctrl+space 누르면 디폴트 생성자가 생긴다
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	// 예금한다. -메서드
	void deposit(int amount) {  // void->return값이 없다. 비어있다. ()->매개변수. 외부에서 전달되는 값을 받는다.
		balance+=amount;
	}
	//인출한다. -메서드
	int withdraw(int amount) throws Exception {  // 메서드 앞에 타입이 나오면 리턴으로 돌려줘야 한다. 인위적 Exception 배움->throws Exception 추가
		if(balance < amount) {
			throw new Exception("잔액이 부족합니다.");  // 0이 아니라 Exception을 이용해 잔액이 부족합니다 라고 찍히게 만드는 것
//			return 0;  // 잔액이 인출금액보다 작으면 0을 리턴한다. 잔액이 부족하면 0이라고 찍힘
		}
		balance-=amount;  // 
		return amount;
	}
}  // 개발(설계도) 완성된 것 -> 인스턴스(객체) 만들어야 함

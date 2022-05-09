package javaClass;

public class AccountEx2 {

	public static void main(String[] args) {
		Account younghee=new Account("333-888-9999", "이영희", 100);
		Account chanho=new Account("777-222-4444", "박찬호", 0);
		System.out.println(younghee.BANKNAME);  // 정적 필드는 객체를 생성하지 않아도 원본 클래스에서 접근 가능하다.
		younghee.deposit(50000);
		chanho.deposit(30000);
		younghee.deposit(30000);
		try {
			chanho.withdraw(12000);
			printAccount(younghee);
			printAccount(chanho);// 출력할 정보를 전달해 주는 것
			printAccount(new Account("999-777-4111","이영표",500000));  // 익명->수정 없는 경우 이름 없이 생성 가능 ex.예금통장
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}// main
	
	// 통장 정보 출력 메서드-> 이건 출력만 해주는 것
	static void printAccount(Account obj) {
		System.out.println("계좌번호:" + obj.accountNo);
		System.out.println("예금주 이름:" + obj.ownerName);  // 예금주 이름 칸에 계좌번호가 출력됐었는데 클래스 생성한 곳에 가보니 ownerName이 들어가야 할 곳에 accountNo가 들어가 있었다.
		System.out.println("잔액:" + obj.balance);
		System.out.println("-------------------");
	}

}

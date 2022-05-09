package javaClass;

public class AccountEx1 {

	public static void main(String[] args) {
		/*Account chulsu;  // Account라는 객체를 선언한 것
		chulsu=new Account();*/  // new는 생성하겠다는 말-> 인스턴스 객체 생성
		// 변수를 클래스에서는 필드라고 부른다.
		/*Account chulsu=new Account();  // ->디폴트 생성자 없으면 에러난다. . 찍었을 때 괄호가 나오면 메소드고, 그냥 찍히면 필드
		chulsu.accountNo="111-222-5555";
		chulsu.ownerName="김철수";
		chulsu.balance=1000;*/
		Account chulsu=new Account("111-222-5555", "김철수", 1000);  // 한 번에 생성하는 코드
		Account gildong=new Account();
		gildong.accountNo="111-333-7777";
		gildong.ownerName="홍길동";
		gildong.balance=0;  // 빈 통장
		chulsu.deposit(5000);
		gildong.deposit(30000);
		chulsu.deposit(20000);
		try {
			int amount=gildong.withdraw(70000);  // withdraw
			System.out.println("찾은 금액: " + amount);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("잔액: " + gildong.balance);

	}

}

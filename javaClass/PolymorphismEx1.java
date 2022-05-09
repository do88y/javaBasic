package javaClass;

public class PolymorphismEx1 {
	
	public static void main(String[] args) {
		Account chulsu1=new Account();
		CheckingAccount gildong1=new CheckingAccount();
		CreditLineAccount chanho1=new CreditLineAccount();
		
		// 다형성의 예
		Account chulsu=new CheckingAccount();  // 변수는 Account 메서드만 사용 가능하지만 메서드는 오버라이드 한 걸 이용할 수 있다.
		Account gildong=new CreditLineAccount();  // 뒤의 인스턴스 객체는 Account로 자동 형변환 됨
		Account chanho=new DokdoAccount(null, null, 0, 0);
		CheckingAccount younghee=(CheckingAccount)chulsu1;  // CheckingAccount로 강제형변환 시켜줌
	}

}

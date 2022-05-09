package classConfirm;

import java.lang.module.FindException;
import java.util.Scanner;

public class BankApplication_0 {
	private static Account[] accountArray=new Account[100];  // 전역변수->메인 메서드 밖에 만들면 전체에 적용된다.
	private static Scanner scanner=new Scanner(System.in);
	static int count=0;
	// 메인 메서드
	public static void main(String[] args) {
		
		boolean run=true;
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------");
			System.out.print("선택> ");
			int selectNo=scanner.nextInt();
			switch(selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run=false;
				break;
			}
		}  // while
		System.out.println("프로그램 종료");
		
	}  // main
	
	// 계좌 생성하기
	private static void createAccount() {
		System.out.println("-------");
		System.out.println("계좌생성");
		System.out.println("-------");
		System.out.print("계좌번호: ");
		String ano=scanner.next();
		System.out.print("계좌주: ");
		String owner=scanner.next();
		System.out.print("초기입급액: ");
		int balance=scanner.nextInt();
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i]=new Account(ano, owner, balance);
				break;
			}
		}
//		accountArray[count]=new Account(ano, owner, balance);  // 계좌 목록을 배열로 만듦
//		count++;
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	
	
	// 계좌 목록 보기
	private static void accountList() {
		System.out.println("-------");
		System.out.println("계좌목록");
		System.out.println("-------");
		for(int i=0; i<count; i++) {
			System.out.print(accountArray[i].getAno()+"   ");
			System.out.print(accountArray[i].getOwner()+"   ");
			System.out.println(accountArray[i].getBalance()+"   ");
		}
		
	}
		
	// 예금하기
	private static void deposit() {
		System.out.println("-------");
		System.out.println("예금");
		System.out.println("-------");
		System.out.print("계좌번호: ");
		String ano=scanner.next();
		System.out.print("예금액: ");
		int deposit=scanner.nextInt();
		Account account=findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다");
		}else {
			account.setBalance(account.getBalance()+deposit);
			System.out.println("결과: 예금이 성공하였습니다.");
		}
	}
	
	// 출금하기
	private static void withdraw() {
		System.out.println("-------");
		System.out.println("출금");
		System.out.println("-------");
		System.out.println("계좌번호: ");
		String ano=scanner.next();
		System.out.println("출금액: ");
		int withdraw=scanner.nextInt();
		Account account=findAccount(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다");
		}else {
			account.setBalance(account.getBalance()-withdraw);
			System.out.println("결과: 출금이 성공하였습니다.");
		}
		
	}

	// Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {  // Account는 변수 findAccount는 변수이름 ano는 매개변수. Account  앞에  void 붙이니까 findAccount 전부에 에러가 났다.
		Account account=null;
		for(int i=0; i<count; i++) {
			if(accountArray[i].getAno().equals(ano)) {
				account=accountArray[i];
				break;
			}
		}
		return account;
	}
}

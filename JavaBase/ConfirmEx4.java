package JavaBase;

import java.util.Scanner;

public class ConfirmEx4 {

	public static void main(String[] args) {
		boolean run = true;
		
		int balance = 0;
		int amount;
		
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금| 3.잔고| 4.종료");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			int num=scanner.nextInt();
			switch(num) {
				case 1:
					//예금
					System.out.print("예금액> ");
					balance+=scanner.nextInt();
					break;
				case 2:
					//출금
					System.out.print("출금액> ");
					amount=scanner.nextInt();
					if(amount>balance) {
						System.out.println("잔액이 부족합니다.");
					}else {
						balance-=amount;
					}
					break;
				case 3:
					//잔고
					System.out.println("잔고> " + balance);
					break;
				case 4:
					//종료
					run= false;
					break;
			}  // switch
			
			
		}  // while

		System.out.println("프로그램 종료");
	}

}

package JavaBase;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요");
		String input;  // string은 문자열을 받을 수 있다. 문자 받을 수 있는 변수 입력
		Scanner sc=new Scanner(System.in);
		do {
			System.out.print("입력 할 내용>>");
			input=sc.nextLine();
			System.out.println("당신이 입력한 내용: " + input);
		}while(!input.equals("q"));  // !는 NOT의 의미. 입력 내용이 q와 같지 않냐고 묻는 것
		System.out.println("프로그램 종료");

	}

}

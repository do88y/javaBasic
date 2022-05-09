package JavaBase;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.print("여행지를 선택(1.미주 2.유럽 3.동남아)?");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("1층 안내데스크로 가세요");
				break;  // break을 안 쓰면 수행하고 그 밑은 물어보지 않고 모두 수행
			case 2:
				System.out.println("2층 안내데스크로 가세요");
				break;
			case 3:
				System.out.println("별관 안내데스크로 가세요");
				break;
			default:  // case 이외의 아무 값이나 입력되었을 때 default로 온다.
				System.out.println("여행지 선택이 잘못되었습니다.");
				break;
			}
	}

}

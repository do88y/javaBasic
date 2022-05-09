package JavaBase;

import java.util.Scanner;

public class IFStatementEx6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.print("점수를 입력해주세요>>");
		int score=sc.nextInt();
		if(score>=0 && score<=100) {  // 밑에 조건 중 아무 조건이나 부합할 시 명령을 출력하고 빠져나온다.
			if(score>=90) {
				if(score>=95) {  // score>=90 이 조건을 만족할 때 여 조건을 물어본다.
					System.out.println("A+등급");
				}
				System.out.println("A등급");
			}else if(score>=80) {
				System.out.println("B등급");
			}else if(score>=70) {
				System.out.println("C등급");
			}else if(score>=60) {
				System.out.println("D등급");
			}else {
				System.out.println("F등급");
			}
		}else {  // score>=0 && score<=100 이 조건이 아닐 시 바로 여기로 온다.
			System.out.println("점수 입력 오류");
		}
		
	}

}

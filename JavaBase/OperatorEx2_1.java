package JavaBase;

import java.util.Scanner;

public class OperatorEx2_1 {

	public static void main(String[] args) {  // 선생님이 푼 것
		Scanner sc=new Scanner(System.in);
		System.out.print("사과 총 개수는?");
		int aplAmount=sc.nextInt();
		/*System.out.println("한 명당 가지는 사과 개수=" + aplAmount/23);
		System.out.println("남는 사과 개수=" + aplAmount%23);*/
		int child=23;
		int applePerChild=aplAmount/child;  // 변수 선언을 해주면 아이들 숫자가 바뀌었을 때 한 번에 편하게 바꿀 수 있다.
		int remain=aplAmount%child;
		System.out.println("한 명 당 가지는 사과 개수=" + applePerChild);
		System.out.println("남은 사과 개수=" + remain);

	}

}

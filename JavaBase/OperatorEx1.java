package JavaBase;

import java.util.Scanner;

public class OperatorEx1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("구입 수량은?");  // ln 뺀 이유는 문자 옆에 입력 커서가 오게 하기 위해
		int amount=sc.nextInt();
		int price=2000;
		int salesPrice=amount*price;
		System.out.println("총 판매가격=" + salesPrice);  // salesPrice가 문자화 된다.
		
	}

}

package JavaBase;

import java.util.Scanner;

public class IFStatementEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("���Լ�����?");
		int amount=sc.nextInt();
		int price=5000;
		if(amount>=10 && price>=1000) {
			price*=0.8;  // price=price*0.8;
		}
		int salesPrice=amount*price;
			System.out.println("�Ǹűݾ�=" + salesPrice);
		
	}

}

package JavaBase;

import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {
		System.out.println("** 1���� 100 ������ ���ڸ� ���ߴ� ���� **");
		int comNum=(int)(Math.random()*100)+1;  // 0.00...xx *100->������ȯ->+1->��� 1
		int count=0;
		Scanner sc=new Scanner(System.in);
		int myNum;
		while(true) {
			System.out.print("���� �Է�>> ");
			myNum=sc.nextInt();
			if(myNum<=100 && myNum>=1) {
				count++;  // �� ��ɹ��� ���� ������ ī��Ʈ �ؾ� �̱� ����� ������ ����
				if(myNum > comNum) {
					System.out.println("����� ���ڰ� Ŀ��. �� �� ���� ���� �־����.");
				}else if(myNum < comNum) {
					System.out.println("����� ���ڰ� �۾ƿ�. �� �� ū ���� �־����.");
				}else {
					System.out.println("�����մϴ�. ���߼̽��ϴ�. (�õ� Ƚ��= " + count + ")");
					break;
					}
				}else {
					System.out.println("1���� 100 ������ ���ڸ� �Է��ϼ���.");  // 1~100 ������ ���� ���� ���ڳ� ���� �Է� �� ��µǵ���.
				}
		
		}  // while��
		System.out.println("������ ����Ǿ����ϴ�.");
	}

}

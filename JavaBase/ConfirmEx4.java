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
			System.out.println("1.���� | 2.���| 3.�ܰ�| 4.����");
			System.out.println("--------------------------");
			System.out.print("����> ");
			int num=scanner.nextInt();
			switch(num) {
				case 1:
					//����
					System.out.print("���ݾ�> ");
					balance+=scanner.nextInt();
					break;
				case 2:
					//���
					System.out.print("��ݾ�> ");
					amount=scanner.nextInt();
					if(amount>balance) {
						System.out.println("�ܾ��� �����մϴ�.");
					}else {
						balance-=amount;
					}
					break;
				case 3:
					//�ܰ�
					System.out.println("�ܰ�> " + balance);
					break;
				case 4:
					//����
					run= false;
					break;
			}  // switch
			
			
		}  // while

		System.out.println("���α׷� ����");
	}

}

package JavaBase;

import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean run=true;
		while(run) {
			System.out.print("��� �ֻ��� ��ȣ �Է�>>");
			int myNum=sc.nextInt();
			int count=0;
			int comNum;  // �̰Ÿ� while�� �ۿ� ���� �����ؾ� ��
			if(myNum<=6 && myNum>=1) {
				while(true) {
					count++;
					comNum=(int)(Math.random()*6)+1;
					System.out.println(comNum);  // �̰� ���߸�
					if(myNum==comNum) {
						run=false;
						break;  // ������� ����
					}
				}//while��->�̰� �ؿ��ٰ� �ߴµ� break �ϰ� �ٷ� while �ݾƾ� ��
					if(count<=6) {
						System.out.println("�׷��� Ȯ���� ����ֳ׿�");
					}else {
						System.out.println("Ȯ���� �ٴ��̱���");
					}
			}else {
				System.out.println("�ֻ��� ��ȣ�� 1���� 6�������� �����Դϴ�.");
				System.out.println("�ٽ� �Է��غ�����.");
			}
		}
			
	}

}
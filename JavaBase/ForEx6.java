package JavaBase;

public class ForEx6 {

	public static void main(String[] args) {
		/*for(int i=1; i<=10; i++) {
			if(i%2 == 0) {  // ¦���� �� �������� 0�̱� ������ 
				continue;  // ��� �ݺ�
			}
			System.out.println(i);
		}*/
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				continue;
			}
			sum+=i;
		}  // for�� ����
		System.out.println("1���� 100������ ��(3�ǹ�� ����)=" + sum);  // ����� for�� �ۿ��� ���� ��
	}

}

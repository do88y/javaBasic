package JavaBase;

public class ConfirmEx1 {

	public static void main(String[] args) {
		// 1���� 100������ ���� �߿��� 3�� ����� ����
		int sum=0;
		for(int i=1; i<=100; i++) {  // int i=3; i<=100; i+=3 ���� �ص� ���� ����.
			if(i%3 == 0) {
			sum+=i;
			}
		}
		System.out.println("1���� 100���� �߿� 3�� ����� ��= " + sum);
	}

}

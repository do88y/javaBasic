package JavaBase;

public class ForEx5 {

	public static void main(String[] args) {
		/*for(int i=1; i<=10; i++) {  // �̴�� i ����ϸ� 1~10���� ��� ��µȴ�.
			if(i==5) {  // 4���� ������  5�� ������ �� ���ǿ� �������� �ʾƼ� break�� �ɸ���.
				break;
			}
			System.out.println(i);
		}*/
		
		int sum=0;
		int i;  // ���������� �ʱ�ȭ �� �߰�ȣ �ۿ��� ����Ϸ��� ��� �Ұ�, ������ �߰�ȣ �ۿ��� �ϸ� ����
		for(i=1; i<=100; i++) {
			sum+=i;
			if(sum>3500) {  // ���� 3500�� �������� ����� ���ؾ� �ϴ°�?
				System.out.println("����=" + i);
				break;
			}
		}  // for��
		
	}

}

package JavaBase;

public class ForEx10 {

	public static void main(String[] args) {
		int sum;
		for(int ost=1; ost<=16; ost++) {
			for(int pig=1; pig<=16; pig++) {
				sum=ost*2+pig*4;  // Ÿ���� ������ �ٸ� ����
				if(sum==56 && ost+pig==17)  // �� �� ������ �� ���
					System.out.println("���� " + pig + "����, Ÿ�� " + ost + "����");
			}
		}

	}

}

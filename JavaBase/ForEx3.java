package JavaBase;

public class ForEx3 {

	public static void main(String[] args) {
		/*System.out.println("�ζ� �ڵ� ��ȣ ������");
		for(int i=1; i<=6; i++) {
			int num=(int)(Math.random()*45)+1;  // ���� �߻�(0~1������ ���� �߿� �������� �߻�)
			System.out.println(num);
		}*/
		
		System.out.println("�ζ� �ڵ� ��ȣ ������");
		int[] lotto=new int[6];
		boolean run=true;
		while(run) {
			for(int i=0; i<lotto.length; i++) {
				lotto[i]=(int)(Math.random()*45)+1;  // ���� �߻�(0~1������ ���� �߿� �������� �߻�)
			}
			run=false;
			for(int a=0; a<lotto.length-1; a++) {  // �ϳ��� ���ϱ� ������ 4���� ���ϸ� ��.
				for(int b=a+1; b<lotto.length; b++) {
					if(lotto[a] == lotto[b]) {  // ó���� a�� 0, b�� 1�� ����. ���� ��
						run=true;
					}
				}
			}
		}  // while��
		for(int i=0; i<lotto.length; i++) {
			System.out.println(lotto[i]);
		}
	}
			
}

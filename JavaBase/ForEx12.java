package JavaBase;

public class ForEx12 {

	public static void main(String[] args) {
	Outer: for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.println(i + "," + j + "= " + i*j);
				if(i*j==15) {
					break Outer;  // ���� for���� Ż���ϰ� �ܺ� for���� Ż�� �� �ϱ� ������ Ż���� �� �ֵ��� outer�� Ż���� �� ����
				}
			}  //���� for��
		}  // �ܺ� for��
		System.out.println("���α׷� ����");
	}
			

}

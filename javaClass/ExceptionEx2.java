package javaClass;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			int[] nums= {20,74,65,25,30};
			System.out.println(nums[5]);  // �迭�� 4��° �� �ۿ� ���� ������ �������� ���� try catch�� ����ش�.
		}catch(ArrayIndexOutOfBoundsException e) {  // ��ȣ �ȿ� ������ ���� ����
			System.out.println("�迭�� �ε��� ���� ������ϴ�");
		}

	}

}

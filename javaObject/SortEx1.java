package javaObject;

public class SortEx1 {

	public static void main(String[] args) {
		int[] nums= {23,7,36,12,78};
		int temp;
		// ��Ʈ �� �ڷ����
		System.out.println("��Ʈ �� �ڷ�");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + "  ");
		}
		// ��Ʈ �˰��� ����
		for(int a=0; a<nums.length-1; a++) {  // �ϳ��� ���ϱ� ������ 4���� ���ϸ� ��.
			for(int b=a+1; b<nums.length; b++) {
				if(nums[a] > nums[b]) {  // ó���� a�� 0, b�� 1�� ����. ���� ��
					temp=nums[a];
					nums[a]=nums[b];
					nums[b]=temp;  // a�� b���� ũ�� �ٲ�� �ȴ�.
				}
			}
		}
		System.out.println("\n��Ʈ �� �ڷ�"); // \n->�ٹٲ�
		// ��Ʈ �� �ڷ����
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + "  ");
		}

	}

}

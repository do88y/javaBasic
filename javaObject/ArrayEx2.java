package javaObject;

public class ArrayEx2 {

	public static void main(String[] args) {
		int[] scores=new int[5];  // �迭�� ������ ���ÿ� �ʱⰪ�� ������ �ִ�. ������ ��Ҹ� �����Ϸ��� ���� ����־���ϱ� ����.
		scores[0]=70;
		scores[2]=90;
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}

	}

}

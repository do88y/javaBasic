package javaObject;

public class ArrayEx1 {

	public static void main(String[] args) {
		int[] scores= {78,96,80,63,86};  // �迭�� �ʱ�ȭ. ���� ���� ������ �� �ִ� ������ ����Ÿ������ ����Ǳ� ������ �������� ���� ��. []�� Ÿ�԰� ���� ����ʿ� �ٿ��� �ȴ�.
		for(int i=0; i<scores.length; i++) {  // index�� 0���� �����ϱ� ������ <=�� �ƴ϶� <��� �Է��ؾ� �Ѵ�. scores.length�� �迭�� ����ŭ �ڵ����� �־� ��
		System.out.println(scores[i]);  // 1�� �þ ������ 4����Ʈ ������ ���� ������.
		}
	}

}

package javaObject;

public class ArrayEx7 {

	public static void main(String[] args) {
		// ���� for��
		int[] scores= {78,80,90,75,60};
		int sum=0;
		double avg;
		for(int score:scores) {  // score ������  ���� ��. scores�� �迭�� ���� ���ʴ�� �����ͼ� score������ �ϳ��� �־� ��
			sum+=score;
		}
		avg=(double)sum/scores.length;
		System.out.println("����: " + sum);
		System.out.println("���: " + avg);
		

	}

}

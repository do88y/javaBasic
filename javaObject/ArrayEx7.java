package javaObject;

public class ArrayEx7 {

	public static void main(String[] args) {
		// 향상된 for문
		int[] scores= {78,80,90,75,60};
		int sum=0;
		double avg;
		for(int score:scores) {  // score 변수는  재사용 됨. scores가 배열의 수를 차례대로 가져와서 score변수에 하나씩 넣어 줌
			sum+=score;
		}
		avg=(double)sum/scores.length;
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		

	}

}

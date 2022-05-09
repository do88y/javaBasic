package javaObject;

public class ArrayEx3 {

	public static void main(String[] args) {
		int[] scores= {85,96,60,85,77};  // 총점이랑 평균 계산하는 문제
		int sum=0;
		double avg;
		for(int i=0; i<scores.length; i++) {
			sum+=scores[i];
		}
		avg=(double)sum/scores.length;  // (double)이 없으면 80.0으로 출력 됨. sum이랑 scores의 타입이 정수이기 때문.
		System.out.println("총점= " + sum);
		System.out.println("평균= " + avg);

	}

}

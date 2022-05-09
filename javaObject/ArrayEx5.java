package javaObject;

public class ArrayEx5 {

	public static void main(String[] args) {
		// 일정 점수 이상인 합격자 수 구하기
		int[] scores= {78,96,85,60,90,82,70,83,55,73};
		int count=0;
		for(int i=0; i<scores.length; i++) {
			if(scores[i]>=80) {
				count++;
			}
		}
		System.out.println("합격자수=" + count);
		
	}

}

package javaObject;

public class ConfirmEx2 {

	public static void main(String[] args) {
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}  // {{95,86},{83,92,96},{78,83,93,87,88}}로 표현 할 수도 있다
		};

		int sum=0;
		double avg=0.0;
		int count=0;
		for(int i=0; i<array.length; i++) {  // array.length->3  // i는 행
			for(int j=0; j<array[i].length; j++) {  // j는 열
				sum+=array[i][j];
				count++;  // 평균 구할 때 숫자로 나눠야하기 때문에 count를 세준다.
			}
		}
		avg=(double)sum/count;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
	}

}

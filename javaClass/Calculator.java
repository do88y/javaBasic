package javaClass;
// 계산기
public class Calculator {
	// 배열을 매개변수로 받아서 처리하는 메서드
	int sum1(int[] values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}

	//매개변수로 데이터를 받아서 처리하는 메서드
	int sum2(int num1, int num2, int num3) {
		int sum=0;
		sum=num1+num2+num3;
		return sum;
	}
	
	// 매개변수의 수를 모를 경우 처리하는 메서드
	int sum2(int ... nums) {  // 배열이 아니지만 매개변수의 수만큼 알아서 배열로 만들어줌
		int sum=0;
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
		}
		return sum;
	}
		
		// 배열을 매개변수로 받아서 평균을 구하는 메서드
		double avg1(int[] values) {
			int sum=sum1(values);  // 클래스 내부에서 메서드 호출
			double avg=(double)sum/values.length;
			return avg;
		}
		// 매개변수의 수를 모를 경우 평균을 구하는 메서드
		double avg2(int ... nums) {  // 클래스 내부에서 메서드 호출
			int sum=sum2(nums);
			double avg=(double)sum/nums.length;
			return avg;
		}

	}
	

package javaClass;
// ����
public class Calculator {
	// �迭�� �Ű������� �޾Ƽ� ó���ϴ� �޼���
	int sum1(int[] values) {
		int sum=0;
		for(int i=0; i<values.length; i++) {
			sum+=values[i];
		}
		return sum;
	}

	//�Ű������� �����͸� �޾Ƽ� ó���ϴ� �޼���
	int sum2(int num1, int num2, int num3) {
		int sum=0;
		sum=num1+num2+num3;
		return sum;
	}
	
	// �Ű������� ���� �� ��� ó���ϴ� �޼���
	int sum2(int ... nums) {  // �迭�� �ƴ����� �Ű������� ����ŭ �˾Ƽ� �迭�� �������
		int sum=0;
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
		}
		return sum;
	}
		
		// �迭�� �Ű������� �޾Ƽ� ����� ���ϴ� �޼���
		double avg1(int[] values) {
			int sum=sum1(values);  // Ŭ���� ���ο��� �޼��� ȣ��
			double avg=(double)sum/values.length;
			return avg;
		}
		// �Ű������� ���� �� ��� ����� ���ϴ� �޼���
		double avg2(int ... nums) {  // Ŭ���� ���ο��� �޼��� ȣ��
			int sum=sum2(nums);
			double avg=(double)sum/nums.length;
			return avg;
		}

	}
	

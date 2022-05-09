package javaObject;

public class ForEx1 {

	public static void main(String[] args) {
		int[] nums= {25,78,36,45,30};
		int sum=0;
		/*for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
		}*/
		for(int num:nums) {
			sum+=num;
		}
		System.out.println("รัมก= " + sum);

	}

}

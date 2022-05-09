package javaObject;

public class ArrayEx9 {

	public static void main(String[] args) {
		// 다차원 배열
		int [][] nums=new int[2][3];
		nums[0][0]=10;
		nums[1][1]=50;
		for(int a=0; a<nums.length; a++) { 
			for(int b=0; b<nums[a].length; b++) {
				System.out.println(nums[a][b]);
			}
		}

	}

}

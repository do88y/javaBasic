package javaObject;

public class ArraycopyEx2 {

	public static void main(String[] args) {
		int[] nums1= {10,20,30};
		int[] nums2=new int[5];
		
		System.arraycopy(nums1, 0, nums2, 0, nums1.length);  // arraycopy라는 자바에서 제공한 메소드 이용한 것
		
		for(int i=0; i<nums2.length; i++) {
			System.out.println(nums2[i] + "  ");
		}

	}

}

package javaObject;

public class ArraycopyEx1 {
//�迭����
	public static void main(String[] args) {
		int[] nums1= {10,20,30};  // int���� ������ ����ִ�.
		int[] nums2=new int[5];
		for(int i=0; i<nums1.length; i++) {
			nums2[i]=nums1[i];
		}
		for(int i=0; i<nums2.length; i++) {
			System.out.println(nums2[i] + "  ");
		}
	}

}

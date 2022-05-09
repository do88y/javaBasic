package javaObject;

public class SortEx1 {

	public static void main(String[] args) {
		int[] nums= {23,7,36,12,78};
		int temp;
		// 소트 전 자료출력
		System.out.println("소트 전 자료");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + "  ");
		}
		// 소트 알고리즘 구현
		for(int a=0; a<nums.length-1; a++) {  // 하나씩 비교하기 때문에 4번만 비교하면 됨.
			for(int b=a+1; b<nums.length; b++) {
				if(nums[a] > nums[b]) {  // 처음엔 a에 0, b에 1이 들어간다. 둘을 비교
					temp=nums[a];
					nums[a]=nums[b];
					nums[b]=temp;  // a가 b보다 크면 바뀌게 된다.
				}
			}
		}
		System.out.println("\n소트 후 자료"); // \n->줄바꿈
		// 소트 후 자료출력
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + "  ");
		}

	}

}

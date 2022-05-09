package javaObject;

public class ConfirmEx1 {

	public static void main(String[] args) {
		// 예제 1번 내가 푼 것
		int max=0;
		int temp;
		int[] array= {1,5,3,8,2};
		
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(i>j) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				max=array[0];
			}
		}
		
		System.out.println("max: " + max);
		
		

	}

}

package javaClass;

public class ExceptionEx2 {

	public static void main(String[] args) {
		try {
			int[] nums= {20,74,65,25,30};
			System.out.println(nums[5]);  // 배열이 4번째 값 밖에 없기 때문에 에러나는 것을 try catch로 잡아준다.
		}catch(ArrayIndexOutOfBoundsException e) {  // 괄호 안에 내용이 에러 내용
			System.out.println("배열의 인덱스 값이 벗어났습니다");
		}

	}

}

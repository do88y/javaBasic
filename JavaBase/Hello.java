package JavaBase;

import javaClass.Account;

/**
 * 
 * @author 서슬기
 *
 */
public class Hello {

	public static void main(String[] args) {
		Account chulsu=new Account(); // 같은 패키지 안에서는 클래스 improt 가능
		  // 콘솔에 출력하는 실행문
		System.out.println("안녕하세요");
		System.out.println("반갑습니다. \n어서오세요.");  // \n-> 줄바꿈
//		System.out.println("철수가 말했다 "안녕"이라고"); ->안녕을 변수로 인식해서 오류가 난 것
		// 철수가 말했다 "안녕"이라고 ->이렇게 출력하려면
		System.out.println("철수가 \t말했다 \"안녕\"이라고");  // \-> 이스케이프 시퀀스. 뒤에 오는 문자열을 그대로 콘솔로 보내는 것.  \t-> 탭키를 출력

	}

}

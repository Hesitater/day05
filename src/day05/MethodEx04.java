package day05;

import java.util.Arrays;

public class MethodEx04 {
	public static void main(String[] args) {
		
		//배열을 매개 변수로 전다하고 받는 방법.
		//int[] arr; 배열을 이름으로 전달, 변수명으로 전달
		
		int arr[] = {1,2,3,4,5}; // int[] arr = new int [5]
		method01(arr);
		
		
		String[ ] arr02= method02();
		System.out.println(Arrays.toString(arr02));
		
		//호출
		int[] iArr =method03(arr);
		System.out.println(Arrays.toString(iArr));
		
		
	}
	
	
	//매개변수로 배열을 받는 메서드
	static void method01(int[] a) { // 배열의 이름을 전달한다는 느낌  정수 void method01(int a)
		
		System.out.println(Arrays.toString(a));
	}
	
	// 배열을 반환유형으로 돌ㄹ주는 메서드
	static String[] method02() { //문자열 돌려준다
		
		String[] arr = {"월", "화", "수"};
		
		return arr;
	}

	
	//3. int배열을 매개변수로 받고, 
    //	 안에 들어있는 원소 값도 복사 해서 전달받은 배열의 2배크기를 만들어서 돌려 주는 method03()
	// ex) [1,2,3] -> [1,2,3,0,0,0]
	
	// 정적 반환유형 메서드03(배열) {
	static int[] method03(int[] arr ) {
		
		int[] iArr = new int[arr.length*2];
		
		for(int i = 0; i <arr.length; i++) {
			iArr[i] = arr[i];
			
		}
		return iArr; //변수명으로 리턴..
		
//		return null;  //처음에 오류 방지..? 배열의 리턴값 기본
	}
	
}

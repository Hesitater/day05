package day05;

public class MethodEx02 {
	public static void main(String[] args) {

		/*
		 * 매개변수 
		 *   1. 매개변수는 메서드를 호출할 떄 값을 전달하는 매개체 입니다.
		 *  2. 메서드의 소괄호 안에 몇개를 입력 받을지 결정합니다.
		 * 
		 */

//		int sum = 0;
//		int end = 10;
//		for (int i = 1; i <= end; i++) {
//			sum += i;
//		}

		calSum(10);
		System.out.println("1~10까지합:" + calSum(10));	// 한번 설정하면 그 뒤로 사용가능함
		System.out.println("1~100까지합:" + calSum(100));  
		System.out.println("1~30까합 : " + calSum(30));
		
		int result = calSum2(10,20);
		System.out.println("10~20까지합:" + result);
		
		String result2 = calSum3(1, 10, "가");
		System.out.println(result2);
		
		
		
		
//		calSum(10);   //  calSum(int end) 에서 int end 에 10을 넣은것과 같다
//		calSum2(10,20); //  int calSum2(int start, int end) 에 순차적으로 10, 20 대입
//		calSum3(1, 10, "가");
		
	}

	
	static int calSum(int end) { // 정수 하나만 받고싶으면 int calSum(int end)
		
		int sum = 0;
		for (int i = 1; i <= end; i++) {
			sum += i;
		}
//		return 0;
		return sum;
	}
	
	//시작값 받고 끝값 받아서 시작값~끝값 까지의합
	
	static int calSum2(int start, int end) {
		
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
			
		}
		
//		return 0;
		return sum;
	}
	
	//3개 받는데 문자열도..~?!
	
	static String calSum3(int start, int end,String s) {
		
		String str = "";   //공백 초기값
	
		for(int i = start; i <= end; i++) {
			str += s;
			
		}
		
		return str;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

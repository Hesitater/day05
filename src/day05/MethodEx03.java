package day05;

public class MethodEx03 {
	public static void main(String[] args) {
		
		/*
		 * 반환유형 
		 * 1. 반환유형은 메서드가 실행한 결과를 돌려주는 값에 대한 type입니다.
		 * 2. 반환유형이 있는 메서드는 호출문이 하나의 값이기 때문에 다른 메서드ㅢ 매개값으로 전달 됩니다.
		 *    ex) println()  
		 * 3. 반환유형이 없는 메서드는 반환유형 자리에 void 라고 적습니다.
		 * 4. 모든 메서드는 return을 만나면 메서드의 종료입니다 때문에 return아래에 코드작성이 불가능 합니다.
		 */
	
//		System.out.println(sum(1,2));
		
		int result = sum (sum(1,2), sum(3,4) );
		System.out.println("결과:" + result);
		
		//자주하는실수 void형 메서드는 단순히 호출했을때 실행하고 끝이라 출력할께 없다
//		System.out.println(sum2(1,2) );
//		int a = sum2(1,2);
		
		sum2(1,2);  //  void 형 메서드는 단순히 호출만 가능
		sum3();     // void 형 메서드느  단순히 호출만 가능
					
		
		noReturn("짬뽕은안되나요");  // void값도 return 가능 그냥 그자리에서 종료
		noReturn("짜장면먹고싶네");
		
	}
	
	
	static int sum (int a, int b) {
		return a + b;
		
	}
	
	//  2개의 값을 출력해주는 메서드  돌려주지 않으니 return 을 안써도 됨
	static void sum2(int a, int b) {
			System.out.println(a + " + " + b + " = " + (a+b) );
	
	}
	
	
	static void sum3() { //반환변수, 매개변수도 없는 유형
			System.out.println(" 3 + 1 = 4");
		
	}
	
	
	static void noReturn(String s) {
			// 특정조건에 부합 할때 함수의 종료
		
			if(s.equals("짜장면먹고싶네")) {
				System.out.println("맛잇게 드세요~!");
				return; //즉시 함수의 종료  return아래 문장에는 프로그램 실행코드를 적을 수 없다
			
			}
		
			System.out.println("짜장면먹고싶네 를 전달하세요"); 
		
		}
	
	
	
}

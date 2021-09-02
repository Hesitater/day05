package day05;

public class MethodEx01_ {
	public static void main(String[] args) {

		// 메서드는 메서드 내부에 만들 수 없습니다.
		// main밖, class안 어디서든 선언할 수 있습니다.

//		int sum = 0; 					// 그대로 int calSum(){ 아래로
//		for(int i = 1; i <= 10; i++) {
//			sum += i;
//		}

		// 호출할떄는 이름만

		System.out.println("1~10까지 합:" + calSum());
		System.out.println("1~10까지 합:" + calSum());

//		calSum();
		int sum = calSum(); // 반환이 있는 메서드는 결과를 받아서 사용 할 수 있다.

		System.out.println("결과:" + sum);

		String str = randomStr();
		System.out.println("결과:" + str);

		char c = randomStr2();
		System.out.println("결과:" + c);

	}
	// 입력되는건없고

	static int calSum() {

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}

		return sum; // 반환

	}

	static String randomStr() {
		String str = "";
		for (char c = 'A'; c <= 'Z'; c++) {
			str += c;
		}
		return str;
	}

	static char randomStr2() {
		char c = 0;

		double d = Math.random(); // 0~1미만 실수형
		if (d > 0.66) {
//			 c = 'A';
			return 'A';
		} else if (d > 0.33) {
//			 c = 'B';
			return 'B';
		} else {
//			 c = 'C';
			return 'C';
		}

//		 return c;                        허허..
	}

	static char randomStr3() {
		char c = 0;

		double d = Math.random(); // 0~1미만 실수형
		if (d > 0.66) {
			return 'A';
		} else if (d > 0.33) {
			return 'B';
		} else {
			return 'C';
		}

//		 return c;                        허허..

	}
}

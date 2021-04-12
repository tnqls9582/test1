package day2_practice;

public class Day2_Practice {

	public static void main(String[] args) {
		// ----MEMO----
		// 정수 int
		// 실수 double
		// 논리 boolean
		// 문자 String

		// --------------
		// 산술연산자 연습
		int num1, num2;
		num1 = 5;
		num2 = 3;
		int result1;

		result1 = num1 + num2; // 8
		System.out.println("+결과 : " + result1);

		result1 = num1 - num2; // 2
		System.out.println(result1);

		result1 = num1 * num2; // 15
		System.out.println(result1);

		result1 = num1 / num2; // 1
		System.out.println(result1);

		result1 = num1 % num2; // 2
		System.out.println(result1);

		double var1, var2;
		var1 = 7.2;
		var2 = 3.5;
		double result2;

		result2 = var1 / var2;
		System.out.println(result2);

		result2 = var1 % var2;
		System.out.println(result2);

		// ---------------
		// String 연습
		String strVar1, strVar2;
		strVar1 = "집에서 하니까";
		strVar2 = " 딴짓하게 되네";
		System.out.println(strVar1 + strVar2);

		String strVar3;
		strVar3 = strVar1 + strVar2;
		System.out.println(strVar3);

		// ---------------
		// 비교연산자 연습
		int num3, num4;
		num3 = 10;
		num4 = 20;
		boolean result3;

		result3 = num3 > num4; // f
		System.out.println(result3);

		result3 = num3 == num4; // f
		System.out.println(result3);

		result3 = num3 != num4; // t
		System.out.println(result3);

		// ----------------
		// 대입연산자 연습
		int num5, num6;
		num5 = 6;
		num6 = 4;
		int result4;

		result4 = num5 += num6; // 10
		System.out.println(result4);

		result4 = num5 *= num6; // 40
		System.out.println(result4);

		result4 = num5 /= num6; // 10
		System.out.println(result4);

		result4 = num5 %= num6; // 2
		System.out.println(result4);

		// ---------------
		// 논리연산자 연습
		boolean result5;

		result5 = true && true; // t
		System.out.println(result5);
		result5 = true && false; // f
		System.out.println(result5);
		result5 = false && false; // f
		System.out.println(result5);

		result5 = true || true; // f (x) -> t (o)
		System.out.println(result5);
		result5 = true || false; // t
		System.out.println(result5);
		result5 = false || false; // t (x) -> f (o)
		System.out.println(result5);

		result5 = (6 > 2) && (6 != 2); // t
		System.out.println(result5);
		result5 = (6 > 2) && (6 == 2); // f
		System.out.println(result5);

		result5 = (6 > 2) || (6 != 2); // f (x) -> t (o)
		System.out.println(result5);
		result5 = (6 > 2) || (6 == 2); // t
		System.out.println(result5);

		boolean var3 = false; // t
		System.out.println(!var3);

		// ~~~~~~부족한부분~~~~~~
		// - 비교연산자 -
		// a == b (두 값을 비교해서 같으면 t 다르면 f)
		// a != b (두 값을 비교해서 같으면 f 다르면 t)

		// * 논리연산자 *
		// 1. &&(AND 연산자) : a && b
		//   a,b 모두 t면 결과는 t
		//   a,b 둘 중 하나라도 f면 결과는 f
		//   - f가 있으면 f!
		// 2. ||(OR연산자) : a || b
		//   a,b 둘 중 하나라도 t면 결과는 t
		//   a,b 모두 f면 결과는 f
		//   - t가 있으면 t!
		// 3. !(NOT 연산자) : !a
		//   a가 t면 f로
		//   a가 f면 t로
		//   - 반대로!

	}

}

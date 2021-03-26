package ch14;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		Calc calc = new CompleteCalc(); // 타입을 상속받음
		CompleteCalc complete = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		complete.showInfo();
		calc.description(); 
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));
	}

}

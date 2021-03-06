package ch14;

public interface Calc {
//인터페이스 ; 연결점 ; ex 리모콘 등 
	double PI = 3.14; //public static final 자동으로 붙음 상수화
	int ERROR = -999999999;
	
	int add(int num1, int num2);//모든 메서드가 추상메서드로 선언됨 public abstract
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("정수의 사칙연산을 제공합니다.");
		myMethod();
	}//default 메서드 *재정의 가능
	
	static int total(int[] arr) {
		
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		myStaticMethod();
		return total;
	}//정적 메서드
	
	// private 메서드 *재정의 x 단지 interface 안에서 사용하는 메서드
	private void myMethod() {
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
	
	
}
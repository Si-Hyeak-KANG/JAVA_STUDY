package ch11;

public interface Calc {
//인터페이스 ; 연결점 ; ex 리모콘 등 
	double PI = 3.14; //public static final 자동으로 붙음 상수화
	int ERROR = -999999999;
	
	int add(int num1, int num2);//모든 메서드가 추상메서드로 선언됨 public abstract
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}

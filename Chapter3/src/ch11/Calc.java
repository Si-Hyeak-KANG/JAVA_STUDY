package ch11;

public interface Calc {
//�������̽� ; ������ ; ex ������ �� 
	double PI = 3.14; //public static final �ڵ����� ���� ���ȭ
	int ERROR = -999999999;
	
	int add(int num1, int num2);//��� �޼��尡 �߻�޼���� ����� public abstract
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
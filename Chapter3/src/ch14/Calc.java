package ch14;

public interface Calc {
//�������̽� ; ������ ; ex ������ �� 
	double PI = 3.14; //public static final �ڵ����� ���� ���ȭ
	int ERROR = -999999999;
	
	int add(int num1, int num2);//��� �޼��尡 �߻�޼���� ����� public abstract
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		System.out.println("������ ��Ģ������ �����մϴ�.");
		myMethod();
	}//default �޼��� *������ ����
	
	static int total(int[] arr) {
		
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		myStaticMethod();
		return total;
	}//���� �޼���
	
	// private �޼��� *������ x ���� interface �ȿ��� ����ϴ� �޼���
	private void myMethod() {
		System.out.println("myMethod");
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
	
	
}
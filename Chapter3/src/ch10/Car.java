package ch10;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {} // 구현부가 있는데 구현내용만 없는 것 . 추상메서드 아님 . 오류 아님 -> 필요한 경우 재정의 ..훅메서드 
	
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}//템플릿 메서드 재정의 X
}
 
package ch16T.gamelevel;

public class BeginnerLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� ��������");
	}

	@Override
	public void turn() {
		System.out.println("�� �ȵ�����");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******�ʱ��� �����Դϴ�.******");
	}
	
}
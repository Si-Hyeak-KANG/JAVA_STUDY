package ch08T;

public class Guest {

	public String name;
	public int age;
	public int height;
	public int weight;
	public String gender;
	
	public void showGuestInfo() {
		System.out.println("키가 " + height +" 이고 " +"몸무게가 "+ weight + "킬로인 " + gender + "이 있습니다.");
		System.out.println("이름은 " + name + "이고 나이는 " + age + "세 입니다.");
	} 
}

package ch03;

public class VIPCustomer extends Customer {

	double salesRatio;
	private String agentID;
	
	/*public VIPCustomer() {
//		super();//하위클래스가 상위클래스의 참조값을 가짐. -- 안써도 됨. 자동 default
		super(0, "no-name");//생성자를 명시적으로 호출
		bonusRatio = 0.05;
		salesRatio =0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer() call");
	}*/
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);

		bonusRatio = 0.05;
		salesRatio =0.1;
		customerGrade = "VIP";
		
		System.out.println("VIPCustomer(int, String) call");
	}
	
	public String getAgentID() {
		return agentID;
	}
}

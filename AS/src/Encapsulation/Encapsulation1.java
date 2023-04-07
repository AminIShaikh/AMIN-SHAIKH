package Encapsulation;

public class Encapsulation1 {

	private int EmpId;
	
	public void getEmpId(int eid) {
		
		this.EmpId=eid;
	}
	
	public int setEmpId() {
		
		System.out.println(EmpId);
		return EmpId;
	}
	
	public static void main(String[] args) {
		
		Encapsulation1 x = new Encapsulation1();
		x.getEmpId(101);
		x.setEmpId();
	}
}

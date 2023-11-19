package class8;

public class Employee {
	
	private int id;
	private String name;
	private String role;
	private String dept;
	
	public Employee() {
		System.out.println("constructor!!!!");
	}
	
	public Employee(int idvalue, String namevalue, String rolevalue, String deptvalue) {
		this.id = idvalue;
		this.name = namevalue;
		this.role = rolevalue;
		this.dept = deptvalue;
		System.out.println("constructor!!!!");
	}
	
	//setter
	public void setId(int idvalue) {
		if(idvalue > 20) {
			System.out.println("not valid empid");
		}else {
			this.id=idvalue;
			
		}
		
	}
	
	
	//getter
	public int getId() {
		return this.id;
	}
	
	//setter
		public void setname(String namevalue) {
			this.name=namevalue;
		}
		
		
		//getter
		public String getname() {
			return this.name;
		}


		public String getRole() {
			return role;
		}


		public void setRole(String role) {
			this.role = role;
		}


		public String getDept() {
			return dept;
		}


		public void setDept(String dept) {
			this.dept = dept;
		}

}

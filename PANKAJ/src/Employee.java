
public class Employee {

	
		int Eno,salary;
		Phone phone;
		public int getEno() {
			return Eno;
		}
		public void setEno(int eno) {
			Eno = eno;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public Phone getPhone() {
			return phone;
		}
		public void setPhone(Phone phone) {
			this.phone = phone;
		}
		@Override
		public String toString() {
			return "Employee [Eno=" + Eno + ", salary=" + salary + ", phone=" + phone + "]";
		}
		
		

	

}

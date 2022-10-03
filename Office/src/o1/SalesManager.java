package o1;


public class SalesManager extends Employee {
		  
		int target;
		
		
		
		public SalesManager() {
			super();
			
		}
		
		public SalesManager(String name, int salary, int target, int medicalInsurance) {
			super(name,salary,medicalInsurance);
			this.target = target;
		}
		public int target() {
			return target;
		}
		public void setFileTarget(int target) {
			this.target = target;
		}
		
		
		public void worksOnGrowth()
		{
			System.out.println(name); 
			System.out.println(target);	
			System.out.println(salary);
			
		}
		
		@Override
		public void setSalary(int incentive)
		{
			
			super.setSalary(super.getSalary()+incentive);
			
			
		}
		@Override
		public void setMedicalInsurance(int medicalInsurance)
		{
			
			super.setMedicalInsurance(super.getSalary()+(getSalary()*100));
			
			
		}
		
		
		
}

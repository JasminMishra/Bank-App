package o1;

public class Accountant extends Employee {
		  
		String fileName;
		
		
		
		public Accountant() {
			super();
			
		}
		
		public Accountant(String name, int salary, String fileName,int medicalInsurance) {
			super(name,salary,medicalInsurance);
			this.fileName = fileName;
		}
		public String getFileName() {
			return fileName;
		}
		public void setFileName(String fileName) {
			this.fileName = fileName;
		}
		
		
		public void worksOnTaxFile()
		{
			System.out.println(name); 
			System.out.println(fileName);	
			System.out.println(salary);
			System.out.println(medicalInsurance);
		
			
		}
		@Override
		public String toString() {
			return "Accountant [fileName=" + fileName + "]";
		}
		@Override
		public void setMedicalInsurance(int medicalInsurance)
		{
			
			super.setMedicalInsurance(super.getSalary()+(getSalary()*10));
			
			
		}
		
}


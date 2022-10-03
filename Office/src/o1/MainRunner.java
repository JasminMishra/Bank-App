package o1;

public class MainRunner {
	public static void main(String[] args) {
	
	
	Accountant accountant=new Accountant("Jasmin", 2000, "TaxFile", 2000000);
	accountant.worksOnTaxFile();
	
	
	Project faceBook=new Project("FaceBook Advertisents", 15);
	Developer developer=new Developer(faceBook, "Meta", "Ramesh",1500, 150000);
	developer.worksOnProject();
	
	SalesManager salesManager =  new SalesManager("Jass",10000,15000, 0);
	salesManager.worksOnGrowth();
	
	salesManager.setSalary(200);
	int s = salesManager.getSalary();
	System.out.println(s);
	
	salesManager.setMedicalInsurance(0);
	int i = salesManager.getMedicalInsurance();
	System.out.println(i);
	
	
	
}
}
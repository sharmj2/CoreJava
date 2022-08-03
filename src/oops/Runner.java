package oops;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Employee E1 = new Employee();
		E1.name = "Jaishree";
		E1.empId= 339262;
		E1.department="Testing";
		E1.Display();
		
		Employee E2 = new Employee("Anurag",339263,"Dev");
		E2.name = "Anurag";
		E2.empId=339263;
		E2.department="Dev";
		
		E2.Display();	
		
		Bank B = new Bank();
		BDABank BD = new BDABank();
		
		BD.displayAccountBalance();
		BD.ccBalance();
		
		Bank BBD = new BDABank();
		BBD.displayAccountBalance();
		
		BDABank BDB = new Bank();
		//Browser br = new browser
		Chrome ch = new Chrome();
		ch.displayBrowser();
		ch.openBrowser();
		ch.closeBrowser();*/
		
		CarInterface cInt = new CarInterface() {
			
			@Override
			public void stop() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void start() {
				// TODO Auto-generated method stub
				
			}
		};
		EncapsulationEx enc = new EncapsulationEx();
		enc.setName("Jaishree");
		enc.setAge(36);
		enc.setAddress("Bhopal");
		
		System.out.println(enc.getName() );
		System.out.println(enc.getAge() );
		System.out.println(enc.getAddress() );
		
	}

}

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1,"Defne");
	
		customerManager CustomerManager = new customerManager(new Customer(),new MilitaryCreditManager());
		CustomerManager.GiveCredit();
		
		Company company = new Company();
			company.setTaxNumber("1000");
	    		company.setAd("Arçelik");
	    		company.setId(2);
	    
	 	customerManager cm2 = new customerManager(new Person(),new TeacherCreditManager());
		
		CreditManager creditManager = new CreditManager();
        		creditManager.Hesapla();
        		creditManager.Save();
	}

}

package task3.payment.employee;

public class Developer extends Employee {
	   String programmingLanguage;
	   
	    Developer(String name, int id, double salary, String programmingLanguage) {
	        super(name, id, salary);
	        this.programmingLanguage = programmingLanguage;
	    }
	 
	    void display() {
	        super.display();
	        System.out.println("Language: " + programmingLanguage);
	    }

}

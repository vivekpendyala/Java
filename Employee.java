package lu;
public class Employee {
	
	String Name , City;
	int age;
	Employee(String N , String c , int a){
		Name = N;
		City = c;
		age = a;
	}
	void display() {
		System.out.println("The name is "+Name+" lives in "+City+"and age is "+age);
	}
	public static void main(String[] args) {
		Employee a = new Employee("Vivek","Hyderabad",20);
		Employee b = new Employee("LetsUpgrader","Mumbai",18);
		a.display();
		b.display();
	}
}

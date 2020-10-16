package lu;

import java.util.Scanner;

public class Tax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int day , month , year, age;
		double salary,tax=0;
		System.out.println("Enter name of the employee :");
		name = sc.nextLine();
		System.out.println("Enter date of birth in form as DD MM YYYY");
		day = sc.nextInt();
		month = sc.nextInt();
		year = sc.nextInt();
		System.out.println("Enter your salary");
		salary = sc.nextDouble();
		salary *= 12;
		if(salary >= 500000)
			tax = ( salary * 20 ) / 100;
		else if (salary >= 400000)
			tax = (salary * 15 ) / 100;
		else if (salary >= 300000 )
			tax = (salary * 10 ) / 100;
		else if(salary >= 200000)
			tax = (salary * 5) / 100 ;
		age = 2020 - year;
		System.out.println("Employee Name is :"+name+" age is :"+age+" annual salary is :"+salary+" Tax paid is :"+tax);
	}
}

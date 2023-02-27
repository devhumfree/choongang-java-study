package ch08;

public class EmployeeEx {
	
	public static void main(String[] args) {
		Employee[] emps = new Employee[5];
		
		emps[0] = new SalaryMan("jenny", 2000000);
		emps[1] = new SalaryMan("boston", 3000000);
		emps[2] = new HourlyEmployee("rose", 100, 800);
		emps[3] = new HourlyEmployee("cha", 200, 20000);
		emps[4] = new HourlyEmployee("honey", 300, 10000);
		
		for(Employee emp : emps) {
			int sal = emp.computePay();
			int bonus = emp.computeIncentive();
			System.out.println(emp.getName() + "의 급여명세서");
			System.out.println("급여: " + sal);
			System.out.println("Bonus: " + bonus);
		}
	}
}

class Employee{
	String name;
	double salary;
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	double calsalary(){
		return salary;
	}
}
class Manager extends Employee{
	double bonus;
	Manager(String name, double salary,double bonus){
		super(name,salary);
		this.bonus=bonus;
	}
	@Override
	double calsalary(){
		return super.calsalary()+bonus;
	}
}
class SeniorManager extends Manager{
	double travelAllowance;
	SeniorManager(String name,double salary,double bonus,double travelAllowance){
		super(name,salary,bonus);
		this.travelAllowance=travelAllowance;
	}
	@Override
	double calsalary(){
		return super.calsalary()+travelAllowance;
	}
}
class MultilevelInherDemo{
	public static void main(String args[]){
		SeniorManager sr= new SeniorManager("Ram",50000,1500,1000);
		System.out.println(sr.calsalary());
	}
}
	

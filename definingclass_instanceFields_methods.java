class employee{
	int empid;
	String name;
	long phno;
	String designation="employee";
	employee(int id,String empname,long phneno){
		empid=id;
		name=empname;
		phno=phneno;
	}
	void display(){
		System.out.println("Id: "+this.empid+" name: "+this.name+" phone number "+this.phno+" designation "+this.designation+"\n");
	}
};
class Class_demo{
	public static void main(String args[]){
		employee e=new employee(2234555,"XYZ",5555555553L);
		e.display();
	}
}

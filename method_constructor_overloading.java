class Overload_class{
	int i1;
	int i2;
	double d1;
	double d2;
	Overload_class(int a,int b){
		this.i1=a;
		this.i2=b;
		this.d1=0;
		this.d2=0;
		System.out.println("Integer class\n");
	}
	Overload_class(double a, double b){
		this.i1=0;
		this.i2=0;
		this.d1=a;
		this.d2=b;
		System.out.println("Double class\n");
	}
	int add(int a,int b){
		return a+b;
	}
	double add(double a,double b){
		return a+b;
	}
}
class Overload_demo{
	public static void main(String args[]){
		Overload_class o1=new Overload_class(5,6);
		Overload_class o2=new Overload_class(5.0,6.0);
		System.out.println(o1.add(10,20));
		System.out.println(o1.add(10.0,20.0));
		System.out.println(o2.add(13.45567534d,15.95245234d));
		System.out.println(o2.add(13,15));
	}
}

	

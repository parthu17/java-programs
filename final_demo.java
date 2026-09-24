/*final cannot inherit*/ class parent{
	/*final*/ void method(){
		System.out.println("Parent Class");
	}
}
class final_demo extends parent{
	/*final int i;
	final_demo(){
		i=10;
	}
	static{
		i=20;
	} has to be also static to be able to access it from static context*/
	/*void method(){
		System.out.println("Child Class");
	} cannot override method*/
	
	public static void main(String args[]){
		final_demo f=new final_demo();
		f.method();
		//i=20; does not work for final keyword
	}
}

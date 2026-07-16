class Defaultval{
	byte b;
	short sh;
	int i;
	long lon;
	char ch;
	String str;
	float f;/*hello*/
	double d;
	boolean bo;
	public static void main(String args[]){
		Defaultval d=new Defaultval();
		System.out.println("byte : "+d.b);
		System.out.println("short : "+d.sh);
		System.out.println("integer : "+d.i);
		System.out.println("long : "+d.lon);
		System.out.println("char : ["+d.ch+"]");
		System.out.println("string : "+d.str);		
		System.out.println("float : "+d.f);
		System.out.println("double : "+d.d);
		System.out.println("boolean : "+d.bo);
	}
}

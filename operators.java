import java.util.*;
class operators{
	public static void main(String args[]){
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Addition : "+(a+b));
		System.out.println("Subtraction : "+(a-b));
		System.out.println("Multiplication : "+(a*b));
		System.out.println("Division : "+(float)(a/b));
		System.out.println("Remainder : "+(a%b));
		System.out.println("Exponent : "+Math.pow(a,b));
		System.out.println("comparision : "+(a==b));
		System.out.println("not equal : "+(a!=b));
		System.out.println("greater than : "+(a>b));
		System.out.println("less than : "+(a<b));
		System.out.println("greater than equal : "+(a>=b));
		System.out.println("less than equal : "+(a<=b));
		bool con1=a>0;
		bool con2=b>0;
		System.out.println("logical and : "+(con1&&con2));
		System.out.println("logical or : "+(con1||con2));
		System.out.println("logical not : "+(!con1));
		System.out.println("Increment : "+(++a));
		System.out.println("Decrement : "+(--a));
	}
}

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
	}
}

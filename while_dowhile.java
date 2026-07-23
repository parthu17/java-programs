import java.util.*;
class while_dowhile{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
		int i=1;
		System.out.println("With While loop");
    int sum=0;
		while(i<=n){
			sum+=i;
			i++;

		}
    System.out.println("Sum of 1 to"+n+"is:"+sum);
		System.out.println("With Do-While loop");
		i=1;
		do{
			System.out.println(i);
			i++;

		}while(i<=n);
	}
	
}

import java.util.*;
class ExceptionHandler{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		try{
			int a=sc.nextInt();
			int b=sc.nextInt();
			float result=a/b;
			System.out.println("Result is: "+result);
		}
		catch(ArithmeticException e){
			e.printStactTrace();
		}
		catch(InputMismatchException e){
			e.printStackTrace();
		}
		catch(Exception e){
			System.out.println("Other exception");
		}
		finally{
			scclose();
		}
	}
}

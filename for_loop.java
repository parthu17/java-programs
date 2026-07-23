import java.util.*;
class for_loop{
  public static void main(String args[]){
		  System.out.println("Enter the number whose table you require");
		  Scanner sc=new Scanner(System.in);
		  int num=sc.nextInt();
		  for(int i=1;i<=10;i++){
			  System.out.println(num*i);
		  }
	}
}

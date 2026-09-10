import java.util.*;
class Array_sort{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int numbers[]=new int[n];
		for(int i=0;i<numbers.length;i++){
			System.out.println("Enter "+(i+1)+" element of array");
			numbers[i]=sc.nextInt();
		}
		for(int i=0;i<numbers.length-1;i++){
			for(int j=0;j<numbers.length-i-1;j++){
				if(numbers[j]>numbers[j+1]){
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted array");
		for(int i=0;i<numbers.length;i++){
			System.out.println(numbers[i]);
		}
		sc.close();
	}
}
		

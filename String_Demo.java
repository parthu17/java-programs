import java.util.*;
class String_Demo
{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentence");
		String sentence=sc.nextLine();
		int length=sentence.length();
		String lowerCaseString=sentence.toLowerCase();
		String upperCaseString=sentence.toUpperCase();
		//String reversed=sentence.reverse();
		String reversed=new StringBuilder(sentence).reverse().toString();
		String cleaned=sentence.replaceAll("//s+","").toLowerCase();
		String reversedCleaned=new StringBuilder(cleaned).reverse().toString();
		boolean isPalindrome=cleaned.equals(reversedCleaned);
		System.out.println("length: "+length);
		System.out.println("lowerCase "+ lowerCaseString);
		System.out.println("UpperCase "+upperCaseString);
		System.out.println("reversed string "+reversed);
		System.out.println("is Palindrome: "+isPalindrome);
		sc.close();
	}
}
		

import java.util.*;
class StringTokenizer_Demo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence=sc.nextLine();
		StringTokenizer st=new StringTokenizer(sentence);
		int wordCount=0;
		System.out.println("Words:");
		while(st.hasMoreTokens()){
			String word=st.nextToken();
			System.out.println(word);
			wordCount++;
		}
		System.out.println("Number of words "+wordCount);
	}
}
		

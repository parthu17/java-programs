import java.util.*;
class ProductCategories{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Set<String> hashset=new HashSet<>();
        Set<String> treeset = new TreeSet<>();
        int n;
        System.out.println("Enter the number of Product Categories");
        n =sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter String");
            String input=sc.nextLine();
            hashset.add(input);
            treeset.add(input);
        }
        System.out.println("Non duplicated unsorted values:" + hashset);
        System.out.println("Non duplicated alphabetically sorted values:" + treeset);
        sc.close();
    }
}

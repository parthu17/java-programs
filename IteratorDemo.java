import java.util.*;
class IteratorDemo{
    public static void main(String args[]){
        List<String> arrli = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of student names");
        n =sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++){
            System.out.println("Enter String");
            String input=sc.nextLine();
            arrli.add(input);
        }
        Iterator<String> itr = arrli.iterator();
        System.out.println("Enter the string to be removed");
        String stname = sc.nextLine();
        while(itr.hasNext()){
            String ele = itr.next();
            System.out.println(ele);
            if(ele.equals(stname)){
                itr.remove();
            }
        }
        ListIterator<String> listitr= arrli.listIterator();
        System.out.println("List forward traversal");
        while(listitr.hasNext()){
           System.out.println(listitr.next());
        }
        System.out.println("List Backward traversal");
        while(listitr.hasPrevious()){
            System.out.println(listitr.previous());
        }
        System.out.println("Enter the string to be updated");
        String str= sc.nextLine();
        System.out.println("Enter the string to update");
        String newstr = sc.nextLine();
        while(listitr.hasNext()){
            if(listitr.next().equals(str)){
                System.out.println(newstr);
                listitr.set(newstr);
            }
        }
        sc.close();
    }
}
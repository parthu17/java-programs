import java.util.*;

@FunctionalInterface
interface CheckEven{
    boolean check(int a);
}
class EvenNumberCheck{
    public static void main(String[] args) {
        CheckEven checker=(a)->a%2==0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be checked");
        int n = sc.nextInt();
        System.out.println("It is even?:"+checker.check(n));
        sc.close();
    }
}
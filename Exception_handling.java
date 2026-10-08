import java.util.*;
class Exception_handling{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("First");
            int a= sc.nextInt();
            System.out.println("Second");
            int b=sc.nextInt();
            float result=(float)a/b;
            System.out.println("Result is :"+result);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        catch(InputMismatchException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Unknown Exception");
        }
        finally{
            System.out.println("This is always executed");
            sc.close();
        }
    }
}
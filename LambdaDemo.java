@FunctionalInterface
interface Calculator{
    int calculate(int a,int b);
}
class LambdaDemo{
    public static void main(String args[]){
        Calculator add = (a,b)-> a+b;
        Calculator sub = (a,b)->a-b;
        Calculator mul =(a,b)->a*b;
        Calculator div =(a,b)->a/b;
        System.out.println("Addition is :"+add.calculate(3,4));
        System.out.println("Subtraction is :"+sub.calculate(3,4));
        System.out.println("Multiplication is :"+mul.calculate(3,4));
        System.out.println("Division is :"+div.calculate(3,4));
    }
}
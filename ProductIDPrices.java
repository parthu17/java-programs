import java.util.*;
class ProductIDPrices{
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Map <Long,Double> hashmap= new HashMap<>();
        Map <Long,Double> treemap =  new TreeMap<>();
        int n;
        System.out.println("Enter the number of Products");
        n =sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter the ID");
            long id= sc.nextLong();
            System.out.println("Enter the Price");
            double price = sc.nextDouble();
            hashmap.put(id,price);
            treemap.put(id,price);

        }
        System.out.println("Enter the ID of the product whose price is to be updated");
        long findid= sc.nextLong();
        System.out.println("Enter new price");
        double newprice = sc.nextDouble();
        if(hashmap.containsKey(findid)){
            hashmap.replace(findid,newprice);
            treemap.replace(findid,newprice);
        }
        else{
            System.out.println("Doesnot contain id");
        }
        System.out.println("Products(Non sorted order):");
        hashmap.forEach((key,value)->{
            System.out.println(key+ ": "+value);
        });
        System.out.println("Products(sorted order):");
        treemap.forEach((key,value)->{
            System.out.println(key+ ": "+ value);
        });
        sc.close();
    }
}
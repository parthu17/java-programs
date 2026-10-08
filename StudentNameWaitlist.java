import java.util.*;
class StudentNameWaitlist{
    public static void main(String args[]){
        List<String> arrli = new ArrayList<>();
        List<String> linkli = new LinkedList<>();
        arrli.add("name1");
        arrli.add("name2");
        arrli.add("name3");
        arrli.remove("name1");
        linkli.add("asd");
        linkli.add("jfkdsj");
        linkli.add("sdasd");
        linkli.remove("sdasd");
        System.out.println("ArrayList print:"+arrli);
        System.out.println("LinkedList print:"+linkli);
    }
}
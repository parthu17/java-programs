import java.util.*;
public class StreamAPI{
    public static void main(String args[]){
        List<Integer> marks = Arrays.asList(45, 78, 65, 32, 90, 55, 72, 88);
        System.out.println("Marks greater than 60:");
        marks.stream().filter(mark->mark>60).forEach(mark->System.out.println(mark));
    }
}
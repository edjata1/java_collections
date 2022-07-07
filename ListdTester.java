import java.util.LinkedList;
import java.util.Arrays;

public class ListdTester
{
   public static void main(String[] args)
   {
      LinkedList<String> lst1 = new LinkedList<>(Arrays.asList("Peter", "Paul", "Mary"));
      System.out.println(lst1);
      String res1 = Lists.removeFirst(lst1);
      System.out.println(res1);
      
      
   }
}
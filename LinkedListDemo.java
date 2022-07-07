import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo
{
   public static void main(String[] args)
   {
   
   LinkedList<String> list = new LinkedList<>();
   
   list.addFirst("Harry");
   list.addLast("Sally");
   System.out.println("List: " + list);
   list.getFirst();
   list.getLast();
   String removed = list.removeLast();
   System.out.println("Removed Last: " + removed);
   String removed2 = list.removeFirst();
   System.out.println("Removed First: " + removed2);
   
   ListIterator<String> iter = list.listIterator();
   iter.add("Empress");
   System.out.println(iter);
   
   }
}
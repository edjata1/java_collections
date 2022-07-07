import java.util.LinkedList;
import java.util.ListIterator;

/**
   This program demonstrates the LinkedList class.
*/
public class ListDemo
{  
   public static void main(String[] args)
   {  
      LinkedList<String> staff = new LinkedList<>();
      staff.addLast("Diana");
      staff.addLast("Harry");
      staff.addLast("Romeo");
      staff.addLast("Tom");
      
      // | in the comments indicates the iterator position

      ListIterator<String> iterator = staff.listIterator(); // |DHRT
      
      while(iterator.hasNext())
      {
         String word = iterator.next();
         if(word.length() > 0)
         {
         //gets number of letters in each word
         int tally = 0;
         tally = tally + word.length();
         System.out.println(tally + word);
        
         int maxWordSize = 0;
         for( int n = 1; n <= word.length(); n++)
         {
            maxWordSize = n;
             System.out.println(maxWordSize);
             if(maxWordSize == tally)
             {
               int total = 0;
               total = total + 1;
               System.out.println("Total: " + total);
             }
            
         }
         
         for(int i = 1; tally > word.length(); i++)
         {
            int total =0;
         }
         
         }
      }
      
      //iterator.next(); // D|HRT
      //iterator.next(); // DH|RT

      // Add more elements after second element
      
      iterator.add("Juliet"); // DHJ|RT
      iterator.add("Nina"); // DHJN|RT

      //iterator.next(); // DHJNR|T

      // Remove last traversed element 

      //iterator.remove(); // DHJN|T
     
      // Print all elements

      System.out.println(staff);
      System.out.println("Expected: [Diana, Harry, Juliet, Nina, Tom]");
      

      
   }
}
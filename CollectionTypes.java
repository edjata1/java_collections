import java.util.Collection;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Iterator;

class CollectionTypes{

   public static void main(String[] args){
   
      //The ArrayList class implements the Collection interface
      Collection<String> coll = new ArrayList<>();
      System.out.println(coll);
      
      //The TreeSet class also implements the collection interface
      coll = new TreeSet<>();
      System.out.println(coll);

      //gets the size of the collection. n is now 0
      int n = coll.size();
      System.out.println(coll);
      
      //adds elements to the collection
      coll.add("Harry");
      coll.add("Sally");
      System.out.println(coll);

      //Returns a string with all elements in the collection. s is now [Harry, Sally]
      String s = coll.toString();
      System.out.println(s);
      //invokes the toString method and prints[Harry, Sally]
      System.out.println(coll);
      
      //Removes an element from the collection, returning false if the elemnt is not present. b is false
      coll.remove("Harry");
      boolean b = coll.remove("Tom");
      System.out.println(coll);
      
      //Checks whether this collection contains given element. b is now true
      b = coll.contains("Sally");
      System.out.println(coll);
      
      //You can use the "for each" loop with any collection. This loop prints the elements on separate lines.
      for (String t : coll)
      {
         System.out.println("t is: " + t);
      }
      
      //You use an iterator for visiting the elements in the collection see 15.2.3
      Iterator<String> iter = coll.iterator();
      //iter.toString();
      System.out.println(iter);
      

   }   
}
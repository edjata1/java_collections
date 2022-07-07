import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorDemo
{
   public static void main(String[] args)
   {
   
   //Linked list object
   LinkedList<String> wordList = new LinkedList<>();
   //List Iterator object, Access elements inside the linked list. pointing between two elements. Iterating throw list
   ListIterator<String> wordListIterator = wordList.listIterator();
   
   //Iterator points before the first element.
   if (wordListIterator.hasNext())
   {
      //moving the iterator position with the .next method ad throws an exception if passed the end of list. 
      //will return if there is a next element
      wordListIterator.next();
   }
   
   //traverse all element in a linked list of strings with while loop
   while (wordListIterator.hasNext())
   {
      String words = wordListIterator.next();
      //get count length and print
   }
   
   //visiting all elements of linked list use for each loop
   for(String words : wordList)
   {
      //Do count word length, add to word length total
   }
   
   }
}   
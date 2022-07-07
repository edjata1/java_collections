import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;
import java.io.FileNotFoundException;

public class EmpressWordCounter{
            
            public static void titleHeader()
            {
            //Header for output
            String heading1 = "Word(s)";
            String heading2 = "Character Length";
            System.out.printf("%-15s %15s %n", heading1, heading2);            
            }
            
   public static void main(String[] args)
   {
   
      //remember add try catch
      try{
      
      //gets file
      File txtFileWords = new File("alice30.txt");
      
      System.out.println(txtFileWords);
      
      Scanner theReader = new Scanner(txtFileWords);
            //System.out.println(theReader);

      //Checks theReader object for text and assigns to word
      while (theReader.hasNextLine()){
      String words = theReader.next();
      
      //assigns word length to varia
      int wordLength = words.length();
            //System.out.println(words.length());
            System.out.println(wordLength);
            
            
      }
            
            

      theReader.close();
      
      }catch (FileNotFoundException e) {
         System.out.println("An error occurred.");
         e.printStackTrace();
       }
   
   }
}
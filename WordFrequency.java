import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
@Empress Djata
@version 1
This program reads a file and prints the frequency of word length.
*/

public class WordFrequency
{
   public static void titleHeader()
   {
      //Header for output
      String heading1 = "Word(s)";
      String heading2 = "Character Length";
      System.out.printf("%-15s %15s %n", heading1, heading2);            
   }
   
   public static void main(String[] args) 
    {
        //create hash map for wordLengthMapCounter
        HashMap<Integer, Integer> wordLengthMapCounter = new HashMap<Integer, Integer>();
        
        BufferedReader fileReader;
        
        try 
        {
            //set variables for count and current line
            int countTotalWords = 0;
            String currentLine = "";
            
            //Get text file to be read
            fileReader = new BufferedReader(new FileReader("text.txt"));

            //Will get new line, if it is the end of the file, it ends
            while ((currentLine = fileReader.readLine()) != null)
            {

                String[] words = currentLine.split(" ");
                //counting length
                countTotalWords += words.length;

                //for each loop to iterates through line and increments the map
                for (String word : words) {
                    int currentNumber = 0;
                    if (wordLengthMapCounter.get(word.length()) != null)
                        
                        currentNumber = wordLengthMapCounter.get(word.length());
                    
                    wordLengthMapCounter.put(word.length(), currentNumber + 1);
                }
            }


            


            titleHeader();
            // Iterates through the map and prints the amount of strings
            for (Map.Entry<Integer, Integer> curEntry : wordLengthMapCounter.entrySet())
            {
                //print formatted output
                System.out.printf("%-3d %20d %n", curEntry.getValue(), curEntry.getKey());
            }
            //close file reader
            fileReader.close();
        } 
        catch (IOException e) 
        {
            System.out.println("Requested file couldn't be found!");
        }
    }
/**
 
  ----jGRASP exec: java -ea WordFrequency
 Word(s)         Character Length 
 1                      1 
 16                     2 
 15                     3 
 7                      4 
 4                      5 
 4                      6 
 5                      7 
 2                      8 
 1                      9 
 1                     12 
 1                     13 
 
  ----jGRASP: operation complete.
*/
}

   
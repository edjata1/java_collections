import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
import java.util.HashMap;
//import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ParallelWordCount
{
    public static void main(String[] args)
        {
        HashMap<Integer, Integer> lengthCount = new HashMap<Integer, Integer>();

        BufferedReader bra;

        try {
            String currentLine;

            bra = new BufferedReader
                    (new FileReader("text.txt"));

            Scanner br = new Scanner(new File("text.txt"));

            // Gets new line, if it is the end of the file, it ends
            int totalNumberWords = 0;

            while ((currentLine = br.next()) != null)
            {

                String[] words = currentLine.split(" ");
                totalNumberWords += words.length;

                // Iterates through the words in the line and
                // increments the map appropriately
                for (String word : words) {
                    int currentNumber = 0;
                    if (lengthCount.get(word.length()) != null)
                        currentNumber = lengthCount.get(word.length());
                    lengthCount.put(word.length(), currentNumber + 1);
                }
            }

            //Header for output
            String heading1 = "Word(s)";
            String heading2 = "Character Length";
            System.out.printf("%-15s %15s %n", heading1, heading2);

            // Iterates through the map and prints the amount of strings
            // for each length and the percent of words with each length
            for (Map.Entry<Integer, Integer> curEntry : lengthCount.entrySet())
            {

                //System.out.printf(%-15s %15s %n);
                double percentWithThisLength = ((double) curEntry.getValue() / totalNumberWords) * 100;

                System.out.printf("%-3d %20d %n", curEntry.getValue(), curEntry.getKey());

            }

            br.close();
        } catch (IOException e) {
            System.out.println("File couldn't be found.");
        }
    }

}

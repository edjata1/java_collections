import java.util.StringTokenizer;

/*
 * Java Program to count number of words in String.
 * This program solves the problem in three ways,
 * by using String.split(), StringTokenizer, and
 * without any of them by just writing own logic
 */
public class CountWordString {

  public static void main(String[] args) {

    String[] testdata = { "", null, "One", "O", "Java and C++", "a b c",
        "YouAre,best" };

    for (String input : testdata) {
      System.out.printf(
          "Number of words in stirng '%s' using split() is : %d %n", input,
          countWordsUsingSplit(input));
      System.out.printf(
          "Number of words in stirng '%s' using StringTokenizer is : %d %n",
          input, countWordsUsingStringTokenizer(input));
      System.out.printf("Number of words in stirng '%s' is : %d %n", input,
          count(input));
    }

  }

  /**
   * Count number of words in given String using split() and regular expression
   * 
   * @param input
   * @return number of words
   */
  public static int countWordsUsingSplit(String input) {
    if (input == null || input.isEmpty()) {
      return 0;
    }

    String[] words = input.split("\\s+");
    return words.length;
  }

  /**
   * Count number of words in given String using StirngTokenizer
   * 
   * @param sentence
   * @return count of words
   */
  public static int countWordsUsingStringTokenizer(String sentence) {
    if (sentence == null || sentence.isEmpty()) {
      return 0;
    }
    StringTokenizer tokens = new StringTokenizer(sentence);
    return tokens.countTokens();
  }

  /**
   * Count number of words in given String without split() or any other utility
   * method
   * 
   * @param word
   * @return number of words separated by space
   */
  public static int count(String word) {
    if (word == null || word.isEmpty()) {
      return 0;
    }

    int wordCount = 0;

    boolean isWord = false;
    int endOfLine = word.length() - 1;
    char[] characters = word.toCharArray();

    for (int i = 0; i < characters.length; i++) {

      // if the char is a letter, word = true.
      if (Character.isLetter(characters[i]) && i != endOfLine) {
        isWord = true;
        
        //System.out.println();

        // if char isn't a letter and there have been letters before,
        // counter goes up.
      } else if (!Character.isLetter(characters[i]) && isWord) {
        wordCount++;
        isWord = false;

        // last word of String; if it doesn't end with a non letter, it
        // wouldn't count without this.
      } else if (Character.isLetter(characters[i]) && i == endOfLine) {
        wordCount++;
      }
      
    }


    return wordCount;
  }

}
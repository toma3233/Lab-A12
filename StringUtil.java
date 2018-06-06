/**
 * 
 * @author Tom Abraham
 * Period #1
 *
 */
public class StringUtil {
    /**
     * Converts a string to it piglatin form according to the following rules: a. If
     * there are no vowels in englishWord, then pigLatinWord is just englishWord +
     * "ay". (There are ten vowels: 'a', 'e', 'i', 'o', and 'u', and their uppercase
     * counterparts.) b. Else, if englishWord begins with a vowel, then pigLatinWord
     * is just englishWord + "yay". c. Otherwise (if englishWord has a vowel in it
     * and yet doesn't start with a vowel), then pigLatinWord is end + start + "ay",
     * where end and start are defined as follows: 1. Let start be all of
     * englishWord up to (but not including) its first vowel. 2. Let end be all of
     * englishWord from its first vowel on. 3. But, if englishWord is capitalized,
     * then capitalize end and "uncapitalize" start.
     *
     * @param text - String that is passed in
     * @return piglatin version of text as a String
     */
    public static String phraseToPigLatin(String text) {
   	 String y = text + " ";
   	 String word = "";
   	 String pigWord = "";
   	 String pigSentence = "";
   	 String symbol = "";
   	 while (y.trim().length() > 0) {
   		 word = y.substring(0, y.indexOf(' '));
   		 if (!hasSymbol(word)) {
   			 if (!hasVowel(word)) {
   				 pigWord = word + "ay ";
   				 pigSentence += pigWord + " ";
   			 } else if (vowelLocation(word) == 0) {
   				 pigWord = word + "yay ";
   				 pigSentence += pigWord;
   			 } else if (hasVowel(word) && vowelLocation(word) > 0) {
   				 String start = word.substring(0, vowelLocation(word));
   				 String end = word.substring(vowelLocation(word));
   				 if ((int) start.charAt(0) >= 65 && (int) start.charAt(0) <= 90) {
   					 start = (char) ((int) start.charAt(0) + 32) + start.substring(1);
   					 end = (char) ((int) end.charAt(0) - 32) + end.substring(1);
   					 pigWord = end + start + "ay ";
   					 pigSentence += pigWord;
   				 } else {
   					 pigWord = end + start + "ay ";
   					 pigSentence += pigWord;
   				 }
   			 }
   		 } else {
   			 symbol = "" + word.charAt(symbolLocation(word));
   			 word = word.substring(0, symbolLocation(word));
   			 if (!hasVowel(word)) {
   				 pigWord = word + "ay" + symbol + " ";
   				 pigSentence += pigWord + " ";
   			 } else if (vowelLocation(word) == 0) {
   				 pigWord = word + "yay" + symbol + " ";
   				 pigSentence += pigWord;
   			 } else if (hasVowel(word) && vowelLocation(word) > 0) {
   				 String start = word.substring(0, vowelLocation(word));
   				 String end = word.substring(vowelLocation(word));
   				 if ((int) start.charAt(0) >= 65 && (int) start.charAt(0) <= 90) {
   					 start = (char) ((int) start.charAt(0) + 32) + start.substring(1);
   					 end = (char) ((int) end.charAt(0) - 32) + end.substring(1);
   					 pigWord = end + start + "ay" + symbol + " ";
   					 pigSentence += pigWord;
   				 } else {
   					 pigWord = end + start + "ay" + symbol + " ";
   					 pigSentence += pigWord;
   				 }
   			 }
   		 }
   		 y = y.substring(y.indexOf(' ') + 1);
   	 }
   	 return pigSentence;

    }

    /**
     * method to see if a word has vowel in it
     *
     * @param word
     *        	the word that is being checked
     * @return true if the word has a vowel or false if there isn't a vowel
     */
    private static boolean hasVowel(String word) {
   	 if (word.indexOf('a') >= 0 || word.indexOf('e') >= 0 || word.indexOf('i') >= 0 || word.indexOf('o') >= 0
   			 || word.indexOf('u') >= 0 || word.indexOf('A') >= 0 || word.indexOf('E') >= 0 || word.indexOf('I') >= 0
   			 || word.indexOf('O') >= 0 || word.indexOf('U') >= 0) {
   		 return true;
   	 } else {
   		 return false;
   	 }
    }

    /**
     * method to find the location of the first vowel a word
     *
     * @param word
     *        	the word that is being checked
     * @return the location of the vowel in the word
     */
    private static int vowelLocation(String word) {
   	 int location = 0;
   	 for (int i = 0; i <= word.length(); i++) {
   		 if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o'
   				 || word.charAt(i) == 'u' || word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I'
   				 || word.charAt(i) == 'O' || word.charAt(i) == 'U') {
   			 location = i;
   			 break;
   		 } else {
   			 location = -1;// no vowel in the word
   		 }
   	 }
   	 return location;
    }

    private static boolean hasSymbol(String word) {
   	 if (word.indexOf(",") >= 0 || word.indexOf("!") >= 0 || word.indexOf(".") >= 0) {
   		 return true;
   	 } else {
   		 return false;
   	 }
    }

    private static int symbolLocation(String word) {
   	 int location = 0;
   	 for (int i = 0; i <= word.length(); i++) {
   		 if (word.charAt(i) == ',' || word.charAt(i) == '!' || word.charAt(i) == '.') {
   			 location = i;
   			 break;
   		 } else {
   			 location = -1;
   		 }
   	 }
   	 return location;
    }

}

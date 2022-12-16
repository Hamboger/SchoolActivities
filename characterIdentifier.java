import java.util.*;

public class characterIdentifier{
   public static void main(String[] args){
      Scanner con = new Scanner(System.in);
      String characters = "";
      int lowerCaseCount = 0, lowerCaseVowelCount = 0, lowerCaseVowelConsonant = 0, specialChar = 0;
      char[] smallLetters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
      char[] smallLetterVowels = {'a','e','i','o','u'};
      char[] smallLetterConsonant = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
      char[] notSpecial = {'1','2','3','4','5','6','7','8','9','0','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
      for(int i = 0; i < 10; i++){
         characters += con.next().charAt(0);
      } 
      for(int l = 0; l < characters.length(); l++){
         characters.charAt(l);
         for(char smallChar : smallLetters){
            char h = characters.charAt(l);
            if(h == smallChar){
               lowerCaseCount++;
            }
         }
         for(char smallCharVowel : smallLetterVowels){
            if(characters.charAt(l) == smallCharVowel){
               lowerCaseVowelCount++;
            }
         }
         for(char smallCharConsonant : smallLetterConsonant){
            if(characters.charAt(l) == smallCharConsonant){
               lowerCaseVowelConsonant++;
            }
         }
         for(char smallCharConsonant : notSpecial){
            if(characters.toLowerCase().charAt(l) != smallCharConsonant){
               specialChar++;
            }
         }

      }

      

      System.out.println("No. of small letters: " + lowerCaseCount);
      System.out.println("No. of small letter vowels: " + lowerCaseVowelCount);
      System.out.println("No. of small letter consonant: " + lowerCaseVowelConsonant);
      System.out.println("No. of special chars: " + specialChar);
      con.close();
   }

}
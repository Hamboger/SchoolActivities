import java.util.*;
public class vowelconsoCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String word = scan.nextLine();


        System.out.println("There are " + vowelCounter(word) + " vowels in this string");
        System.out.println("There are " + consonantCounter(word) + " consonants in this string");
        scan.close();
    }


    //Method to count how many vowels are in a string
    public static int vowelCounter(String word){
        int numOfVowels = 0;
        char vowelChars[] = {'a', 'e', 'i', 'o', 'u'};
        char b;

        for(char a : vowelChars){
            for(int i = 0; i < word.length(); i++){
                b = word.toLowerCase().charAt(i);
                if(a == b){
                    numOfVowels++;
                }
            }

        }
        return numOfVowels;
    } 


    //Method to count how many consonants are in a string

    public static int consonantCounter(String word){
        int numOfConsonants = 0;
        char consonantChars[] = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w','y', 'z'};
        char b;

        for(char a : consonantChars){
            for(int i = 0; i < word.length(); i++){
                b = word.toLowerCase().charAt(i);
                if(a == b){
                    numOfConsonants++;
                }
            }

        }
        return numOfConsonants;
    } 
}

/**
 * countnum
 */
import java.util.*;
public class countnum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = scan.nextLine();
        System.out.println("No. of Numbers: " + digitcounter(word));
        scan.close();
    }

    public static int digitcounter(String s) {
        int numberofnumbers = 0;
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)){numberofnumbers++;}
        }

        return numberofnumbers;
    }
}
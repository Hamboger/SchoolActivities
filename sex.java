import java.util.*;
public class sex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sex (M or F): ");
        String c = scan.nextLine();
        String[] sex = {"m","f","M","F"};

        if(c.equals(sex[0]) || c.equals(sex[2])){System.out.println("Male");}
        else if(c.equals(sex[1]) || c.equals(sex[3])){System.out.println("Female");}
        else{System.out.println("UNKNOWN");}
        scan.close();
    }
}

import java.util.*;
public class grade {
    public static void main(String[] args) {
        Scanner con = new Scanner(System.in);
        System.out.println("Input your 1st score");
        double x = con.nextDouble();
        System.out.println("Input your 2nd score");
        double c = con.nextDouble();
        System.out.println("Input your 3rd score");
        double v = con.nextDouble();
        double n = (x+c+v)/3;
        System.out.println(gradeComputer(n));
        con.close();
    }

    public static char gradeComputer(double x) {
        if(x >= 90){
            return 'A';
        }
        else if(x >= 80){
            return 'B';
        }
        else if(x >= 70){
            return 'C';
        }
        else if(x >= 60){
            return 'D';
        }
        else {
            return 'E';
        }
    }
}

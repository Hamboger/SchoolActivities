import java.util.*;
public class oddnum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("input 10 numbers: ");
        for(int i = 0; i < 10; i++){
            nums.add(scan.nextInt());
        }
        System.out.println("There are " + howManyOdds(nums) + " Odd numbers");
        scan.close();
    }

    //function counting how many odds
    public static int howManyOdds(ArrayList<Integer> nums){
        int result = 0;
        for (Integer num : nums) {
            if(num % 2 == 0){
                continue;
            }
            else{
                result++;
            }
        }
        return result;
    }
}

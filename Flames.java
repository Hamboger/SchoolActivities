import java.util.*;

public class Flames 
{
   int name1Counter = 0, name2Counter = 0, totalCounter = 0;
   public String getFlamesFor1stName(String name)
   {
      int totalFlames = 0;
      String[] flames = {"f","l","a","m","e","s"};
      String[] flamesS = {"Friends","Lovers","Admirers","Marriage","Enemies","Sweethearts"};
      for(String str : flames){
         for(int i = 0; i < name.length(); i++){
               if(str.equalsIgnoreCase(name.charAt(i)+"")){
                  this.name1Counter++;
               }
         }
      }
      if(this.name1Counter == 0){
         return "Nothing";
      }
      for(int i = 0, x = 1; i < this.name1Counter; i++, x++){
         if(x == 7){
            x = 1;
         }
         totalFlames = x;
      }
      return flamesS[totalFlames-1];
      
   }

   public String getFlamesFor2ndName(String name)
   {
      int totalFlames = 0;
      String[] flames = {"f","l","a","m","e","s"};
      String[] flamesS = {"Friends","Lovers","Admirers","Marriage","Enemies","Sweethearts"};
      for(String str : flames){
         for(int i = 0; i < name.length(); i++){
               if(str.equalsIgnoreCase(name.charAt(i)+"")){
                  this.name2Counter++;
               }
         }
      }
      if(this.name2Counter == 0){
         return "Nothing";
      }
      for(int i = 0, x = 1; i < this.name2Counter; i++, x++){
         if(x == 7){
            x = 1;
         }
         totalFlames = x;
      }
      return flamesS[totalFlames-1];
   }   

   public String getFlames(String firstname, String secondname)
   {
      int totalFlames = 0;
      this.totalCounter = this.name1Counter + this.name2Counter;
      String[] flamesS = {"Friends","Lovers","Admirers","Marriage","Enemies","Sweethearts"};
      if(this.totalCounter == 0){
         return "Nothing";
      }

      for(int i = 0, x = 1; i < this.totalCounter; i++, x++){
         if(x == 7){
            x = 1;
         }
         totalFlames = x;
      }
      return flamesS[totalFlames-1];
   }   

   public static boolean areNamesTheSame(String firstname, String secondname)
   {
      if(firstname.equalsIgnoreCase(secondname)){
         return true;
      }
      return false;
   }

   public static void main(String[] args)
   {
      Flames t = new Flames();
      Scanner con = new Scanner(System.in);

      System.out.print("Enter 1st name: ");
      String name1 = con.nextLine();
      System.out.print("Enter 2nd name: ");
      String name2 = con.nextLine();
      
      String name1Flames = t.getFlamesFor1stName(name1);
      String name2Flames = t.getFlamesFor2ndName(name2);
      String bothFlames = t.getFlames(name1, name2);
      
      if(areNamesTheSame(name1, name2)){
         System.out.println("Sorry, cannot perform FLAMES on the same names");
      }
      else{
         System.out.println(name1 + " = " + name1Flames + " " + t.name1Counter);
         System.out.println(name2 + " = " + name2Flames + " " + t.name2Counter);
         System.out.print(t.name1Counter + " + " + t.name2Counter + " = " + t.totalCounter + " " + bothFlames);
      }

      con.close();

   }
}
import java.util.*;

public class Birthday
{
   private int month, day, year;
   
   
   public Birthday(int month, int day, int year){
      //constructor
      this.month = month;
      this.day = day;
      this.year = year;
   }
   
   
   public String getMonthString(){
      //Month number to Month String
      if(!isMonthValid(month)){
         return "INVALID MONTH";
      }
      else{
         switch(month){
            case 1: return "January"; //31
            case 2: return "February"; //28, 29 if leap year
            case 3: return "March"; //31
            case 4: return "April"; //30
            case 5: return "May"; //31
            case 6: return "June"; //30
            case 7: return "July"; //31
            case 8: return "August"; //31
            case 9: return "September"; //30
            case 10: return "October"; //31
            case 11: return "November"; //30
            default: return "December"; //31
         }
      }
   }
   
   public String getFormattedDate1(){
      //monthnum-day-year
      if(!isMonthValid(month)){
         return "Invalid Month";
      }
      else if(!isDayValidForMonth(month)){
         return "Invalid day for Month";
      }
      else return month + "-" + day + "-" + year;
   }
   
   public String getFormattedDate2(){
      //monthstring monthday, year
      if(!isMonthValid(month)){
         return "Invalid Month";
      }
      else if(!isDayValidForMonth(month)){
         return "Invalid day for Month";
      }
      else return getMonthString() + "-" + day + "-" + year;
   }
   
   public boolean isMonthValid(int monthInt){
      //tests if monthInt is valid
      return !(monthInt < 1 || monthInt > 12);
   }
   
   public int getAge(){
      if(birthdayDone()){
         return 2022 - year -1;
      }
      else return 2022 - year;
   }
   
   public boolean birthdayDone(){
      return(month >= 12 && day >= 10);
   }
   
   public boolean isDayValidForMonth(int monthInt){
      int febMax = 28;
      if(isLeapYear(year)){febMax = 29;}
      if(isMonthValid(month)){
         switch(monthInt){
            case 1: return !(day < 1 || day > 31); //31
            case 2: return !(day < 1 || day > febMax); //28, 29 if leap year
            case 3: return !(day < 1 || day > 31); //31
            case 4: return !(day < 1 || day > 30); //30
            case 5: return !(day < 1 || day > 31); //31
            case 6: return !(day < 1 || day > 30); //30
            case 7: return !(day < 1 || day > 31); //31
            case 8: return !(day < 1 || day > 31); //31
            case 9: return !(day < 1 || day > 30); //30
            case 10: return !(day < 1 || day > 31); //31
            case 11: return !(day < 1 || day > 30); //30
            default: return !(day < 1 || day > 31); //31
         }
      }
      else return false;
   }
   
   public boolean isLeapYear(int year){
      return (year % 4 == 0);
   }
   
   public static void main(String[] args){
      Scanner con = new Scanner(System.in);
      int month, day, year;
      System.out.print("Enter month: ");
      month = con.nextInt();
      System.out.print("Enter day: ");
      day = con.nextInt();
      System.out.print("Enter year: ");
      year = con.nextInt();
      con.close();
      Birthday person = new Birthday(month, day, year);
      
      //System.out.println(person.isDayValidForMonth(9));
      System.out.println(person.getMonthString());
      System.out.println(person.getFormattedDate1());
      System.out.println(person.getFormattedDate2());
      System.out.println(person.getAge());
   }


}
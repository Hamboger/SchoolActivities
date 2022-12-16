import java.util.*;

public class numbersToWordsConverter
{
   /*
      Create a function name GetOnes that extracts the ones part of a number
      example:  1231 = 1 = returns the word "One"
      Challenge: Without using an array
   */
   public static String getOnes(int num)
   {
      String toString = (num + "");
      if(toString.length()== 3){
         toString = " " + toString; 
      }
      if(toString.length()== 2){
         toString = "bb" + toString; 
      }
      if(toString.length()== 1){
         toString = "ccc" + toString; 
      }
      int tostrLength = toString.length();
      String numStr = toString.charAt(tostrLength - 1)+"";
      if((toString.charAt(tostrLength - 2)+"").equals("1") && numStr.equals("1")){
          return "";
      }
      else if((toString.charAt(tostrLength - 2)+"").equals("1") && numStr.equals("2")){
          return "";
      }
      else if((toString.charAt(tostrLength - 2)+"").equals("1") && numStr.equals("3")){
          return "";
      }
      else if((toString.charAt(tostrLength - 2)+"").equals("1") && numStr.equals("4")){
          return "";
      }
      else if((toString.charAt(tostrLength - 2)+"").equals("1") && numStr.equals("5")){
          return "";
      }
      else if((toString.charAt(tostrLength - 2)+"").equals("1") && numStr.equals("6")){
          return "";
      }
      else if((toString.charAt(tostrLength - 2)+"").equals("1") && numStr.equals("7")){
          return "";
      }
      else if((toString.charAt(tostrLength - 2)+"").equals("1") && numStr.equals("8")){
          return "";
      }
      else if((toString.charAt(tostrLength - 2)+"").equals("1") && numStr.equals("9")){
          return "";
      }
      else if(numStr.equals("1")){
          return "One";
      }
      else if(numStr.equals("2")){
          return "Two";
      }
      else if(numStr.equals("3")){
          return "Three";
      }
      else if(numStr.equals("4")){
          return "Four";
      }
      else if(numStr.equals("5")){
          return "Five";
      }
      else if(numStr.equals("6")){
          return "Six";
      }
      else if(numStr.equals("7")){
          return "Seven";
      }
      else if(numStr.equals("8")){
          return "Eight";
      }
      else if(numStr.equals("9")){
          return "Nine";
      }
      
      return "";
  
      
   }   
   
   /*
      Create a function name GetTens that extracts the tens part of a number
      example:  1231 = 3 = returns the word "Thirty"
      Challenge: Without using an array
   */   
   public static String getTens(int num)
   {
      String toString = (num + "");
      if(toString.length()== 3){
         toString = " " + toString; 
      }
      if(toString.length()== 2){
         toString = "bb" + toString; 
      }
      if(toString.length()== 1){
         toString = "ccc" + toString; 
      }
      int tostrLength = toString.length();
      String numStr = toString.charAt(tostrLength - 2)+"";
      if((toString.charAt(tostrLength - 1)+"").equals("0") && numStr.equals("1")){
          return "Ten";
      }
      else if((toString.charAt(tostrLength - 1)+"").equals("1") && numStr.equals("1")){
          return "Eleven";
      }
      else if((toString.charAt(tostrLength - 1)+"").equals("2") && numStr.equals("1")){
          return "Twelve";
      }
      else if((toString.charAt(tostrLength - 1)+"").equals("3") && numStr.equals("1")){
          return "Thirteen";
      }
      else if((toString.charAt(tostrLength - 1)+"").equals("4") && numStr.equals("1")){
          return "Fourteen";
      }
      else if((toString.charAt(tostrLength - 1)+"").equals("5") && numStr.equals("1")){
          return "Fifteen";
      }
      else if((toString.charAt(tostrLength - 1)+"").equals("6") && numStr.equals("1")){
          return "Sixteen";
      }
      else if((toString.charAt(tostrLength - 1)+"").equals("7") && numStr.equals("1")){
          return "Seventeen";
      }
      else if((toString.charAt(tostrLength - 1)+"").equals("8") && numStr.equals("1")){
          return "Eighteen";
      }
      else if((toString.charAt(tostrLength - 1)+"").equals("9") && numStr.equals("1")){
          return "Nineteen";
      }
      else if(numStr.equals("2")){
          return "Twenty-";
      }
      else if(numStr.equals("3")){
          return "Thirty-";
      }
      else if(numStr.equals("4")){
          return "Fourty-";
      }
      else if(numStr.equals("5")){
          return "Fifty-";
      }
      else if(numStr.equals("6")){
          return "Sixty-";
      }
      else if(numStr.equals("7")){
          return "Seventy-";
      }
      else if(numStr.equals("8")){
          return "Eighty-";
      }
      else if(numStr.equals("9")){
          return "Ninety-";
      }
      
      return "";
   }
   
   /*
      Create a function name GetHundreds that extracts the hundreds part of a number
      example:  1231 = 2 = returns the word "Two hundred"
      Challenge: Without using an array      
   */   
   public static String getHundreds(int num)
   {
      String toString = (num + "");
      if(toString.length()== 3){
         toString = "a" + toString; 
      }
      if(toString.length()== 2){
         toString = "bb" + toString; 
      }
      if(toString.length()== 1){
         toString = "ccc" + toString; 
      }
      int tostrLength = toString.length();
      String numStr = toString.charAt(tostrLength - 3)+"";
      
      if(numStr.equals("1")){
          return "One-hundred ";
      }
      else if(numStr.equals("2")){
          return "Two-hundred ";
      }
      else if(numStr.equals("3")){
          return "Three-hundred ";
      }
      else if(numStr.equals("4")){
          return "Four-hundred ";
      }
      else if(numStr.equals("5")){
          return "Five-hundred ";
      }
      else if(numStr.equals("6")){
          return "Six-hundred ";
      }
      else if(numStr.equals("7")){
          return "Seven-hundred ";
      }
      else if(numStr.equals("8")){
          return "Eight-hundred ";
      }
      else if(numStr.equals("9")){
          return "Nine-hundred ";
      }
      
      return "";
   }   
   
   
   /*
      Create a function name GetThousands that extracts the thousands part of a number
      example:  1231 = 1 = returns the word "One Thousand"
      Challenge: Without using an array      
   */   
   public static String getThousands(int num)
   {
      String toString = (num + "");
      if(toString.length()== 3){
         toString = " " + toString; 
      }
      if(toString.length()== 2){
         toString = "bb" + toString; 
      }
      if(toString.length()== 1){
         toString = "ccc" + toString; 
      }
      int tostrLength = toString.length();
      String numStr = toString.charAt(tostrLength - 4)+"";
      if(numStr.equals("1")){
          return "One-thousand ";
      }
      else if(numStr.equals("2")){
          return "Two-thousand ";
      }
      else if(numStr.equals("3")){
          return "Three-thousand ";
      }
      else if(numStr.equals("4")){
          return "Four-thousand ";
      }
      else if(numStr.equals("5")){
          return "Five-thousand ";
      }
      else if(numStr.equals("6")){
          return "Six-thousand ";
      }
      else if(numStr.equals("7")){
          return "Seven-thousand ";
      }
      else if(numStr.equals("8")){
          return "Eight-thousand ";
      }
      else if(numStr.equals("9")){
          return "Nine-thousand ";
      }
      
      return "";
   
   }   
   
   
   /*
      Create a function name convert that accepts 1 integer value parameter, the number,
      and convert it to words.
      
      This function calls the other 4 functions:
      getOnes, getTens, getHundreds, getThousands so that it can
      convert the number to words    
      
      
      Minimum allowed value: 1
      Maximum allowed value: 9999
      
      If the value of the number is out of range, return "INVALID"    
      
      Challenge: Without using an array                    
   */
   public static String convert(int num){
       return getThousands(num) + getHundreds(num) + " " + getTens(num) + getOnes(num);
   }

   public static void main(String[] args)
   {
      Scanner con = new Scanner(System.in);
      System.out.println("Enter A number");
      int number = con.nextInt();
      System.out.println(convert(number));

      /*
         Test the function that you have created name convert here in main method
         by allowing the user to enter a number either 1 to 9999 and convert it to words.
         DO NOT test the other functions here: getTens, getOnes, getHundreds, getThousands
         Only call the function convert here
         
         Example Program Run:
         
         Enter a number (1 - 99999): 3415
         Output: Three-thousand four-hundred fifteen
         
         Example Program Run:         
         Enter a number (1 - 99999): 9099
         Output: Nine-thousand Ninety-Nine
         
         Example Program Run:
         Enter a number (1 - 99999): 418
         Output: Four-Hundred Eighteen
      */
      
      
   }
}
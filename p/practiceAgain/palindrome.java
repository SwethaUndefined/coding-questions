import java.util.Scanner;

import java.util.Scanner;;
public class palindrome {
public static void main(String[] args) {
    String empString="";
    Scanner input = new Scanner(System.in);
    String str1 = input.next();
    for(int i=str1.length()-1;i>=0;i--){
    empString=empString+str1.charAt(i);
    }    
    System.out.println("Entered text is "+str1.equals(empString)+ " palindrome");
  }  
}

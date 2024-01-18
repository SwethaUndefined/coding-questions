import java.util.Scanner;
  
class SwappingTwoNumbersWithoutThirdVariable
{
   public static void main(String args[])
   {
      int x, y;
      System.out.println("Enter x and y");
      Scanner in = new Scanner(System.in);
  
      x = in.nextInt();
      y = in.nextInt();
  
      System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
  
      x = x + y;//x=5;y=6; x= x+y=11;
      y = x - y;//y=x-y=11-6=5;
      x = x - y;//x=x-y=11-5=6    Now x had 6 and y has 5
  
      System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);
   }
}

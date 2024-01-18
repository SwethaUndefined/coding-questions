public class palindromeInNumbers {
    public static void main(String[] args) {
        int num=454, temp=num;
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(sum==temp){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }

}

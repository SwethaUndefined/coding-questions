import java.util.Arrays;
public class AnagramProgram {
    public static void main(String[] args) {
        String str1= "SILENT"; //listen==silent
        String str2 = "swetha";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str1.toCharArray();
        Arrays.sort(arr1);//
        Arrays.sort(arr2);
        boolean result = Arrays.equals(arr1, arr2);
        if(result==true){
            System.out.println("Anagrams");
        }
        else{
            System.out.println("Not a Anagrams");
        }

    }
}

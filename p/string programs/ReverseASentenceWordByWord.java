import java.lang.invoke.VarHandle.AccessMode;

public class ReverseASentenceWordByWord {
    public static void main(String[] args) {
        String str = "Hello how are you";
        String[] arr = str.split(" ");
        String emptyString = "";
        for(int i=arr.length-1;i>=0;i--){
            emptyString=emptyString+arr[i]+" ";            
        }
        System.out.println(emptyString);
    }
}

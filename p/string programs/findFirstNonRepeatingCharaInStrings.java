public class findFirstNonRepeatingCharaInStrings {
   public static void main(String[] args){
    String str = "village";
    boolean repeat=false;
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        for(int j=i+1;j<str.length();j++){
            if(ch==str.charAt(j)){
              repeat = true;
            }            
        }
        if(repeat==false){
            System.out.println(ch+" Non repeated char");
        }
    }
   } 
}

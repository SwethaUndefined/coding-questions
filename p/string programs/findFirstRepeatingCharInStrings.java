public class findFirstRepeatingCharInStrings{
    public static void main(String[] args) {
        String str = "maintain";
        boolean repeat=false;
        for(int j=0;j<str.length();j++){
        char ch = str.charAt(j);
        for(int i =j+1;i<str.length();i++){
            if(ch==str.charAt(i)){
                System.out.println(ch+" is repeated first in the String");
                repeat=true;
            }
        }
    }
            if(repeat==false){
                System.out.println("Non repeated");
            }
        }
    }

public class VowelsConsonants {
    public static void main(String[] args) {
        String str = "abcdefghi";
        int vowels=0,consonents=0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)=='a'||
            str.charAt(i)=='o'||
            str.charAt(i)=='i'||
            str.charAt(i)=='e'||
            str.charAt(i)=='u'){
            vowels++;
        }
        else{
        consonents++;
        }
    }
        System.out.println("Vowels count "+vowels);
        System.out.println("Consonents count "+consonents);
    }
}

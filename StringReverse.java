

public class StringReverse {
    public static String reversedString(String str){
        String reversedString = " ";
        for(int i = str.length()-1; i >=0; i--){
            reversedString += str.charAt(i);

        }
        return reversedString;

    }
    public static void main(String[] args) {
        String str = "abcde";
        String reversedString = reversedString(str);
        System.out.println(reversedString);
    }
    

    
}

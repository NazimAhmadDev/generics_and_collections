import java.util.*;

public class StringUtility {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static boolean isPalindrome(String str){
        StringBuilder string = new StringBuilder(str);
        String reversed = string.reverse().toString();

        return str.equals(reversed);
    }

    public static String UpperCase(String str) {
        return str.toUpperCase();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string : ");
        String str = sc.nextLine();


        // reverse
        System.out.println("Reversed string : "+reverse(str));


        // palindrome
        if(isPalindrome(str)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }


        // ToUppercase
        System.out.println("Upper case : "+UpperCase(str));

    }
}

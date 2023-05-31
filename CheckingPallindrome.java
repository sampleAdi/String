import java.util.*;

public class CheckingPallindrome {
    public static boolean ispallindrome(String str) {
        int n = str.length();
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                // not a pallindrome
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ispallindrome(str));
    }
}

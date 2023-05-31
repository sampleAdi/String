import java.util.*;

public class Strings1 {
    public static void printletter(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    // Concatenation
    public static void concatenation() {
        String firstname = "Abhishek";
        String lastname = "Adjariya";
        String fullname2 = firstname + " " + lastname;
        System.out.println(fullname2);
    }

    public static void main(String[] args) {
        String fullname;
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        fullname = sc.nextLine();

        System.out.println(fullname.length());

        System.out.println(fullname);

        printletter(fullname);
        concatenation();
    }
}

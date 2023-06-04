import java.util.*;

public class StringCompression {

    public static String compression(String str) {
        StringBuilder sb = new StringBuilder("");
        Integer count = 0;
        for (int i = 0; i < str.length(); i++) {
            count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count > 1) {
                sb.append(str.charAt(i));
                sb.append(count.toString());
            }
            if (count == 1) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcddd";
        System.out.println(compression(str));
    }
}

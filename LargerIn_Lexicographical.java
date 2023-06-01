public class LargerIn_Lexicographical {

    public static String larger(String str[]) {
        String currlarger = str[0];
        for (int i = 1; i < str.length; i++) {
            if (currlarger.compareTo(str[i]) < 0) {
                currlarger = str[i];
            }
        }
        return currlarger;
    }

    public static void main(String[] args) {
        String str[] = { "apple", "banana", "mango" };
        System.out.println(larger(str));

    }
}

import java.util.*;

public class ShortestPath {

    public static float path(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y++;
            }
            if (str.charAt(i) == 'S') {
                y--;
            }
            if (str.charAt(i) == 'E') {
                x++;
            }
            if (str.charAt(i) == 'W') {
                x--;
            }
        }
        int X = x * x;
        int Y = y * y;
        return (float) Math.sqrt(X + Y);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(path(str));
    }
}

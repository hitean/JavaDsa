import java.util.Scanner;
import java.util.Arrays;

public class RailFence {

    public static String encrypt(String text, int r) {
        if (r < 2) return text;
        StringBuilder[] rails = new StringBuilder[r];
        Arrays.setAll(rails, i -> new StringBuilder());

        int row = 0, dir = 1;
        for (char c : text.toCharArray()) {
            rails[row].append(c);
            if (row == 0) dir = 1; else if (row == r - 1) dir = -1;
            row += dir;
        }
        return String.join("", rails);
    }
    public static String decrypt(String text, int r) {
        if (r < 2) return text;
        int len = text.length(), row = 0, dir = 1, idx = 0;
        char[][] grid = new char[r][len];
        for (int i = 0; i < len; i++) {
            grid[row][i] = '?';
            if (row == 0) dir = 1; else if (row == r - 1) dir = -1;
            row += dir;
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < len; j++) {
                if (grid[i][j] == '?' && idx < len) grid[i][j] = text.charAt(idx++);
            }
        }
        StringBuilder res = new StringBuilder();
        row = 0; dir = 1;
        for (int i = 0; i < len; i++) {
            res.append(grid[row][i]);
            if (row == 0) dir = 1; else if (row == r - 1) dir = -1;
            row += dir;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Plain Text: ");
        String text = sc.nextLine();

        System.out.print("Enter number of rails: ");
        int rails = sc.nextInt();

        String enc = encrypt(text, rails);
        System.out.println("\nEncrypted: " + enc);
        System.out.println("Decrypted: " + decrypt(enc, rails));

        sc.close();
    }
}
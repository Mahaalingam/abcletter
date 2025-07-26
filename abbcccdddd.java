import java.util.Scanner;

public class abbcccdddd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < a.length()) {
            char c = a.charAt(i);
            int count = 0;
            while (i < a.length() && a.charAt(i) == c) {
                count++;
                i++;
            }
            sb.append(c).append(count);
        }
        System.out.println(sb.length()<a.length()?sb.toString():a);
    }
}
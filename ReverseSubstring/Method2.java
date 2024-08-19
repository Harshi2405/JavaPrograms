import java.util.*;
public class Method2 {
    public static String reverseSubstrings(String S, int[] A) {
        StringBuilder s = new StringBuilder(S);
        StringBuilder s1=new StringBuilder();
        int prev = 0;
        for (int end : A) {
            String s2=new StringBuilder(s.substring(prev, end)).reverse().toString();
            prev = end;
            s1.append(s2);
        }
        s1.append(s.substring(prev));
        return s1.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("S: ");
        String S = sc.nextLine();
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.print("A: ");
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        String res = reverseSubstrings(S, A);
        System.out.println("o/p: "+ res); 
    }
}

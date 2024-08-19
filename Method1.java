import java.util.*;
public class Method1 {
    public static String reverseSubstrings(String S, int[] A) {
        StringBuilder s = new StringBuilder(S);
        int prev = 0;
        for (int end : A) {
            String s1=new StringBuilder(s.substring(prev, end)).reverse().toString();
            s.replace(prev,end,s1);
            prev = end;
        }
        return s.toString();
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

import java.util.Scanner;
public class ConditionBasedSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum=0;
        boolean ignore=false;

        for (int i=0;i<n;i++) {
            if (a[i]==6) {
                ignore=true;
            } else if (a[i]==7&&ignore) {
                ignore=false;
            } else if (!ignore) {
                sum+=a[i];
            }
        }
        System.out.println(sum);
    }
}

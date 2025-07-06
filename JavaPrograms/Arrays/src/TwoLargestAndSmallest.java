import java.util.Arrays;
import java.util.Scanner;
public class TwoLargestAndSmallest {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] a = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                Arrays.sort(a);
                System.out.println(a[a.length-1]+" "+a[a.length - 2]);
                System.out.println(a[0]+" "+a[1]);
            }
        }


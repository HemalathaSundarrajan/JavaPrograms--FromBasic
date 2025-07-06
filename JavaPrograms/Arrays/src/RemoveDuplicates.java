import java.util.Scanner;

public class RemoveDuplicates {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i=0;i<n; i++) {
                a[i]=sc.nextInt();
            }
            int[] temp=new int[n];
            int tl=0;
            for (int i = 0; i < n; i++) {
                int j;
                for (j = 0; j < tl; j++) {
                    if (a[i] == temp[j]) {
                        break;
                    }
                }
                if (j == tl) {
                    temp[tl] = a[i];
                    tl++;
                }
            }
            for (int i = 0; i <tl; i++) {
                System.out.print(temp[i] + " ");
            }
        }
}

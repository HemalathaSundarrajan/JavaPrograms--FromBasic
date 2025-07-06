import java.util.Scanner;
public class CheckArrayPresent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int c=sc.nextInt();
        int t=-1;
        for(int i=0;i<n;i++){
            if(a[i]==c){
                t=i;
            }
        }
        System.out.println(t);
    }
}

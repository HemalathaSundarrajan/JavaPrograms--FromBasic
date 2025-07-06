import java.util.Scanner;
public class SumAverageOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        float avg=0.f;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        avg=sum/n;
        System.out.println(sum);
        System.out.println(avg);
    }
}

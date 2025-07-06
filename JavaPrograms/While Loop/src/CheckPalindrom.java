import java.util.Scanner;
public class CheckPalindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem=0,rev=0;
        int temp=n;
        while(temp!=0){
            rem=temp%10;
            rev=(rev*10)+rem;
            temp/=10;
        }
        if(n==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}

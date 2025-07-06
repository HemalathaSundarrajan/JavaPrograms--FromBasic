import java.util.Scanner;
public class AlphabeticOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.nextLine().charAt(0);
        char b=sc.nextLine().charAt(0);
        if(a>b){
            char temp=a;
            a=b;
            b=temp;
        }
        System.out.println(a+","+b);
    }
}

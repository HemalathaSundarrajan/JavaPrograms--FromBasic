import java.util.Scanner;
public class DataTypeOfCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.nextLine().charAt(0);
        if((a>=65 && a<=90) || (a>=97 && a<=122) ){
            System.out.println("Alphabhet");
        }
        else if((a>=48)&&(a<=57)){
            System.out.println("Digit");
        }
        else if((a>=33)&&(a<=47)){
            System.out.println("Special Character");
        }
    }
}

import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class LowercaseToUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.nextLine().charAt(0);
        if(a>=65 && a<=90){
            a= (char)(a+32);
        }
        else if(a>=97 && a<=122){
            a=(char)(a-32);
        }
        System.out.println(a);
    }
}

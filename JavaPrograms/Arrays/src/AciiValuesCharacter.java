import java.util.Scanner;
public class AciiValuesCharacter {
    public static void main(String[] args) {
        int[] ascii = new int[52];
        for(int i=65;i<=90;i++){
            System.out.print((char)i+" ");
        }
        System.out.println();
        for (int i=97;i<=122;i++) {
            System.out.print((char)i+" ");
        }
    }
}


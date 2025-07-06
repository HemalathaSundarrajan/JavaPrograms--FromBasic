import java.util.Scanner;

public class FirstFiveValuesBy235 {
    public static void main(String[] args) {
        int n=5;
        int count=0;
        for(int i=1;i<10000;i++){
            if((i%2==0) && (i%3==0) && (i%5==0)){
                System.out.println(i);
                count++;
            }
            if(count==5){
                break;
            }
        }
    }
}

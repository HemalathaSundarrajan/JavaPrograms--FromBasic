import java.util.Scanner;
public class PercentageOfInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String gender=sc.nextLine();
        int age= sc.nextInt();
        int rate;
        if((gender.equals("Female")) && (age>=1 && age<=58)){
            System.out.println("8.2%");
        }
        else if((gender.equals("Female")) && (age>=59 && age<=100)){
            System.out.println("9.2%");
        }
        else if((gender.equals("Male")) && (age>=1 && age<=58)){
            System.out.println("8.4%");
        }
        else if((gender.equals("Male")) && (age>=59 && age<=100)){
            System.out.println("10.5%");
        }
    }
}

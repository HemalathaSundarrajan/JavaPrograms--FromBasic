public class ReverseIntegersCommandLine {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        System.out.println("The given array is:");
        System.out.println(a + " " + b);
        System.out.println(c + " " + d);
        int temp;
        temp =a;
        a=d;
        d=temp;
        temp=b;
        b=c;
        c=temp;
        System.out.println("The reversed array is:");
        System.out.println(a + " " + b);
        System.out.println(c + " " + d);
    }
}

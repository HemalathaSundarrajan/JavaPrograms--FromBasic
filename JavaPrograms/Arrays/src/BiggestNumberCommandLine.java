public class BiggestNumberCommandLine {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int k=0;
        for (int i=0;i<3;i++)
            for (int j=0;j<3;j++)
                a[i][j]=Integer.parseInt(args[k++]);
        int lar= Integer.MIN_VALUE;
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print(a[i][j]+" ");
                if (a[i][j] > lar)
                    lar = a[i][j];
            }
            System.out.println();
        }
        System.out.println("Biggest number in array is :" + lar);
    }
}
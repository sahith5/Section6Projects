import java.util.Random;

public class FunWith2DArrays {
    public static void main(String[] args) {
        int a[][]=new int[3][3];
        fillarray(a);
        printarray(a);
        doubling(a);
        printarray(a);
    }
    public static void fillarray(int [][] arr)
    {
        Random r= new Random();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=r.nextInt(101);
            }
        }
    }

    public static void doubling(int arr[][]) {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=arr[i][j]*2;
            }
        }

    }

    public static void printarray(int [][] arr)
    {
        for(int [] a:arr)
        {
            for(int b:a)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}

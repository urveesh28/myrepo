import java.util.*;

public class Array_rotation_2{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr[i].length;j++)
            {
                temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length/2;j++)
            {
                temp=arr[i][j];
                arr[i][j]=arr[i][arr.length-j-1];
                arr[i][arr.length-j-1]=temp;
            }
        }
      
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }



    }
}
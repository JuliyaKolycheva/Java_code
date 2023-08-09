
import java.util.Scanner;
public class Program
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
        int array [][] = new int[n][n];
       int count = 0;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                 System.out.print(String.format("%2d",array[i][j]+count)+"  ");
                count++;
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;
class table
{
    public static void main(String args[])
    {
        Scanner m=new Scanner(System.in);
        System.out.print("enter the nuber :");
        int n=m.nextInt();
        System.out.print("enter the number of multiples: ");
        int r=m.nextInt();
        for(int i=0;i<=r;i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }

    }
}

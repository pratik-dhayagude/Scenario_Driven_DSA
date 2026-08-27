import java.util.*;

class ReplaceNegativeswithZero
{
    public static void ReplaceNegativeswithZero(int Arr[])
    {
        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] < 0)
            {
                Arr[i] = 0;
            }
        }
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int No = sobj.nextInt();

        if(No <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        int Arr[] = new int[No];

        System.out.println("Enter the elements:");

        for(int i = 0; i < No; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        ReplaceNegativeswithZero(Arr);

        System.out.println("Updated Array:");

        for(int i = 0; i < No; i++)
        {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }
}

import java.util.*;

class Arithematic
{
    int No1;
    int No2;

    Arithematic(int A, int B)
    {
        No1 = A;
        No2 = B;
    }

    int Division()
    {
        return No1 / No2;
    }
}

class Program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number:");
        int No1 = sobj.nextInt();

        System.out.println("Enter second number:");
        int No2 = sobj.nextInt();

        Arithematic aobj = new Arithematic(No1, No2);

        int Ret = aobj.Division();

        System.out.println("Division will be: " + Ret);
    }
}

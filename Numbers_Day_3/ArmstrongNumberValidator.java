import java.util.*;

class Armstrong
{
    public static boolean CheckArmstrong(int iNo)
    {
        if(iNo < 0)
        {
            return false;
        }

        int iTemp = iNo;
        int iCount = 0;

        // Count digits
        if(iNo == 0)
        {
            iCount = 1;
        }
        else
        {
            while(iTemp > 0)
            {
                iCount++;
                iTemp = iTemp / 10;
            }
        }

        iTemp = iNo;
        int iSum = 0;

        while(iTemp > 0)
        {
            int iDigit = iTemp % 10;
            int iPower = 1;

           
            for(int i = 1; i <= iCount; i++)
            {
                iPower = iPower * iDigit;
            }

            iSum = iSum + iPower;
            iTemp = iTemp / 10;
        }

        if(iNo == 0)
        {
            iSum = 0;
        }

        return (iSum == iNo);
    }

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int iValue = sobj.nextInt();

        if(CheckArmstrong(iValue))
        {
            System.out.println("Armstrong Number");
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
    }
}\

    import java.util.*;
    class sortArray
    {
        public static int[] SortArr(int Arr[])
        {
            int i = 0;
            int j;
            for(j = i+1;j<=Arr.length;j++)
            {
                if(Arr[j]<Arr[i])
                {
                    Arr[i] = Arr[j];
                }
                i++;
            }
            return Arr;
            

        }
        public static void main(String A[])
        {
            Scanner sobj = new Scanner(System.in);

            
            int i=0;
        
            System.out.println("Enter the number:");
            int No = sobj.nextInt();

            int Arr[] = new int[No];

            System.out.println("Enter the number into array:");

            for(i =0;i<No;i++)
            {
                Arr[i] = sobj.nextInt();

            }

            int iRet[] =  SortArr(Arr);
            System.out.println("Sorted Array Will be:"+Arrays.toString(iRet));
        }



    }
class Demo
{
    public int i,j;
    public Demo fun()
    {
        return this;
    }
    public int gun()
    {
        return 11;
    }
}

class program988
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        int iRet = dobj.fun().gun();
        System.out.println(iRet);
    }
}
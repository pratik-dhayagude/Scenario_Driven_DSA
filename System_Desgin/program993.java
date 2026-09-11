class Demo
{
    public int i,j;
   
    public Demo setI(int i)
    {
        this.i = i;
        return this;

    }
    public Demo setJ(int j)
    {
        this.j = j;
        return this;

    }
    public void Display()
    {
        System.out.println(i);
        System.out.println(j);

    }
}

class program993
{
    public static void main(String A[])
    {
        new Demo()
        .setI(11)
        .setJ(21)
        .Display();
    }
}
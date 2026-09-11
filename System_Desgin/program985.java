class ParkingTicket
{
    private  int ticketNumber;
    private String VehicalNumber;
    private int FloorNumber;
    private int SpotNumber;
    private String entryTime;


    public ParkingTicket(int a,String b,int c,int d,String e)
    {
        this.ticketNumber = a;
        this.VehicalNumber = b;
        this.FloorNumber = c;
        this.SpotNumber = d;
        this.entryTime =e;
    }
    public void Display()
    {
        System.out.println("TicketNum:"+this.ticketNumber);
        System.out.println("VehicalNum:"+this.VehicalNumber);
        System.out.println("FloorNum:"+this.VehicalNumber);
        System.out.println("SpotNum:"+this.SpotNumber);
        System.out.println("entrytime:"+this.entryTime);

    }
}

class program985
{
    public static void main(String A[])
    {
        ParkingTicket p1 = new ParkingTicket(11,"MH12VL7172",3,89,"9:30AM");
        ParkingTicket p2 = new ParkingTicket(12,"MH14VL7020",4,32,"9:50AM");
        p1.Display();
        
        p2.Display();
                

    }
}
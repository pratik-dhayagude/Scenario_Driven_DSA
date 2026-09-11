class ParkingTicket
{
    private  int ticketNumber;
    private String VehicalNumber;
    private int FloorNumber;
    private int SpotNumber;
    private String entryTime;


    /*public ParkingTicket(int a,String b,int c,int d,String e)
    {
        this.ticketNumber = a;
        this.VehicalNumber = b;
        this.FloorNumber = c;
        this.SpotNumber = d;
        this.entryTime =e;
    }
     */
    private  ParkingTicket(Builder builder)
    {
        this.ticketNumber=builder.ticketNumber;
        this.VehicalNumber=builder.VehicalNumber;
        this.FloorNumber = builder.FloorNumber;
        this.SpotNumber = builder.SpotNumber;
        this.entryTime = builder.entryTime;

    }
    public void Display()
    {
        System.out.println("TicketNum:"+this.ticketNumber);
        System.out.println("VehicalNum:"+this.VehicalNumber);
        System.out.println("FloorNum:"+this.FloorNumber);
        System.out.println("SpotNum:"+this.SpotNumber);
        System.out.println("entrytime:"+this.entryTime);

    }
}
public static class Builder
{
    private  int ticketNumber;
    private String VehicalNumber;
    private int FloorNumber;
    private int SpotNumber;
    private String entryTime;

    public Builder setTicketNumber(int ticketNumber)
    {
        this.ticketNumber = ticketNumber;
        return this;
    }

      public Builder setVehicalNumber(String VehicalNumber)
    {
        this.VehicalNumber = VehicalNumber;
        return this;
    }
      public Builder setFloorNumber(int FloorNumber)
    {
        this.FloorNumber = FloorNumber;
        return this;
    }
     public Builder setSpotNumber(int SpotNumber)
    {
        this.SpotNumber = SpotNumber;
        return this;
    }
     public Builder setEntryTime(String entryTime)
    {
        this.entryTime =entryTime;
        return this;
    }
    public ParkingTicket build()
    {
        return new ParkingTicket(this);

    }



}

class program986
{
    public static void main(String A[])
    {
       

    }
}
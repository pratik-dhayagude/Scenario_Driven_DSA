import java.util.*;

interface ParkingObserver
{
    void Update(int avalibleSlot);
}
class DisplayBoard implements ParkingObserver
{
    public void Update(int avalibleSlot)
    {
        System.out.println("DislayBoard:"+avalibleSlot);
    }

}
class MobialApplication implements ParkingObserver
{
    public void Update(int avalibleSlot)
    {
        System.out.println("MobialApplication:"+avalibleSlot);
    }

}
class ParkingFloor
{
    private int avalibleSlot;
    public ParkingFloor(int avalibleSlot)
    {
        this.avalibleSlot = avalibleSlot;

    }
}
class program994
{
    public static void main(String A[])
    {
        ParkingFloor fobj = new ParkingFloor(5);

    }
}
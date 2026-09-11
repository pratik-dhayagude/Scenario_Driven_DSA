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
    private List<ParkingObserver> observers = new ArrayList<>();
    public ParkingFloor(int avalibleSlot)
    {
        this.avalibleSlot = avalibleSlot;
    
    }
    public void addObserver(ParkingObserver observer)
    {
        observers.add(observer);
    }
    public void removeObserver(ParkingObserver observer)
    {
        observers.add(observer);
    }
    public void VehicalParked()
    {
        avalibleSlot--;
        notifyObservers();
    }
     public void VehicalExit()
    {
        avalibleSlot++;
        notifyObservers();
    }
    private void notifyObservers()
    {
        for(ParkingObserver observer:observers)
        {
            observer.Update(avalibleSlot);
        }
    }

}

class program995
{
    public static void main(String A[])
    {
        ParkingFloor fobj = new ParkingFloor(5);
        DisplayBoard dobj = new DisplayBoard();
        MobialApplication app = new MobialApplication();

        fobj.addObserver(dobj);
         fobj.addObserver(app);

         fobj.VehicalParked();
         System.out.println("---------------");
         fobj.VehicalExit();


    }
}
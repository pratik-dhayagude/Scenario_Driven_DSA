/*
    -> Single Tone
*/

import javax.crypto.spec.PBEKeySpec;
import javax.print.attribute.standard.PageRanges;

class ParkingLot
{
    private static ParkingLot instance;
    
    private ParkingLot()
    {
        System.out.println("Parking Lot Object Gets Created ");
    }   
    public static ParkingLot getInstance()
    {   
        if(instance == null)
        {
            instance = new ParkingLot();

        }
        return instance;
    }
}

public class program974
{
    public static void main(String A[]) 
    {
     
        ParkingLot pobj1 = ParkingLot.getInstance();
        ParkingLot pobj2 = ParkingLot.getInstance(); 

        System.out.println(pobj1 == pobj2);
    }

}
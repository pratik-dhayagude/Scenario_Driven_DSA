/*
    -> Parking Lot Automitation System
    1 :Create riquired enum
    2 :Vehical Hierarchy creation
    3 :Vehical Factory Creation
    4 :Parking Spot Hierarchy
    5 :Parking Observer
    6 :ParkingFloor Class 
    7 :Parking Display board (Observer)
    8 :ParkingStrategy Class (strategy Pattern)
    9 :pricingStrategy class (strategy Pattern)
    10:PaymentStrategy class
    11:ParkingTicket Class
    12:EntryGAte Class
    13:ExitGAte Class
    14:ParkingLot class (SingleTone Pattern)
    15:Main Classs(Controller)

*/


import java.util.*;
import java.time.Duration;
import java.time.LocalDateTime;

/*///////////////////////////////////////////////////////////////////
     1: Create Enum
            It is used to create fixed constants which are riquired through out the project
*/////////////////////////////////////////////////////

// Repreasents the differrnt tyoe of vehical 
enum VehicalType
{
    BIKE,
    CAR,
    TRUCK

}
// Repreasent different type of parking spot

enum SoptType
{
     BIKE,CAR,TRUCK
}
// Repreasent the current Step of Parking ticket
enum TicketStatus
{
    ACTIVE,
    CLOSED
}


/*///////////////////////////////////////////////////////////////////
     2: Create VehicalClass Hierarchy
     It is used to create multiple type of class which repreasent the type of vehical
     concept : Abstraction , Inheritance, Ploymorphism , encpsulation
*/////////////////////////////////////////////////////

// Class Which repreasent a generic vehical
abstract class Vehical
{
    // Abstracted(Hidden)
    private String vehicalNumber;
    private VehicalType vehicalType;

    // parametrised constructer
    public Vehical(String vehicalNumber,VehicalType vehicalType)
    {
        this.vehicalNumber = vehicalNumber;
        this.vehicalType = vehicalType;
        
    }

    // below 2 methods are concereate getr method
    public VehicalType getVehicalType()
    {
        return this.vehicalType;

    }
    public String getVehicalNumber()
    {
        return this.vehicalNumber;

    }
    // Every concreate class provide its own define
    public abstract void display();
}

// Class which repreasent the vehical type as Bike
class Bike extends Vehical
{
    public Bike(String vehicalNumber)
    {
        // Calls Vehical Class Constructer
        super(vehicalNumber,VehicalType.BIKE);  
    }

    // Method Overriding
    @Override 
    public void display()
    {
        System.out.println("Bike:"+getVehicalNumber());

    }


}

// Class which repreasent the vehical type as Car
class Car extends Vehical
{
    public Car(String vehicalNumber)
    {
        // Calls Vehical Class Constructer
        super(vehicalNumber,VehicalType.CAR);  
    }

    // Method Overriding
    @Override 
    public void display()
    {
        System.out.println("Car:"+getVehicalNumber());

    }


}

// Class which repreasent the vehical type as truck
class Truck extends Vehical
{
    public Truck(String vehicalNumber)
    {
        // Calls Vehical Class Constructer
        super(vehicalNumber,VehicalType.TRUCK);  
    }

    // Method Overriding
    @Override 
    public void display()
    {
        System.out.println("Truck:"+getVehicalNumber());

    }
}


/*///////////////////////////////////////////////////////////////////
     3 : Create VehicalFactory Class
     It is used to create centralize the creation of vehical objects
     concept:Factory Desgin Pattern
*///////////////////////////////////////////////////////////////////
class VehicalFactory
{
    // Create and return the desired class object
    public static Vehical creatVehical(VehicalType type , String number)
    {
        switch(type)
        {
            case BIKE:
                    return new Bike(number);
            
            case CAR:
                    return new Car(number);
            case TRUCK:
                    return new Truck(number);
            default:
                    throw new IllegalArgumentException("Invalid Vehical Type");
        }
    }

}


class program998
{
    public static void main(String A[])
    {




    }
}
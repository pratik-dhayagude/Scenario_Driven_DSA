
enum VehicalType
{
    BIKE,
    CAR,
    TRUCK
}

abstract class Vehical
{
    private String number;

    public Vehical(String number)
    {
        this.number = number;
    }
    public String GetNumber()
    {
        return this.number;
    }
    public abstract void Display();
    


}
class Bike extends Vehical
{
        public Bike(String number)
        {
            super(number);
        }
        public void Display()
        {
            System.out.println("Bike:"+GetNumber());
        }
}
class Car extends Vehical
{
        public Car(String number)
        {
            super(number);
        }
        public void Display()
        {
            System.out.println("Car:"+GetNumber());
        }

}
class Truck extends Vehical
{
        public Truck(String number)
        {
            super(number);
        }
        public void Display()
        {
            System.out.println("Truck:"+GetNumber());
        }


}

class program977
{
    public static void main(String A[])
    {
       Car cobj = new Car("MH12VL9080");
       cobj.Display();
        
       Truck tobj = new Truck("MH12VL9080");
       tobj.Display();

    }

}
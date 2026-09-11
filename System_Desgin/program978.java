/*
    -> Factory
*/
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
class VehicalFactory
{
    public static Vehical createVehicle(VehicalType type , String number)
    {
            switch (type)
            {
                case BIKE:
                    return new Bike(number);
                case CAR:
                    return new Car(number);

                case TRUCK:
                    return new Truck(number);
                    //Default missing error
            }


    }
}
class program978
{
    public static void main(String A[])
    {
      Vehical v1 = VehicalFactory.createVehicle(VehicalType.BIKE,"MH12VL9080");
       Vehical v2 = VehicalFactory.createVehicle(VehicalType.CAR,"MH12VL9080");
       v1.Display();
       v2.Display();

    }

}
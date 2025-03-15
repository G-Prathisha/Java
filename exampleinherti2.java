class vehicle{
    public void drive()
    {
        System.out.println("Repairing a vehicle");
    }
}
class car extends vehicle{
    public void drive(){
     System.out.println("Reparing a car");
}
    }
    public class exampleinherti2{
        public static void main(String[]args){
            vehicle vehicle=new vehicle();
            car car=new car();
            vehicle.drive();
            car.drive();
        }
    }


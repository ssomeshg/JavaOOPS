
abstract class Car{
    // public void drive(); - we didnt asign empty method -- if we assign with abstract class;
    // we can create non abstract method inside a abstract class there is an no issue.
    // without abstract method also abstract class will performs.

    public abstract void drive(); /**abstract methed will be works on abstract class only out of class it doesnt*/
    public abstract void fly();


    public void musicPlayer(){
        System.out.println("Play Music");
    }
}

class BMW extends Car   //Class 'BMW' must either be declared abstract or implement abstract method 'fly()' in 'Car'
{
    @Override
    public void drive(){
        System.out.println("drive");
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }
}

class Audi extends Car
{
    @Override
    public void fly() {
        System.out.println("fly...");
    }

    @Override
    public void drive() {
        System.out.println("Drivee,...");
    }
}


public class Abstract{
    public static void main(String... args){
        Car obj = new BMW(); //here car is an abstract class so we cant initiatted . we can create an object reference;

        obj.musicPlayer();
        obj.drive();
        obj.fly();


        Car obj1 = new Audi();
        obj1.musicPlayer();
        obj1.drive();
        obj1.fly();

    }
}

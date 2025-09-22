
interface Map
{
    // 2 Same time we can create a variable we cant only initiate coz inner interface all variables are default FINAL & STATIC. (int agr;)
    int age = 10;
    String area = "Bengaluru";

    void show();
    void config(); // In interface method cannot have body if want add by default in access modifiers

}


//here what is interface mean a sample diagram or a map to show to how to go but they not able to get you with its a map how to having the app;
// then we can implement how we can go by the instruction it is an realtime example : without initiating all methosa we cant use implements;

class RideOnBike implements Map{
    public void show() {
        System.out.println("in show");
    }

    public void config() {
        System.out.println("in config");
    }
}

public class Interface {

    public static void main(String... argv){
        //Here we can take a referance of Map but cant create obj with map we can create with implement class

        Map obj;
        obj = new RideOnBike();

        obj.show();
        obj.config();

        // Here how we call a variables it not implements by the class it is in interface variable so call directly

        System.out.println(Map.age);
    }
}

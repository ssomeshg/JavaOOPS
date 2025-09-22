class Laptops{
    String model;
    Integer price;


    public String toString(){
        return model + ":" + price ;
    }
}

public class ObjectClass {
    public static void main(String... args){
        Laptops obj = new Laptops();
        obj.model = "Lenovo";
        obj.price = 20000;

        System.out.println(obj.toString());
    }
}

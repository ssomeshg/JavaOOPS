class Calc{
    public final void show(){ //No one can override your method
        System.out.println("Show from Calc");
    }

}
class AdvCal extends Calc{
    public void shows(){
        System.out.println("From Adv Calc");
    }
}

// if use final keyword to the class we cant extend to subclass;
public class FinalMethods {
    public static void main(String... argv){
        Calc obj = new Calc();
        obj.show();
    }
}

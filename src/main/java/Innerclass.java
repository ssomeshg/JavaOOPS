class Outer{
    int i = 1;

    public void show(){
        System.out.println("outer Method");
    }
    class Inner{
        public void innerShow(){
            System.out.println("Inner Showw...");
        }
    }
}


public class Innerclass {

    public static void main(String... argv){
        Outer obj = new Outer();
        obj.show();

        Outer.Inner obj1 =  obj.new Inner(); 
        obj1.innerShow();
    }

}

class A{
    public void show(){
        System.out.println("Show A");
    }
}
class B extends A{
    public void show1(){
        System.out.println("show B");
    }
}



public class TypeCasting {

    public static void main(String... argv){

        double d = 4.5;
        int i = (int) d;


        A obj = /** (A) already know its so no need to mention that*/ new B(); /**for in real world we know what you parent doing but parent doesnt know what your doing
                                                                               ,same subclass extend with super then they know . but super class doesnt..*/
        obj.show(); //upcasting
        /** obj.show1(); we cant call it coz obj refer to A parent . parent desnt now child what doing */

        B obj1 = (B) obj;  //downcasting
        obj1.show1();



                

    }
}

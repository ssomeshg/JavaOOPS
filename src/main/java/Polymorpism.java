
class Computer{
 public void show(){
     System.out.println("In Computer");
 }
}
class Laptop extends Computer{
    public void show(){
        System.out.println("In Laptop");
    }
}

public class Polymorpism {

    public static void main(String... argv){
        Computer obj1 = new Laptop();
        obj1.show();
    }

  // ----------- Definition ----------------//
  /* *
   *  Polymorphism -- (Poly - Many) (morphism - behaviour) - We can behave in particular situtation is different ex in home and office and frinds like wise
   *  Here is :->
   *  Compile time - Early Binding
   *      OverLoading - add(int,int) add(int,int,int) - compile time will chose
   *  Run time  - Late binding
   *       overriding - add(int,int) add(int,int)
   * */
}

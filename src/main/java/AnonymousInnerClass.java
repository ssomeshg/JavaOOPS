
class Q{
    public void show(){
        System.out.println("Show Q");
    }
}
/** class W extends Q{
    public void show(){
        System.out.println("Show W");
    }
}
 we can create but we cant call as Q..

*/
// If you want to create a inner class without creating class using creating object creation is known as anonymous class;;



    // ============= Abstract anonympus Class =========
abstract class AbstractAnonymous{
    public abstract void show();
    public abstract String config();
}

//class Ba extends AbstractAnonymous{
//    @Override
//    public void show() {
//        sout(======== we can create like this we create anonymous =======)
//    }
//}

public class AnonymousInnerClass {
    public static void main(String... argv){

        Q obj = new Q(){
            public void show() {
                System.out.println("From New Show == Annonumous class");
            }
        };

        obj.show();


//        ========= Abstract Anonymous=======//

        AbstractAnonymous obj1 = new AbstractAnonymous(){
            public void show() {
                System.out.println("Using Anonymous for abstract class");
            }

            @Override
            public String config() {
                return "Abstract String Return";
            }
        };
        obj1.show();
        String as = obj1.config();
        System.out.println(as);
    }
}

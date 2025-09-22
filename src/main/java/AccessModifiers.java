import org.example.Main;

public class AccessModifiers {
    public int mark = 10;
    private int id = 98575;


    public static void main(String... argv){

        //---------- PUBLIC -----------------//
        Main obj = new Main();
        // System.out.println(obj.m); ------ Public -> * public is it can be access from any where . in the same package no need to use

        AccessModifiers obj1 = new AccessModifiers();
        System.out.println(obj1.mark);

        //---------- PRIVATE -----------------//
        System.out.println(obj1.id); //use same classes but cant access other packages


        // ------------- TABLE --------------//
        /**
                                PRIVATE    PROTECTED    PUBLIC   DEFAULT

         Same Class              Yes         *Yes        *Yes       *Yes

         Same Package            No          *Yes        *Yes       *Yes
         subclass

         Same Package            No          *Yes        *Yes       *Yes
         non-subclass

         Different package       No          *Yes        *Yes        No
         subclass

         Different package       *No          *No       Yes        No
         non-subclass

        */
    }

}

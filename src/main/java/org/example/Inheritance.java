package org.example;

class Calc{  //Parent - Super - Base classes
    public int add(int a,int b){
        return a+b;
    }
}
class AdvCal extends Calc{  // Child - Sub - Derived Classes add extra futures includes base class futures
    public int sub(int a,int b){
        return a-b;
    }
}

//-------------- Multiple inheritance -----------------------//
class VeryAdvCal extends AdvCal{
    public int pow(int a, int b){
        return (int) Math.pow(a,b);
    }
}


// a class have a basic feature and the extra featues may have the another classes called inheritance;
public class Inheritance {
    public static void main(String... argv){
        VeryAdvCal obj = new VeryAdvCal();

        int v1 = obj.add(10,56);
        int v2 = obj.sub(10,5);

    //multipleInheritance
        int v3 = obj.pow(7,5);

        System.out.println(v1 + " " + v2 + " " + v3 );
    }
}

package org.example;

class A{
    public A(){
        System.out.println("In A");
    }
    public A(int n){
        System.out.println("In A parameter " + n);
    }
}
class B extends A{
    public B(){
        System.out.println("In B");
    }
    public B(int n){
        super(n);
        System.out.println("In B parameter");
    }
}

public class SuperDemo {
   public static void main(String... argv){
       B obj = new B(5);
   }
}

// Basically every constructor have Super() method but it is invisible..
// * If you want to pass the parameter to the super class use Super(parameters)
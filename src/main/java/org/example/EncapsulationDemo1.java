package org.example;

class Human{
    private int age = 11;
    private String name = "navin";

    //get and set --- if we need to share


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationDemo1 {
    //Encapsulation eg: Assume that we are human we know our name and age in our own brain ok we only know that data no one can access
    //our brain as well as let some one want they can call if we need to tell only they can know otherwise they wont same concept here.!!

    public static void main(String[] args) {
        Human obj = new Human();
        //obj.age = 20; -----> we cant access it directly

        obj.setAge(24);
        obj.setName("Reddy");

        System.out.println(obj.getName() + " : "  +obj.getAge());
    }
}

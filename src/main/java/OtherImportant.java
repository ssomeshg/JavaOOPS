public class OtherImportant {
    public static void main(String... args){
        //========== Wrapper Class ==============//
        int num = 15; //int is a primitive data types with class
        Integer num1 = num; //Integer is a class extends with object class; auto-boxing

        int num2 = num1.intValue();
        int num3 = num1; //auto-unboxing

        System.out.println(num2);

        String str = "2";
        int num5 = Integer.parseInt(str);
        System.out.println(num5*2);


    }
}

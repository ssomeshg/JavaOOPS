package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int m = 10;
    public static void main(String[] args) {
        int [][]a= {{5,2,6,8,66},{54,54,87,36},{12,548,65,845}};
        for(int[] i:a){
            for(int value : i){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }


}
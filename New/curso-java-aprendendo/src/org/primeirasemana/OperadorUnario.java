package org.primeirasemana;

public class OperadorUnario {
    public static void main(String[] args) {
        int num = 1;
        System.out.println(- num);//-1
        
        System.out.println(num);//1

        num = -num;
        System.out.println(num);//-1

        num = num * -1;
        System.out.println(num);//1
    }
}

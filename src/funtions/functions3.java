package funtions;
//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class functions3 {

    public static int greater(int a ,int b ){
        if(a<b){return b;}
        return a;
    }

    public static void main(String[] args) {
        int a ,b;
 Scanner sc=new Scanner(System.in);
        System.out.print("enter A ");
        a=sc.nextInt();
        System.out.print("enter B ");
        b=sc.nextInt();
        System.out.println( "the Greater no is "+greater(a,b));
    }
}

package funtions;
import java.util.*;
//Enter 3 numbers from the user & make a function to print their average.
public class functions {
    public static int getData(){
        int a,b,c;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter X : ");
        a=sc.nextInt();
        System.out.print("enter Y : ");
        b=sc.nextInt();
        System.out.print("enter Z : ");
        c=sc.nextInt();
        return a+b+c;
        }

    public static float  average(int x){
        return x/3;
    }
    public static void main(String[] args) {


       int numi= getData();
        System.out.println("ans is ");
        System.out.println(average(numi));

    }
}

package funtions;
//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
import java.util.*;

public class functions6 {

    static void inputxn(){
        int x,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Program running");
        System.out.println("Enter X  ");
        x=  sc.nextInt();
        System.out.println("Enter n  ");
        n=  sc.nextInt();
        double result =powercal(x,n);
        System.out.println("The Power of "+x+" Power "+n+" is "+result);
    }
    static double powercal( int x,int n){
        double result  = Math.pow(x,n);
        return result;
    }

    public static void main(String[] args) {
        inputxn();
    }

}

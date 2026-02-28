package funtions;
import java.util.Scanner;
//Write a function to print the sum of all odd numbers from 1 to n.

public class functions2 {
public static int calculator(int n){
    int ans=0;
    for (int i=1;i<=n;i++){
        if(i%3==0){
            ans+=i;
        }

    }
return ans;
}

    public static void main(String[] args) {
    int n;
        System.out.print("Enter N ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt() ;

        System.out.println(calculator(n));
    }
}

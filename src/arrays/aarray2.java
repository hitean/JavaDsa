package arrays;
import java.util.Scanner;

public class aarray2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter size of array");
        int size=sc.nextInt();
        int []num=new int[size];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(num[i]);
        }
    }
}

package arrays;
import java.util.*;

public class arrays3 {
// Take an array from the user
//Take a number x
//Search for x in the array
//Print the index where it occurs
public static void main(String[] args) {
    System.out.print("Enter the size of the array");
    Scanner sc=new Scanner(System.in);
    int size =sc.nextInt();
    int []num=new int [size];

    for(int i=0;i<size;i++){
        System.out.print("Enter the "+i+" position of the array");
         num[i]=sc.nextInt();
    }

    System.out.println("Enter the no. you want to find: ");
    int x= sc.nextInt();
    for(int i=0;i<size;i++){
        if(num[i]==x){
            System.out.println("X is found at "+i+" position");
        }
    }
}
}

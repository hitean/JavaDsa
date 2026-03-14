package arrays;

import java.util.Scanner;

//Count frequency of a given number.
public class arrays11 {

    public static void main(String[] args) {
        int [] nums ={1,2,2,4,4,6,6,6,9};
        int  occur=0;
        Scanner sc=new Scanner(System.in);
        int target =sc.nextInt();


        for(int i :nums){
            if (target==i){
                occur++;
            }
        }
        System.out.println("the no of time the entered element occur is "+occur );
    }


}

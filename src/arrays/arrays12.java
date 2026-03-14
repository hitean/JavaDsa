package arrays;

import java.util.*;
public class arrays12 {

        public static void main(String[] args) {

            int square=0,curely=0,round=0;

        String [] elements={"[","{","{","}","(",")"};
        for (String i:elements){
            if(i=="["){
                square++;
            }
            if(i=="]"){
                square--;
            }
            if(i=="("){
                round++;
            }
            if(i=="{"){
                curely++;
            }
            if(i=="}"){
                curely--;
            }
            if(i==")"){
                round--;
            }



        }
        if(round%2==0){
            System.out.println("vaild round brackets");
        }
            if(curely%2==0){
                System.out.println("vaild curely brackets");
            }
            if(square%2==0){
                System.out.println("vaild square brackets");
            }
    }

}

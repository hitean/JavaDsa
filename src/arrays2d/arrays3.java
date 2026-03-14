package arrays2d;

import java.util.Scanner;

//Find the sum of all elements in a 2D array.
public class arrays3 {
    public static void main(String[] args) {
        int [][] matrix=new int[4][5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                System.out.print("enter the element "+i+" "+j+" "+"place: ");
                matrix[i][j]=sc.nextInt();
            }}

        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");}
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++) {
                sum=sum+matrix[i][j];

            }
        }

        System.out.println(sum);
    }




}


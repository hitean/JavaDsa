package arrays2d;

import java.util.Scanner;

//Find the largest element in a 2D array.
public class arrays4 {
    public static void main(String[] args) {
        int [][] matrix=new int[4][5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                System.out.print("enter the element "+i+" "+j+" "+"place: ");
                matrix[i][j]=sc.nextInt();
            }}
    int largest=0;
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++) {
                System.out.print(matrix[i][j]+" ");
                if(matrix[i][j]>largest){largest=matrix[i][j];}
            }
            System.out.println("");
    }

        System.out.println(largest);

}}

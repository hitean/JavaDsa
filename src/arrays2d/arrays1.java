package arrays2d;

import java.util.Scanner;

public class arrays1 {
    public static void main(String[] args) {
        // declaration type[][] name=new type[row size][col size]
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
        }
    }

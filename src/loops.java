import java.util.*;

public class loops {
    public static void main(String[] args) {
        for(int counter=0;counter<5;counter++){
            System.out.println("hello"+counter);
        }
        int i=1;
        while(i<5){
            System.out.println("while loop counter"+i);
            i++;
        }

        System.out.print("let sum the n natural no ");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of natural no");
        int n = sc.nextInt();
        int sum=0;
        for(int x=1;x<=n;x++){
            sum = sum+x;
            System.out.println(sum);
        }
        System.out.println("the total of no is "+sum);
    }
}
